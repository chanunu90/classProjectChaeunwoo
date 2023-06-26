package org.oneteam.oneteam.service;

import java.util.List;

import org.oneteam.oneteam.dto.BoardDTO;
import org.oneteam.oneteam.mappers.BoardMapper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@Transactional
public interface BoardService {

    List<BoardDTO> boardList(); 

    BoardDTO boardOne(Long bno);
 
}
