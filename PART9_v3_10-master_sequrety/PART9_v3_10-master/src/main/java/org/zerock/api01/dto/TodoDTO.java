package org.zerock.api01.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class TodoDTO {

    private Long tno;
    private String title;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone
            = "Asia/Seoul")
    private LocalDate dueDate;

    private String writer;
    private boolean complete;
}
