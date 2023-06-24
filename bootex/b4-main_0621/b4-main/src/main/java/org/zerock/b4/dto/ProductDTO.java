package org.zerock.b4.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {
    

    private Integer pno;
    private String pname;
    private int price;
    private boolean status;

    private String regDate , modDate;
    
    private List<String> fileNames;


}
