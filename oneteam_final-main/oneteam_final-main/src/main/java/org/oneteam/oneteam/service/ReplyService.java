package org.oneteam.oneteam.service;

import java.util.List;

import org.oneteam.oneteam.dto.ReplyDTO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ReplyService {


    List<ReplyDTO> boardreplies(Long bno);

    int boardrepliesUpdate(ReplyDTO replyDTO);
    
    
}
