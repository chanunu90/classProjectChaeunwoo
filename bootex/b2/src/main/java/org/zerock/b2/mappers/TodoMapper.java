package org.zerock.b2.mappers;

import org.zerock.b2.dto.TodoDTO;

public interface TodoMapper {
  
  int insert(TodoDTO todoDTO);

}