package org.oneteam.oneteam.controller;

import java.io.Console;
import java.util.List;

import org.oneteam.oneteam.dto.BoardDTO;
import org.oneteam.oneteam.dto.ReplyDTO;
import org.oneteam.oneteam.service.ReplyService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/replies/")
public class ReplyController {

    public final ReplyService replyService;

    @GetMapping("list/{bno}")
    public List<ReplyDTO> list(
        @PathVariable("bno") Long bno){

        log.info("차은우 테스트");

        List<ReplyDTO> result =  replyService.boardreplies(bno);

        return result;
    } 


    @PostMapping("modify/{bno}")
    public int modify(
            @RequestBody ReplyDTO replyDTO
        ){

        log.info("차은우 테스트-----------------------------------------------------------------------");

        log.info(replyDTO.getBno());
        log.info(replyDTO.getReply());
        log.info(replyDTO.getReplyer());

        int result =  replyService.boardrepliesUpdate(replyDTO);

        return result;
    }

    
}
