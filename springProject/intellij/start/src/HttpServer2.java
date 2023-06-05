import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HttpServer2 {

    //bad code
    public static void main(String[] args) throws Exception{

        Map<String , String> mimeMap = new HashMap<>();
        mimeMap.put("jpg" , "image/jpeg");
        mimeMap.put("html" , "text/html");

        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Ready............................");
        for (int i = 0; i < 100; i++) {

            Socket client = serverSocket.accept();
            System.out.println(client);

            InputStream in = client.getInputStream();

            Scanner scanner = new Scanner(in);
            String firstLine = scanner.nextLine();

            System.out.println(firstLine);

            String[] arr = firstLine.split(" ");

            // /m1.jpg
            String fielName = arr[1];
            String suffix = fielName.substring(fielName.lastIndexOf(".") + 1);

            System.out.println(suffix);
            System.out.println("--------------------------------");
            System.out.println(arr);

            OutputStream out = client.getOutputStream();

//            File file = new File("C:\\zzz\\test.jpg");
            File file = new File("C:\\zzz"+fielName);
            long size = file.length();

            //http헤더부분
            out.write(new String("HTTP/1.1 200 OK\r\n").getBytes());

            out.write(new String("Cache-Control: private\r\n").getBytes());
//            out.write(new String("Content-Length: "+size+"\r\n").getBytes());

            out.write(new String("Content-Type: "+ mimeMap.get(suffix)  +"\r\n\r\n").getBytes());

            FileInputStream fin = new FileInputStream(file);

            byte[] buffer = new byte[1024*8];

            while(true){
                int count = fin.read(buffer);

                if(count == -1){break;            }
                out.write(buffer , 0 , count);

            }


            //http헤더부분 끝
            in.close();
            out.close();
            client.close();
            
        } //end for

    }

}
