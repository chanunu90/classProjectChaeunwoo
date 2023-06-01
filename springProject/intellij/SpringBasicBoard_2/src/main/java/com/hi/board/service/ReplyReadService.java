package com.hi.board.service;

import com.hi.board.domain.ReplyDTO;
import com.hi.board.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ReplyReadService {

    @Autowired
    private ReplyMapper replyMapper;

    public ReplyDTO getReply(int rno){

        return replyMapper.selectByRno(rno);

    }

}
