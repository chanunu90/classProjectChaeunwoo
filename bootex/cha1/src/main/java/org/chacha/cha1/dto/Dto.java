package org.chacha.cha1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Dto {

    private Integer pno;
    private String pname;
    private int price;
    private boolean status;
    private String regDate;
    private String modDate;




}
