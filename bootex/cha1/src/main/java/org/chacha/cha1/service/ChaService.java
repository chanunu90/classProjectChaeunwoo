package org.chacha.cha1.service;

import java.util.List;

import org.chacha.cha1.dto.Dto;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface ChaService {
    
        List<Dto> selectList();

}
