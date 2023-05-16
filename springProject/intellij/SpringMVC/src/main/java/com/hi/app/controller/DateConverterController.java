package com.hi.app.controller;


import com.hi.app.domain.UserRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@Log4j2
@RequestMapping("/date")
public class DateConverterController {



    @GetMapping
    public String getDateForm(){

        return "dateForm";

    }

    @PostMapping
    public String date(
            LocalDate date,
            UserRequest request
    ){

        log.info("DATE 포스트로 잘들어왔네?");
        log.info("date : " + date);
        log.info("request.getDate() : " + request.getDate());

        return "date";

    }



}
