package com.hi.app.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Report {


    private String snum;
    private String sname;
    private MultipartFile report;


}
