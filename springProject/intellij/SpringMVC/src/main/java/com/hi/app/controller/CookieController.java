package com.hi.app.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/cookie")
@Log4j2
public class CookieController {

    // /cookie/make
    @RequestMapping("/make")
    public String makeCookie(
            HttpServletResponse response

    ){
        // 여기서 쿠키 만들어준다.
        // 쿠키 생성 -> 응답
        Cookie cookie = new Cookie("userid" , "cool");
        // 경로 설정 :
        cookie.setPath("/"); // 모든경로에 쿠키를 적용하겠다는 의미
        // 쿠키 유지 시간
        cookie.setMaxAge(60*60);
        // 마무리 쿠키생성
        response.addCookie(cookie);

        return "cookie/make";
    }



    @RequestMapping("/view")
    public String viewCookie(
            @CookieValue("userid") String userId,
            @CookieValue(value = "auth" , defaultValue = "not") String auth,
            @RequestHeader("Referer") String referer,
            Model model

    ){
        //만들어진 쿠키를 이런식으로 장난칠수 있다.
        //물론 @CookieValue 를 이용해서 바로 만들어줄수도 있다.
        //

        log.info("GET  /cookie/view");
        log.info("cookie  : userid  = " + userId);
        log.info("cookie : auth = " + auth);


        // 이전페이지 유알엘을 담아준다 이거 완전 중요하다.
        log.info("이전 페이지 : " + referer);


        model.addAttribute("userid" , userId);
        model.addAttribute("auth" , auth);

        return "cookie/view";
    }

}
