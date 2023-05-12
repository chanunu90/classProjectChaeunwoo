package com.hi.todo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
//@Getter
@Setter
@ToString
public class UserRequest {

    private int tno;
    private String todo;
    private String duedate;
    private boolean finished;


    public int getTno() {
        return tno;
    }

    public String getTodo() {
        return todo==null ? "no task" : todo ;
//        return todo;
    }

    public String getDuedate() {
        return duedate;
    }

    public boolean isFinished() {
        return finished;
    }
}
