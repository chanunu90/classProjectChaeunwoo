package com.hi.app.controller;
import com.hi.app.domain.UserRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
public class SearchController {

    @RequestMapping("/search/search1")
    public String search1(
            HttpServletRequest request,
            @ModelAttribute("req") UserRequest userRequest,
            Model model,
            String keyword,
            @RequestParam(value = "tno" , required = false) String tno,
            @RequestParam(value = "page" , defaultValue = "1") int page
    ){

        log.info("서치1로 잘들어왔어");
        log.info("keyword : " + keyword);
        log.info("tno : " + tno);
        log.info("page : " + page);

        String keywordStr = request.getParameter("keyword");
        String tnoStr = request.getParameter("tno");
        String pageStr = request.getParameter("page");

        log.info("/search");
        log.info("keywordStr : " + keywordStr);
        log.info("tnoStr : " + tnoStr);
        log.info("pageStr : " + pageStr);

        log.info("userRequest : " + userRequest);

        model.addAttribute("result" , keyword + tno);
//        model.addAttribute("tno" , tno);
        model.addAttribute("page" , page);

        return "search/search1";
    }

}
