package com.hi.board.service;

import com.hi.board.domain.ReplyDTO;
import com.hi.board.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyInsertService {

    @Autowired
    private ReplyMapper replyMapper;

    public int insertReply(ReplyDTO replyDTO){
        return replyMapper.insertReply(replyDTO);
    }


}