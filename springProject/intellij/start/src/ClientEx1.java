import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientEx1 {

    //bad code - 예외처리않하면 베드코드라고 한다
    public static void main(String[] args) throws Exception {
//                                            192.168.0.48
        Socket socket = new Socket("192.168.0.53" , 8080);


        System.out.println(socket);
        
        // 보내려면 OutputStream 이 핑요
        OutputStream out = socket.getOutputStream();
        FileInputStream fin = new FileInputStream("C:\\zzz\\copy.jpg");
        
        //계속 읽어서 계속 보내기
        while(true){
            //1바이트 내용물
            int data = fin.read();
            // 내용물 전승
            out.write(data);

            // -1 파일을 다읽었다면
            if(data == -1){
                break;
            }
        } //end while

        // 사용했던 자원들을 닫아준다//정리해준다.
        fin.close();
        out.close();
        socket.close();


//        out.write(65);
//        out.write(66);
//        out.write(67);

    }

}
