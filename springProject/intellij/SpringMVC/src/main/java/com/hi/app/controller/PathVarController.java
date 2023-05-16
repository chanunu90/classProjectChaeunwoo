package com.hi.app.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
//@RequestMapping("/pathVal")
public class PathVarController {




    // 회원 마이페이지 만들떄 이걸로만들면 짱이다.
    @RequestMapping("/members/{type}/{idx}")
    // http://localhost:8080/members/user/10
    public String memberInfo(
            @PathVariable("idx") String idx,
            @PathVariable("type") String type,
            Model model
    ){

        log.info("idx : " + idx);
        log.info("type : " + type);

        model.addAttribute("idx" , idx );
        model.addAttribute("type" , type );

        return "member/info";

    };


}
