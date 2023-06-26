package org.zerock.api01.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Table(name = "tbl_todo_api")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private String writer;
    private boolean complete;
    public void changeComplete(boolean complete){
        this.complete = complete;
    }
    public void changeDueDate(LocalDate dueDate){
        this.dueDate = dueDate;
    }
    public void changeTitle(String title){
        this.title = title;
    }
}