package com.hi.board.controller;

import com.hi.board.domain.BoardListPage;
import com.hi.board.domain.BoardSearchOption;
import com.hi.board.service.BoardListService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class BoardListController {

    @Autowired
    private BoardListService listService;

    @RequestMapping("/board/list")
    public void boardList(
            @RequestParam(value = "p", defaultValue = "1") int pageNum,
            /*BoardSearchOption searchOption,*/
            @RequestParam(value = "searchType", defaultValue = "") String searchType,
            @RequestParam(value = "keyword", defaultValue = "") String keyword,
            Model model
    ){

        // http://localhost:8080/board/list?p=1
        // http://localhost:8080/board/list

        log.info("/board/list ...");

        BoardSearchOption searchOption = BoardSearchOption
                .builder()
                .searchType(keyword.trim().length()<1 ? null : searchType)
                .keyword(keyword.trim().length()<1 ? null : keyword)
                .build();

        log.info(">>>>> searchOption : " + searchOption);



        BoardListPage page = listService.getPage(pageNum, searchOption);

        log.info(page);

        //model.addAttribute("list", listService.getBoadList());
        model.addAttribute("page", page);

    }

}
