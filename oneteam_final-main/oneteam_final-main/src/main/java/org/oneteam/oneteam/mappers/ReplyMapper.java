package org.oneteam.oneteam.mappers;

import java.util.List;

import org.oneteam.oneteam.dto.ReplyDTO;



public interface ReplyMapper {

   List<ReplyDTO> boardreplies(Long bno);

   int boardrepliesUpdate(ReplyDTO replyDTO);
    
}
