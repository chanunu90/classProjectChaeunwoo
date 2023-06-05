import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {

    //bad code - 예외처리않하면 베드코드라고 한다
    public static void main(String[] args) throws Exception {

        // 서버 소켓 준비 포트 필요
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server2 ready");

        // 연결 확인
        while (true){
            Socket client = serverSocket.accept();
            System.out.println(client);

            // 읽기 위하 파일데이터 전송 InputStream 필요
//            InputStream in = client.getInputStream();
            FileInputStream fin = new FileInputStream("C:\\zzz\\copy.jpg");
            OutputStream out = client.getOutputStream();


            byte[] buffer = new byte[1024*8]; //8kb
            long start  = System.currentTimeMillis();

            // 일고 쓰기
            while(true){

//                int data = fin.read();
//                if(data == -1){
//                    break;
//                }
//                out.write(data);

                int count = fin.read(buffer);
                if(count == -1) {break;}
                out.write(buffer,0,count);

            }

            long end  = System.currentTimeMillis();
            System.out.println(end - start);

            fin.close();
            out.close();
            client.close();


        }


    }

}
