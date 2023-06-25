package org.zerock.bj2.controller;


import lombok.RequiredArgsConstructor;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.zerock.bj2.dto.ReplyDTO;
import lombok.extern.log4j.Log4j2;


@RestController
@Log4j2
@RequiredArgsConstructor  // 서비스 를 자동으로 주입
@RequestMapping("/replies/")
public class ReplyController {



    @PostMapping(value = "{tno}/new")
    public Map<String , Long> register(@PathVariable("tno") Long tno,
        @RequestBody ReplyDTO replyDTO){

        
        replyDTO.setTno(tno);
        log.info(replyDTO);

        return Map.of("result" , 321L);
    }

    @GetMapping(value = "{tno}/list" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ReplyDTO> getReplyList(@PathVariable("tno") Long tno){

        log.info("TNO : " + tno);

        List<ReplyDTO> result = IntStream.rangeClosed(1,10).mapToObj(i -> {

            return ReplyDTO.builder()
            .rno((long)i)
            .tno(tno)
            .reply("댓글...." + i)
            .replyer("user00")
            .replyDate(LocalDate.now())
            .build();

        }).collect(Collectors.toList());

        return result;

    }

    
}
