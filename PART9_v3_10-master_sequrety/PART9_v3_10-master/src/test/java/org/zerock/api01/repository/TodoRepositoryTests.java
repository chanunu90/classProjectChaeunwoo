package org.zerock.api01.repository;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.api01.domain.Todo;

import java.time.LocalDate;
import java.util.stream.IntStream;


@SpringBootTest
@Log4j2
public class TodoRepositoryTests {

    @Autowired(required = false)
    private TodoRepository todoRepository;

    @Test
    public void testInsert() {

        IntStream.rangeClosed(1,100).forEach(i -> {
            Todo todo = Todo.builder()
                    .title("Todo..." + i)
                    .dueDate(LocalDate.of(2023, (i % 12) + 1, (i % 30) + 1))
                    .writer("user" + (i % 10))
                    .complete(false)
                    .build();
            todoRepository.save(todo);
        });

    }
}
