package org.zerock.bj2.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample/")
@Log4j2
public class SampleController {

    @GetMapping({"/hello","/list"})
    public void hello(){
        log.info("sample/hello..................");
    }
}
