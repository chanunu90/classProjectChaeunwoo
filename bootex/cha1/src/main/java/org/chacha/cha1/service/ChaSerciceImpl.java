package org.chacha.cha1.service;

import java.util.List;

import org.chacha.cha1.dto.Dto;
import org.chacha.cha1.mappers.Boader;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChaSerciceImpl implements ChaService{

    private final Boader boader;

    @Override
    public List<Dto> selectList() { 
        
        return boader.select();
    
    }

    
}
