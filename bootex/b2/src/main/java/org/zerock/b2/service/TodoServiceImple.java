package org.zerock.b2.service;

import org.springframework.stereotype.Service;
import org.zerock.b2.mappers.TimeMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
public class TodoServiceImple implements TodoService{
  
  private final TimeMapper timeMapper;
  
}
