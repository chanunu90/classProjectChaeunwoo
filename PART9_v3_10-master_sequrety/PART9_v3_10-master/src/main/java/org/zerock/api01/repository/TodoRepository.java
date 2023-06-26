package org.zerock.api01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.api01.domain.Todo;
import org.zerock.api01.repository.search.TodoSearch;

public interface TodoRepository extends JpaRepository<Todo, Long> , TodoSearch {
}
