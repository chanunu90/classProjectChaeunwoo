package org.zerock.b4.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.zerock.b4.dto.PageRequestDTO;
import org.zerock.b4.dto.PageResponseDTO;
import org.zerock.b4.dto.ProductDTO;
import org.zerock.b4.dto.ProductListDTO;
import org.zerock.b4.dto.ProductRegisterDTO;

@Transactional
public interface ProductService {

    Integer register(ProductRegisterDTO registerDTO);

    PageResponseDTO<ProductListDTO> list(PageRequestDTO pageRequestDTO);

    ProductDTO get(Integer pno);

    List<String> getImage(Integer pno);

    // 트랜잭션
    // 파라미터 리턴타입 void (특별한 경우가 아닌 이상 성공 / 아니면 예외처리)
    // void modify(DTO);;
    // 기존 첨부파일 DB 내에서 삭제

    // DTO에 있는 첨부파일 DB에 추가

    
}
