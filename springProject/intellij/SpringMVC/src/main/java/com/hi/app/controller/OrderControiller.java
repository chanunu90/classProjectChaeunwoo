package com.hi.app.controller;

import com.hi.app.domain.OrderCommand;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
@RequestMapping("/order/order")
public class OrderControiller {

    // get : 입력 폼 화면

    @RequestMapping(method = RequestMethod.GET)
    public String getOrderForm(){
        log.info("GET : /order/orderForm");

        return "order/orderForm";
    }

    // post : 데이터를 받아서 화면에 결과를 출력
    @RequestMapping(method = RequestMethod.POST)
    public String postOrderForm(
            @ModelAttribute("order") OrderCommand orderCommand
    ){

        log.info("POST : /order/order");
        log.info("orderCommand : " + orderCommand);

        return "order/order";
    }



}
