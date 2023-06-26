package org.oneteam.oneteam.service;

import java.util.List;

import org.oneteam.oneteam.dto.ReplyDTO;
import org.oneteam.oneteam.mappers.BoardMapper;
import org.oneteam.oneteam.mappers.ReplyMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService{


    private final ReplyMapper replyMapper;

    @Override
    public List<ReplyDTO> boardreplies(Long bno) {

        List<ReplyDTO> boardreplies = replyMapper.boardreplies(bno);
        
        return boardreplies;
    }

    @Override
    public int boardrepliesUpdate(ReplyDTO replyDTO) {
        
        int result = replyMapper.boardrepliesUpdate(replyDTO);

        return result;
    }


    



   

    


    
}
