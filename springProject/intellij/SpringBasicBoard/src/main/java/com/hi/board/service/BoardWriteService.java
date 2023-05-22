package com.hi.board.service;

import com.hi.board.domain.RequestRegBoard;
import com.hi.board.mapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
@Log4j2
public class BoardWriteService {

    @Autowired
    private BoardMapper boardMapper;

    public int writeBoard(
            RequestRegBoard board,
            HttpServletRequest request
    ){

        // 파일이 존재 하면 파일을 저장,
        if (board.getFile() != null && board.getFile().getSize()>0){
            // 웹 경로
            String uri = "/uploadfile/board";
            // 실제경로
            String realPath = request.getSession().getServletContext().getRealPath(uri);

            // 새로운 파일 이름생성 : 중복된 이미지 이름을 중복되지 않도록 처리
            String newFileName = UUID.randomUUID().toString()+board.getFile().getOriginalFilename();

            File newFile = new File(realPath, newFileName);
            try {
                // 파일 저장
                board.getFile().transferTo(newFile);
                // RequestRegBoard filename에 새로운 파일 이름을 저장
                board.setFilename(newFileName);
            } catch (IOException e) {
                //throw new RuntimeException(e);
                log.info("파일 저장 실패...");
            }

        }

        // mapper.insert
        return boardMapper.insertBoard(board);
    }


}
