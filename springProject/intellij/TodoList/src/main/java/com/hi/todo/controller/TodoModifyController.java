package com.hi.todo.controller;

import com.hi.todo.domain.ModifyTodoRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
@RequestMapping("/todo/modify")
public class TodoModifyController {

    @RequestMapping(method = RequestMethod.GET)
    public String getTodoList(Model model){

        log.info("모디파이 겟으로  일로 잘 들어왔습니다.");
    
        // view로 결과데이터 공유
        model.addAttribute("modify" , "수정");
        return "/todo/modify";

    }
    
    //post : 데이터 받고 -> 수정 -> list 로 이동
    @RequestMapping(method = RequestMethod.POST)
    public String modify(
            Model model,
            HttpServletRequest request,
            @ModelAttribute("modd") ModifyTodoRequest todoRequest
    ){

        log.info("포스트로 잘들어왔어");

        model.addAttribute("read" , "리드페이지");
        log.info("todoRequest : " + todoRequest);

        return "todo/modify2";
//        return "redirect:/todo/list";
    }

    @ModelAttribute("str")
    public String asd(){
        return "짜라란 공통 메소드 짜란!";
    }


}
