package com.hi.todo.controller;

import com.hi.todo.domain.UserRequest;
import jdk.jpackage.internal.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
@RequestMapping("/todo/list")
public class TodoListController {

    @RequestMapping(method = RequestMethod.GET)
    public void getTodoList(

            Model model,
            HttpServletRequest request,
            @ModelAttribute("todoReq") UserRequest userRequest,

            @RequestParam(value = "tno" , defaultValue = "8282") int tno,
            @RequestParam(value = "todo" , defaultValue = "할일 값이없다" , required = false) String todo,
            @RequestParam(value = "duedate" , defaultValue = "날짜 값이없다" , required = false) String duedate,
            @RequestParam(value = "finished" , defaultValue = "true" , required = false) boolean finished

    ){

        log.info("/todo/list  일로 잘 들어왔습니다.");

        userRequest.setTno(tno);
        userRequest.setTodo(todo);
        userRequest.setDuedate(duedate);
        userRequest.setFinished(finished);

        log.info("tno : " + tno);
        log.info("todo : " + todo);
        log.info("duedate : " + duedate);
        log.info("finished : " + finished);

        //테스트 유알엘
        http://localhost:8080/todo/list?tno=5014&todo=%EC%B2%AD%EC%86%8C&duedate=2023/05/11&finished=true
        // view로 결과데이터 공유
        model.addAttribute("todoList" , "리스트");
    }

}
