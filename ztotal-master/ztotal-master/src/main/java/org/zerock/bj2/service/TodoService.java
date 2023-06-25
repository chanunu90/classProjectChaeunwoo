package org.zerock.bj2.service;

import org.springframework.transaction.annotation.Transactional;
import org.zerock.bj2.dto.PageRequestDTO;
import org.zerock.bj2.dto.PageResponseDTO;
import org.zerock.bj2.dto.TodoDTO;

@Transactional
public interface TodoService {
  
  PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);
}



