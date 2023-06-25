import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientEx2 {

    //bad code - 예외처리않하면 베드코드라고 한다
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.0.154" , 8080);

        InputStream in = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream("C:\\zzz\\server.jpg");


        //계속 읽어서 계속 보내기
        while(true){
            //1바이트 내용물
            int data = in.read();
            // -1 파일을 다읽었다면
            if(data == -1){
                break;
            }
            fos.write(data);
        } //end while

        // 사용했던 자원들을 닫아준다//정리해준다.
        in.close();
        fos.close();
        socket.close();
    }

}
