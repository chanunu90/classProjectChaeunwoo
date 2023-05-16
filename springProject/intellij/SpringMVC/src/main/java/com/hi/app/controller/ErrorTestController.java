package com.hi.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorTestController {

    @RequestMapping("errortest")
    public String getError(){

        String str = null;
        str.toString();

        return "index";
    }

}