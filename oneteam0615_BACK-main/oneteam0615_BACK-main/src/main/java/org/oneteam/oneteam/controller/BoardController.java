package org.oneteam.oneteam.controller;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.oneteam.oneteam.dto.BoardDTO;
import org.oneteam.oneteam.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/board/")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("list")
    public void list(Model model){
        

        // List<BoardDTO> list = IntStream.rangeClosed(1, 10).mapToObj(i -> {

        //     return BoardDTO.builder()
        //     .bno((long)i)
        //     .title("AAAA")
        //     .build();

        // }).collect(Collectors.toList());

        List<BoardDTO> list = boardService.boardList();

        
    
        model.addAttribute("list", list);



        log.info("ddddd");
    }





    @GetMapping("read/{bno}")
    public String read(
        @PathVariable("bno") Long bno,
        Model model
    ){


        BoardDTO boardOne = boardService.boardOne(bno);


        log.info("read");



        model.addAttribute("boardOne", boardOne);



        return "/board/read";
    } 
    
    @GetMapping("modify/{bno}")
    public String modify(
        @PathVariable("bno") Long bno
    ){

        log.info("Modify");

        return "/board/modify";
    } 

    @GetMapping("add/{bno}")
    public String add(
        @PathVariable("bno") Long bno
    ){

        log.info("add");

        return "/board/add";
    } 

    
}
