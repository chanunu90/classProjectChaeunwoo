package org.zerock.bj2.controller;

import org.springframework.stereotype.Controller;
import org.zerock.bj2.service.TodoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@RequiredArgsConstructor
@Log4j2
public class TodoController {
  
  private final TodoService todoService;
}
