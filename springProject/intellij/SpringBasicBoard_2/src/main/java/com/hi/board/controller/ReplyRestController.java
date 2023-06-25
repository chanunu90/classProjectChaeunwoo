package com.hi.board.controller;

import com.hi.board.domain.ReplyDTO;
import com.hi.board.service.ReplyInsertService;
import com.hi.board.service.ReplyReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board/reply")
@Log4j2
public class ReplyRestController {

    @Autowired
    private ReplyInsertService insertService;

    @Autowired
    private ReplyReadService readService;

    @PostMapping
    public ResponseEntity<ReplyDTO> insertReply(
            @RequestBody ReplyDTO replyDTO
    ){

        log.info("replyDTO insert 전 >>> " +  replyDTO);
        insertService.insertReply(replyDTO);
        log.info("replyDTO insert 후 >>> " +  replyDTO);

        ReplyDTO result = readService.getReply(replyDTO.getRno());

        // rno
        return new ResponseEntity<ReplyDTO>(result);
    }
}