package org.zerock.b2.controllr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;
  
@Controller
@Log4j2
@RequestMapping()
public class HelloController {
  
  @GetMapping("hello")
  public void hello(){
    log.info("hello");
  }
    
} 
