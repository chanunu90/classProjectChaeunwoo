package chapter12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest2 {

	public static void main(String[] args) {

		// 원본파일 : 파일 데이터를 읽어와야한다.
		// 복사본 : 원본파일의 데이터를 써야한다!
		
		try {
			
			InputStream in = new FileInputStream("D:\\test\\test.zip");
			OutputStream out = new FileOutputStream("D:\\test\\testcopy.zip");
			
			int copyByte = 0;
			//카피한 파일의 사이즈
			int byteDataSize = 0;
			//데이터를 담아서 전송할 배열
			byte[] buffdata = new byte[1024*2];
			// 2kb 사이즈의 배열 생성, 데이터를 배열에 저장해서 읽고 쓴다.
			
			System.out.println("파일복사 시작");
			
			while(true) {
				
				byteDataSize = in.read();
				//전달한 배열에 byte 데이터를 담고, 몇개 데이터를 전달하는지 개수를 반환
				if(byteDataSize == -1) {
					break;
				}
				
				//파일에 데이터를 쓴다.
				out.write(buffdata , 0  , byteDataSize);
				copyByte += byteDataSize; // 복사한 파일의 사이즈 증가
				
			}
			
			in.close();
			out.close();
			System.out.println("복사가 완료되었습니다." + copyByte + "byte");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
