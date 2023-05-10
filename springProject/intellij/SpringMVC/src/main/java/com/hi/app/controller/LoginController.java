package com.hi.app.controller;

import jdk.jpackage.internal.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String loginForm(){
        log.info("겟으로 잘들어왔다");
        return "member/loginForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String login(){
        log.info("/sample/sample3 ... getPage3() ");
//        Log.info("포스트로으로 잘들어왔다");
        // POST 처리 후 redirect
        return "redirect:/sample/sample1";
        // http://localhost:8080/sample/sample1
    }

}
