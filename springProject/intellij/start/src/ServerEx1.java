import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx1 {

    //bad code - 예외처리않하면 베드코드라고 한다
    public static void main(String[] args) throws Exception {
        
        // 서버 소켓 준비 포트 필요
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server ready");
        
        // 연결 확인
        for(int i = 0 ;  i < 100 ; i++) {
            Socket clientSocket = serverSocket.accept();
            System.out.println(clientSocket);

            // 읽기 위하 InputStream 필요
            InputStream in = clientSocket.getInputStream();
            FileOutputStream fos = new FileOutputStream("C:\\zzz\\client" + i + ".jpg");
    
            // 일고 쓰기
            while(true){

                int data = in.read();
                if(data == -1){
                    break;
                }
                fos.write(data);

            }
            in.close();
            fos.close();
            clientSocket.close();



            // 3번 읽기
//            System.out.println(in.read());
//            System.out.println(in.read());
//            System.out.println(in.read());

        }






    }

}
