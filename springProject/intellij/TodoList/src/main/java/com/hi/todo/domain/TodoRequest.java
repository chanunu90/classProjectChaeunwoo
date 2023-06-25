package com.hi.todo.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class TodoRequest {

    // 파라미터 값을 받아서 저장 할 변수 정의
    // 변수의 이름은 파라미터의 이름과 같이 정의
    // java Beans 형식

    private String todo;
    private String duedate;





}
