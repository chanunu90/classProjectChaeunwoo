package org.zerock.bj2.controller.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.zerock.bj2.controller.ReplyController.DataNotFoundException;

import lombok.extern.log4j.Log4j2;

@RestControllerAdvice
@Log4j2
public class CustomRestControllerAdvice {
  
  @ExceptionHandler(MethodArgumentTypeMismatchException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public Map<String,String> mistype(MethodArgumentTypeMismatchException ex){

    log.info("MethodArgumentTypeMismatchException");

    return Map.of("Error","전달한 데이터 타입 문제");

  }

  @ExceptionHandler(DataNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public Map<String, String> dataNotFound(DataNotFoundException ex){
    return Map.of("Error",ex.getMessage());
  }



  @ExceptionHandler(BindException.class)
  @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
  public ResponseEntity<Map<String, String>> handleBindException(BindException e) {

      log.error(e);

      Map<String, String> errorMap = new HashMap<>();

      if(e.hasErrors()){

          BindingResult bindingResult = e.getBindingResult();

          bindingResult.getFieldErrors().forEach(fieldError -> {
              errorMap.put(fieldError.getField(), fieldError.getCode());
          });
      }

      return ResponseEntity.badRequest().body(errorMap);
  }

}