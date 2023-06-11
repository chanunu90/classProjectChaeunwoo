package org.zerock.bj2.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.bj2.dto.PageRequestDTO;
import org.zerock.bj2.dto.PageResponseDTO;
import org.zerock.bj2.dto.TodoDTO;
import org.zerock.bj2.mappers.TimeMapper;
import org.zerock.bj2.mappers.TodoMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class TodoServiceImple implements TodoService{
  
  private final TimeMapper timeMapper;
  private final TodoMapper todoMapper;

  @Override
  public PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO) {
    
    List<TodoDTO> list = todoMapper.list(pageRequestDTO);
    long total = todoMapper.listCount(pageRequestDTO);

    return PageResponseDTO.<TodoDTO>withAll()
    .list(list)
    .total(total)
    .build();

  }
  
}
