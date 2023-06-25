package org.zerock.bj2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.bj2.dto.PageRequestDTO;
import org.zerock.bj2.dto.PageResponseDTO;
import org.zerock.bj2.dto.TodoDTO;
import org.zerock.bj2.service.TodoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/todo/")
public class TodoController {
  
  private final TodoService todoService;

  @GetMapping("/list")
  public void list(PageRequestDTO pageRequestDTO, Model model){

    PageResponseDTO<TodoDTO> pageResponseDTO
            = todoService.getList(pageRequestDTO);

    model.addAttribute("pageResponseDTO", pageResponseDTO);

  }

  @GetMapping("/read")
  public void read(PageRequestDTO pageRequestDTO, Model model){

    PageResponseDTO<TodoDTO> pageResponseDTO
            = todoService.getList(pageRequestDTO);

    model.addAttribute("pageResponseDTO", pageResponseDTO);

  }
}
