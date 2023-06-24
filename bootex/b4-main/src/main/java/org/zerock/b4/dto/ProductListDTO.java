package org.zerock.b4.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductListDTO {

  private Integer pno;
  private String pname;
  private int price;
  private boolean status;
  private String fileName;

  
}
