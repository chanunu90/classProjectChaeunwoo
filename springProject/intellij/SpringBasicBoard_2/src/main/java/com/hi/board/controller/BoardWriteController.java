package com.hi.board.controller;

import com.hi.board.domain.RequestRegBoard;
import com.hi.board.service.BoardWriteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/board/write")
@Log4j2
public class BoardWriteController {

    @Autowired
    private BoardWriteService writeService;

    @GetMapping
    public void getWriteForm(){
        log.info("GET   /board/write");
    }

    @PostMapping
    public String write(
            RequestRegBoard board,
            HttpServletRequest request
    ){
        log.info("POST   /board/write");
        log.info(board);

        writeService.writeBoard(board, request);

        return "redirect:/board/list";
    }

}
