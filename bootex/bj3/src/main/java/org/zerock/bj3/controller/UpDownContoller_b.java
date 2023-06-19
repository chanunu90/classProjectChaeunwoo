// package org.zerock.bj3.controller;

// import java.io.File;
// import java.io.IOException;
// import java.nio.file.Files;
// import java.util.UUID;

// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.core.io.FileSystemResource;
// import org.springframework.core.io.Resource;
// import org.springframework.http.HttpHeaders;
// import org.springframework.http.ResponseEntity;
// import org.springframework.util.FileCopyUtils;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.multipart.MultipartFile;
// import org.zerock.bj3.dto.UploadResultDTO;

// import lombok.extern.log4j.Log4j2;
// import net.coobird.thumbnailator.Thumbnailator;

// @RestController
// @Log4j2
// public class UpDownContoller_b {

//     @Value("${org.zerock.upload.path}")// import 시에 springframework으로 시작하는 Value
//     private String uploadPath;

//     @RequestMapping("/upload")
//     public UploadResultDTO upload(MultipartFile multipartFile){


//         UploadResultDTO result = null;

//         String fileName = multipartFile.getOriginalFilename();

//         log.info("fileName: " + fileName);


//         long size = multipartFile.getSize();

//         String uuidStr = UUID.randomUUID().toString();

//         String saveFileName = uuidStr+"_"+fileName;

//         File saveFile = new File(uploadPath , saveFileName);
        
//         try {
//             //파일확장자 체크
//             FileCopyUtils.copy(multipartFile.getBytes() , saveFile);

//             result = UploadResultDTO.builder()
//             .uuid(uuidStr)
//             .fileName(saveFileName)
//             .build();


//             // 이미지 파일 여부 확인
//             String mimeType = Files.probeContentType(saveFile.toPath());

//             log.info("mimeType: " + mimeType);

//             if(mimeType.startsWith("image")){
//             //업로드성공 섬네일
//                 File thumbFile = new File(uploadPath, "s_"+saveFileName);
//                 Thumbnailator.createThumbnail(saveFile, thumbFile, 100, 100);
//                 result.setImg((true));
//             } //end if


//         } catch (IOException e) {

//             e.printStackTrace();

//         }

//         log.info("size: " + size);


//         return result;

//     }



//      @GetMapping("/view/{fileName}")
//     public ResponseEntity<Resource> viewFileGET(@PathVariable String fileName){

//         Resource resource = new FileSystemResource(uploadPath+File.separator + fileName);
//         String resourceName = resource.getFilename();
//         HttpHeaders headers = new HttpHeaders();

//         try{
//             headers.add("Content-Type", Files.probeContentType( resource.getFile().toPath() ));
//         } catch(Exception e){
//             return ResponseEntity.internalServerError().build();
//         }
//         return ResponseEntity.ok().headers(headers).body(resource);


//     }

// }
