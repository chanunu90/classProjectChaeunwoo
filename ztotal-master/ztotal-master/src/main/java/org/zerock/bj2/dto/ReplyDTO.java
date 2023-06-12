package org.zerock.bj2.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDTO {
  
  private Long tno;
  private Long rno;
  private String reply;
  private String replyer;

  private LocalDate replyDate;
  

}
