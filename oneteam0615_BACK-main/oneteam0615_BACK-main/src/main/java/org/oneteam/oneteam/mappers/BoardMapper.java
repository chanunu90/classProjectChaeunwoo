package org.oneteam.oneteam.mappers;

import java.util.List;

import org.oneteam.oneteam.dto.BoardDTO;

public interface BoardMapper {

    List<BoardDTO> boardList();

    BoardDTO boardOne(Long bno);



    
}
