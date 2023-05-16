package com.hi.app.controller;

import jdk.jpackage.internal.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    public String login(

            HttpServletRequest request,
            RedirectAttributes redirectAttributes

    ){
        log.info("로그인 포스트 ");
        HttpSession session = request.getSession(false);
        session.setAttribute("loginInfo", "Login");


        redirectAttributes.addAttribute("no" , 10);
        redirectAttributes.addAttribute("page" , 13);
        redirectAttributes.addAttribute("type" , "user");


//        Log.info("포스트로으로 잘들어왔다");
        // POST 처리 후 redirect
        return "redirect:/sample/sample1";
        // http://localhost:8080/sample/sample1
    }

}
