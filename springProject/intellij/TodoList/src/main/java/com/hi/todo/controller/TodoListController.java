package com.hi.todo.controller;

import jdk.jpackage.internal.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
@RequestMapping("/todo/list")
public class TodoListController {

    @RequestMapping(method = RequestMethod.GET)
    public void getTodoList(Model model){

        log.info("/todo/list  일로 잘 들어왔습니다.");
    
        // view로 결과데이터 공유
        model.addAttribute("todoList" , "리스트");
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public String postTodoList(Model model){
//
//        log.info("/todo/list  포스트로 들어왔습니다.");
//
//        // view로 결과데이터 공유
//        model.addAttribute("todoList" , "리스트");
//
//        return "/todo/registForm";
//
//    }

}
