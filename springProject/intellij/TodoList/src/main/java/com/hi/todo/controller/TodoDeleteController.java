package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
@RequestMapping("/todo/delete")
public class TodoDeleteController {

    //삭제번호를 받아아서 삭제하고 투두리스트로 다시 돌아가야한다.

    //post : 데이터 받고 -> 삭제 -> list 로 이동
    @RequestMapping(method = RequestMethod.GET)
    public String postTodoDelete(){

        log.info("delete 포스트로 잘들어왔어");



        return "redirect:/todo/list";
    }


}
