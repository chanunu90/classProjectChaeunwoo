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
    
    private long rno;
    private long tno;
    
    @Builder.Default
    private long gno = 0L;

    private int step;

    private String reply;
    private String replyer;

    private LocalDate replyDate;
}