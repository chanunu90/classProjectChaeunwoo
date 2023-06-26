
package org.oneteam.oneteam.service;

import java.util.List;

import org.oneteam.oneteam.dto.BoardDTO;
import org.oneteam.oneteam.mappers.BoardMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;



@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    
    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> boardList() {


      List<BoardDTO> list = boardMapper.boardList();

      return list;
    } 


    @Override
    public BoardDTO boardOne(Long bno) {

      BoardDTO boardOne = boardMapper.boardOne(bno);

      return boardOne;
    }

    
 
}
