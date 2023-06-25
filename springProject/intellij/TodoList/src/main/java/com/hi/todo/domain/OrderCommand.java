package com.hi.todo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Setter
@ToString
@Getter
public class OrderCommand {

    private List<OrderItem> orderItems;
    private Address address;


}
