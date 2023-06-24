package org.zerock.b4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.b4.dto.PageRequestDTO;
import org.zerock.b4.dto.ProductRegisterDTO;
import org.zerock.b4.service.ProductService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {


  private final ProductService productService;

// 1번 겟방식으로 파라미터 담아서 PNO로프로덕트 디티오를 구한다음 모델로 담는다.
  @GatMapping("modify/{pno}")
  public String modifyGet(
    @PathVariable("pno") Integer pno,
    PageRequestDTO pageRequestDTO,
    Model model ){

      //서비스에 상품을 조회해서 모델에 담아준다.



    }


// 2번 가지고온정보를 모디파이페이지에 뿌려주고 

// 3 포스트방식으로 만든다음 모디파이DTO안에 담은 다음
// 4 상품 테이블 수정 다음 기존첨부파일 다지워주고 다시 파일을 추가해준다






  @GetMapping("/list")
  public void list(PageRequestDTO pageRequestDTO , Model model){

    model.addAttribute("res", productService.list(pageRequestDTO));

  }

  @GetMapping("/register")
  public void register(){
    log.info("get product register");
  }

  @PostMapping("/register")
  public String registerPost(
    ProductRegisterDTO registerDTO,
    RedirectAttributes attributes
  ){

    log.info("----------------------");
    log.info(registerDTO);


    Integer pno = productService.register(registerDTO);

    log.info("NEW PNO: " + pno);


    attributes.addFlashAttribute("result" , pno);

    return "redirect:/product/list";
  }

  
}
