package org.zerock.bj2.mappers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.bj2.dto.TodoDTO;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class TodoMapperTests {
  
  @Autowired(required = false)
  private TodoMapper todoMapper;


  @Transactional
  @Commit
  @Test
  public void testInsert(){

    Assertions.assertNotNull(todoMapper, "Todo mapper");

    TodoDTO todoDTO = TodoDTO.builder()
    .title("테스트 투두")
    .content("Test Content")
    .writer("user11")
    .dueDate("2023-06-07")
    .build();

    int count = todoMapper.insert(todoDTO);

    Assertions.assertEquals(count, 1);

    log.info("====================");
    log.info(todoDTO.getTno());
    log.info("====================");

  }
}
