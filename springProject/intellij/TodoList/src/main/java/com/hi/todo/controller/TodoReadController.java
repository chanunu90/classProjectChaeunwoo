package com.hi.todo.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
@RequestMapping("/todo/read")
public class TodoReadController {

    @RequestMapping(method = RequestMethod.GET)
    public void getRead(Model model){

        log.info("리드페이지 겟으로 잘들어왔다.");

        model.addAttribute("read","리드 값");


        // 어떤

    }

}
