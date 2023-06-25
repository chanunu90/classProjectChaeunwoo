package com.hi.app.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@ToString
@Getter
public class OrderItem {

    private String itemId;
    private int number;
    private String remark;


}
