package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
@RequestMapping("/todo/registForm")
public class TodoRegistController {

    @RequestMapping(method = RequestMethod.GET)
    public void getTodoRegist(Model model){

        log.info("/todo/regist 겟 들어왔습니다.");
    
        // view로 결과데이터 공유
        model.addAttribute("todoList" , "리드페이지");
    }


    @RequestMapping(method = RequestMethod.POST)
    public String postTodoRegist(){

        log.info("/todo/regist 들어왔습니다.");

        return "redirect:/todo/list";
    }

}
