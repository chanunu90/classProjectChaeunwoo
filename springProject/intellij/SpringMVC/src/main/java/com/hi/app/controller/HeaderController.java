package com.hi.app.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
public class HeaderController {

    @RequestMapping("/header/check")
    public String headerCheck(

        @RequestHeader("Host") String host,
        @RequestHeader(value = "test" , defaultValue = "not") String test,
        HttpServletRequest request

    ){

        log.info(" /header/check");
        log.info("host : " + host);
        log.info("test : " + test);

        request.setAttribute("Host" , host);
        request.setAttribute("test" , test);

        //모델로도 던질수 있다.
        // model.addAttribute("Host" , host);
        // model.addAttribute("test" , test);


        return "header/check";
    }

}
