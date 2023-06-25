package com.chacha.chaeunwootest.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
@Log4j2
@RequestMapping("/chatest/test1")
public class ChaTestController {

    @RequestMapping(method = RequestMethod.GET)
    public String Cha1(Model model){

        log.info("Cha1 잘들어옴");
        model.addAttribute("msg" , "첫번째 겟 테스트");
        return "chatest/test1";

    }


    @RequestMapping("/chatest/test2") // http://localhost:8080/chatest/test1/chatest/test2 이런식으로 쓰면 이것도 들어가짐 신기방기함
    public String Cha2(Model model){

        log.info("Cha2 테스트");
        model.addAttribute("msg" , "두번쨰 테스트.");
        return "chatest/test1";

    }

    @RequestMapping(method = RequestMethod.POST)
    public String ChaPost(Model model){

        log.info("Cha2 테스트");

        model.getAttribute("password");

        model.addAttribute("msg" , "세번쨰 포스트메소드 테스트");
        return "redirect:/chatest/test1";

    }

}
