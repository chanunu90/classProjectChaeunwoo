package com.hi.app.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
@Log4j2
public class CommonExceptionAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseBody // 응답하는 문자열 그대로 응답으로 사용
    public String exception(Exception exception){

        log.info(exception.getMessage());

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<h1>" + exception.getMessage() + "</h1>");
        stringBuffer.append("<hr>");

        StackTraceElement[] stackTraceElements = exception.getStackTrace();
        for(StackTraceElement element : stackTraceElements){
            stringBuffer.append("<div>" + element + "</div>");
        }

        return stringBuffer.toString();

    }

    @ExceptionHandler(NoHandlerFoundException.class) //이부분이 web.xml에 설정해두었다.
    @ResponseStatus(HttpStatus.NOT_FOUND)
    // 낫파운드 404 에러가 날때 해당 페이지로 이동하도록 하는 건데
    // web.xml에 추가한다.
    public String notFound(){
        return "custom404";
    }

}
