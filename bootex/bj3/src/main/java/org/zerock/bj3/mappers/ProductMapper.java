package org.zerock.bj3.mappers;

import java.util.List;

import org.zerock.bj3.dto.PageRequestDTO;
import org.zerock.bj3.dto.ProductListDTO;

public interface ProductMapper {
    
    List<ProductListDTO> getList(PageRequestDTO pageRequestDTO);
    
}
