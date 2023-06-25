package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class SampleController {
    @RequestMapping("/sample/sample1") // localhost:8080/sample/sample1
    public void getPage1(){
        log.info("/sample/sample1 ... getPage1() ");
        // void 반환의 겨우 -> view 의 경로는 url 설정 경로로처리
        // return "sample/sample1";
        // /WEB-INF/views/sample/sample1.jsp
    }
    @RequestMapping("/sample/sample2")
    public void getPage2(Model model){
        log.info("/sample/sample2 ... getPage2() ");
        // Model 객체는 View 와 공유하ㅓㄹ 수 있는 데이터를 저장하는 객체
        // 매개변수에 Model model 형식으로 선언해주면 메소드 호출 시에 현재 model 객체를 전달 해준다.!
        model.addAttribute("msg" , "안녕하세요.");
    }


    @RequestMapping("/sample/sample3")
    public String getPage3(Model model){

        log.info("/sample/sample3 ... getPage3() ");
        // Model 객체는 View 와 공유할 수 있는 데이터를 저장하는 객체
        // 매개변수에 Model model 형식으로 선언해주면 메소드 호출 시에 현재 model 객체를 전달 해준다.!
        model.addAttribute("msg" , "반갑습니다.");

        return "sample/sample2";
        // /WEB-INF/views/sample/sapmle2.jsp

    }
}
