import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Main {

    //bad code
    public static void main(String[] args) throws Exception {


        URL url = new URL("https://cdn.011st.com/11dims/resize/600x600/quality/75/11src/product/4309405722/B.jpg?630000000");
        URL url1 = new URL("https://img.megabox.co.kr/SharedImg/2023/05/07/XbkZesk2KFfQbbagfMtyp8rVUWi8568M_420.jpg");


        InputStream fin = url1.openStream();


//        FileInputStream fin = new FileInputStream("C:\\zzz\\test.jpg");
        System.out.println(fin);


        FileOutputStream fos = new FileOutputStream("C:\\zzz\\copy5.jpg");
        System.out.println(fos);


        //2 - 읽고 쓰기
         while(true) {

            int data = fin.read();
            System.out.println(data);

            if(data == -1){
                break;
            }
            fos.write(data);


         }// end while
        fin.close();
        fos.close();

    }

}