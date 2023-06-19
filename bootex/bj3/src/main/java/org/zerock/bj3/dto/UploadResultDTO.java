package org.zerock.bj3.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadResultDTO {


    // 이 세개는 항상 같이 쓴다.
    private String uuid;
    private String fileName;
    private boolean img;


    public String getLink(){


        if(img){

            return "s_" + uuid +"_" + fileName;

        }



        return "default.jpg";
    }




    
}
