package org.zerock.bj2.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.MediaType;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.bj2.dto.PageRequestDTO;
import org.zerock.bj2.dto.PageResponseDTO;
import org.zerock.bj2.dto.ReplyDTO;
import org.zerock.bj2.service.ReplyService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/replies/")
public class ReplyController {

  public static class DataNotFoundException extends RuntimeException{
    
    public DataNotFoundException(String msg){
      super(msg);
    }
    
  }

  private final ReplyService service;

  @PostMapping("{tno}/new")
  public Map<String, Long> register(@PathVariable("tno") Long tno, 
    @Valid  @RequestBody ReplyDTO replyDTO  , BindingResult bindingResult) throws BindException{

    replyDTO.setTno(tno);

    if(bindingResult.hasErrors()){
            throw new BindException(bindingResult);
    }

    Long rno  = service.register(replyDTO);

    log.info(replyDTO);
    
    return Map.of("result", rno);
  }
 
  @GetMapping(value = "{tno}/list" ,produces = MediaType.APPLICATION_JSON_VALUE )
  public PageResponseDTO<ReplyDTO> getReplyList(
    @PathVariable("tno") Long tno, PageRequestDTO pageRequestDTO){
    
    log.info("TNO: " + tno);

    return service.getList(tno, pageRequestDTO);
  }





  
}