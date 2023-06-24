package org.zerock.b4.dto;

import java.util.List;

import lombok.Data;

@Data
public class ProductRegisterDTO {
  
  private Integer pno;
  private String pname;
  private int price;
  private boolean status;

  private List<String> fileNames;

}
