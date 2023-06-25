package org.zerock.bj2.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.zerock.bj2.dto.PageRequestDTO;
import org.zerock.bj2.dto.TodoDTO;

public interface TodoMapper {
  
  int insert(TodoDTO todoDTO);

  List<TodoDTO> list(PageRequestDTO pageRequestDTO);

  long listCount(PageRequestDTO pageRequestDTO);

}
