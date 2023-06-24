package org.zerock.b5.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/sample")
public class SampleController {

    
    
    // 누구나 볼수 있는 메소드
    @PreAuthorize("permitAll")
    @GetMapping("/all")
    public void doAll(){
        log.info("do All..........");
    }

    // user 권한이 있는 사람만 볼 수 있는 메소드
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public void doUser(){
        log.info("do User..........");
    }

    // g1 권한이 있는 사람만 볼 수 있는 메소드
    @PreAuthorize("hasRole('G2')")
    @GetMapping("/g1")
    public void doG1(){
        log.info("do doG1..........");
    }

}
