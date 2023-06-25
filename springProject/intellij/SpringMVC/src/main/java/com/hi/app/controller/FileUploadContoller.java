package com.hi.app.controller;

import com.hi.app.domain.Report;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@Log4j2
@RequestMapping("/report")
public class FileUploadContoller {

    // get

    @GetMapping("/reportForm")
//  위에꺼랑 같은거다. @RequestMapping(method = RequestMethod.GET)
    public String getReportForm(){

        log.info("getReportForm 겟방식으로 잘들어왔어요.");

        return "report/reportForm";
    }
    
    
    // post : 파일처리 -> 파일 이름확인 ,사이즈, 파일 저장
    // 파일 저장 : 저장 폴더 생성  -> 해당 경로(웹경로) -> 시스템 경로에 파일 저장
    // 이미지를 업로드 -> 웹페이지에서 확인

    @PostMapping("/submit1")
//    @RequestMapping(value="submit1" , method = RequestMethod.POST)
    public String submit1(
            @RequestParam("snum") String snum,
            @RequestParam("sname") String sname,
            @RequestParam("report") MultipartFile report,
            Model model,
            HttpServletRequest request


    ) throws IOException {

        log.info("포스트로 잘들어 와쓰요");

        log.info("이름 : " + sname);
        log.info("학번 : " + snum);
        log.info("파일이름 : " + report.getOriginalFilename());
        log.info("파일 타입 : " + report.getContentType());
        log.info("파일 사이즈 : " + report.getSize());

        model.addAttribute("sname" , sname);
        model.addAttribute("snum" , snum);
        model.addAttribute("fileName" , report.getOriginalFilename());

        // 업로드 경로
        // 서버 경로 /uploadfile/report -> webapp 폴더에 uploadfile  폴더 생성
        
        // 1. 파일을 저장 하고자는 웹경로
        String uploadURI = "uploadfile/report";
        // http://localhost:8080/uploadfile/report 나중에는 서버 경로 기준이기떄문에 이런식이다.

        // 2. 웹 경로(report 폴더) 기반으로 시스템 경로를 얻어와야한다.
        // HttpServletRequest 필요
        String dirRealPath = request.getSession().getServletContext().getRealPath(uploadURI);
        log.info(dirRealPath);

        // 3. 저장 ( 파일의 이름을 변경해서 저장 가능하기때문 )
        // 서버에 이런식으로 이미지 저장해주는거라고 생각하면 된다.
        File newFile = new File(dirRealPath , report.getOriginalFilename());
                                //경로와 , 저장할 파일 이름 넣어준다.
        report.transferTo(newFile);
        log.info(" 파일 저장 완료 ");

        // 4. view 저장 이미지 이름을 공유

        return "report/submit1";
    }


    @PostMapping("/submit2")
    public String submit2(

//            @RequestParam("snum") String snum,
//            @RequestParam("sname") String sname,
//            @RequestParam("report") MultipartFile report,
            Model model,
            MultipartHttpServletRequest request

    ) throws IOException {

        log.info("submit2 포스트로 잘들어 와쓰요");

        //이름,학번,파일
        String sName = request.getParameter("sname");
        String sNum = request.getParameter("snum");
        MultipartFile report = request.getFile("report");

        log.info("이름 : " + sName);
        log.info("학번 : " + sNum);
        log.info("파일이름 : " + report.getOriginalFilename());
        
        //웹 경로
        String uploadURI = "uploadfile/report";
        // 실제 경로
        String dirRealPath = request.getSession().getServletContext().getRealPath(uploadURI);

        // 새로운 파일의 경로를 구해줍시다.
        File file = new File(dirRealPath , report.getOriginalFilename());
        //report 파일을 어디에 저장할꺼냐 라는 뜻이다.
        report.transferTo(file);
        log.info("파일저장 완료");

        model.addAttribute("sname",sName);
        model.addAttribute("snum",sNum);
        model.addAttribute("fileName", report.getOriginalFilename());

        return "report/submit2";

    }

    @PostMapping("/submit3")
    public String submit3(
            Report report,
            MultipartHttpServletRequest request,
            Model model
    ) throws IOException {

        // 파라미터 확인 log
        log.info(report);

        log.info(" 학번 : " + report.getSnum());
        log.info(" 이름 : " + report.getSname());
        log.info(" 파일 이름 : " + report.getReport().getOriginalFilename());

        String uploadURI = "/uploadfile/report";
        // 시스템경로
        String dirRealPath = request.getSession().getServletContext().getRealPath(uploadURI);

        File file = new File(dirRealPath , report.getReport().getOriginalFilename());

        report.getReport().transferTo(file);
        log.info("파일저장 완료");

//        model.addAttribute("sname",report.getSname());
//        model.addAttribute("snum",report.getSnum());
//        model.addAttribute("fileName", report.getReport().getOriginalFilename());
        model.addAttribute("report",report);

        return "report/submit3";

    }

}
