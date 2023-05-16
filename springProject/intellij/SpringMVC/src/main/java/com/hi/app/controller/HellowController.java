package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class HellowController{
    @RequestMapping("/hello")
    public ModelAndView hello(){
        // ModelAndView : 응답할 view 경로, view 공유할 결과 data
        ModelAndView mav = new ModelAndView();
        // view에 대한 경로를 설정(지정)
        mav.setViewName("hello"); // /WEB-INF/views/hello.jsp
        
        // service 요청 -> 응답 데이터를 공윺
        mav.addObject("greeting" , "Hello~!!!!");
        // View로 전달한 데이터 설정

        return mav;
    }
}
