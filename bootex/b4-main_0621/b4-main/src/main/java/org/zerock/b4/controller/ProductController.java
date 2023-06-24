package org.zerock.b4.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.b4.dto.PageRequestDTO;
import org.zerock.b4.dto.ProductDTO;
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

    // step1 get방식
    @GetMapping("/modify/{pno}")
    public String modifyGet(
            @PathVariable("pno") Integer pno, PageRequestDTO pageRequestDTO, Model model) {

        ProductDTO dto = productService.get(pno);

        model.addAttribute("dto", dto);

        // 서비스에서 상품 조회, Model에 담아준다
        // todo -> 상품 조회 기능이 없다 -> DTO 필요, Mapper필요, Service필요

        return "/product/modify";
    }

    @GetMapping("/images/{pno}")
    @ResponseBody
    public List<String> getImages(@PathVariable("pno") Integer pno) {

        return productService.getImage(pno);
    }

    // step3 post로 상품 수정
    @PostMapping("/modify/{pno}")
    public String modifyPost(/* DTO */) {
        // DTO를 확인 -> 등록 과정과 동일한 내용 pno존재
        // DTO를 개발

        return null;
    }

    @GetMapping("/list")
    public void list(PageRequestDTO pageRequestDTO, Model model) {
        model.addAttribute("res",
                productService.list(pageRequestDTO));
    }

    @GetMapping("/register")
    public void register() {
        log.info("get product register");
    }

    @PostMapping("/register")
    public String registerPost(ProductRegisterDTO registerDTO, RedirectAttributes rttr) {

        log.info("----------------------");
        log.info(registerDTO);

        Integer pno = productService.register(registerDTO);

        log.info("NEW PNO: " + pno);

        rttr.addFlashAttribute("result", pno);

        return "redirect:/product/list";
    }

}
