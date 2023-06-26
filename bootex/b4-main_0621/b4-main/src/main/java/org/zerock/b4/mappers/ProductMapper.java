package org.zerock.b4.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.zerock.b4.dto.PageRequestDTO;
import org.zerock.b4.dto.ProductDTO;
import org.zerock.b4.dto.ProductListDTO;
import org.zerock.b4.dto.ProductRegisterDTO;

public interface ProductMapper {
    
    List<ProductListDTO> getList(PageRequestDTO PageRequestDTO);

    int insertProduct(ProductRegisterDTO registerDTO);

    // 람다식으로

    int insertImages(List<Map<String,String>> imageList);

    ////////////////
    @Select("select * from tbl_product p where p.pno = #{pno}")
    ProductDTO selectOne(Integer pno);

    @Select("select concat(uuid, '_' , fileName) fileName from tbl_product_image where pno = #{pno} order by ord")
    List<String>  selectImages(Integer pno);

}
