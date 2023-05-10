package com.chacha.chaeunwootest.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class ChaTestController {

    @RequestMapping("/chatest/test1")
    public String Cha1(Model model){

        log.info("Cha1 잘들어옴");
        model.addAttribute("msg" , "안녕하세요.");
        return "/chatest/test1";

    }

}
