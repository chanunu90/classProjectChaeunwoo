package com.hi.board.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class RequestModifyRequest {

    private int bno;
    private String title;
    private String content;
    
    // 회원 테이블의 정보를 가지고오면서, 수정하면 안되니까 삭제함
    //private String writer;
    
    private String oldfile;
    private MultipartFile file;
    private String filename;

}
