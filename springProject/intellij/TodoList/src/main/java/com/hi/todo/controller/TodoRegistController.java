package com.hi.todo.controller;

import com.hi.todo.domain.TodoRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

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
    public String postTodoRegist(
            Model model,
            HttpServletRequest request,
            String todo,
            String duedate,
            @RequestParam(value = "todo" , defaultValue = "todo널값") String reqTodo,
            @RequestParam(value = "todo" , defaultValue = "todo널값") String reqDuedate,
            TodoRequest todoRequest
    ){

        log.info("포스트/todo/regist 들어왔습니다.");

        log.info("todo : " + todo);
        log.info("duedate : " + duedate);
        log.info("reqTodo : " + reqTodo);
        log.info("reqDuedate : " + reqDuedate);

        // command 클래스 정의 : 파라미터를 받는 변수 선언
        log.info("todoRequest : " + todoRequest);

        model.addAttribute("todo",todo);
        model.addAttribute("duedate",duedate);

        model.addAttribute("reqTodo",reqTodo);
        model.addAttribute("reqDuedate",reqDuedate);

        return "todo/regist";

//        return "redirect:/todo/list";
    }

}
