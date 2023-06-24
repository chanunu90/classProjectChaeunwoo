package org.chacha.cha1.controller;

import org.chacha.cha1.dto.Dto;
import org.chacha.cha1.service.ChaSerciceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/chacha")
public class ChaContoller {

    private final Dto dto;

    private final ChaSerciceImpl chaSerciceImpl;

    @GetMapping("/list")
    public void list( Model model ){
        
        model.addAttribute( "list" ,  chaSerciceImpl.selectList() );

    }   

    
}
