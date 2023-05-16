package com.hi.app.domain;

import com.hi.app.formatter.LocalDateFormatter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserRequest {

    private String keyword;
    private int tno;
    private int page;
    private LocalDate date;


}
