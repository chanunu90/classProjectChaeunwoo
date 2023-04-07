package chapter12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest1 {

	public static void main(String[] args) {

		// 원본파일 : 파일 데이터를 읽어와야한다.
		// 복사본 : 원본파일의 데이터를 써야한다!
		try {
			
			InputStream in = new FileInputStream("D:\\test\\test1.txt");
			OutputStream out = new FileOutputStream("D:\\test\\test1복사.txt");
			
			int byteData = 0;
			
			
			while(true) {
				byteData = in.read(); // 읽기가 끝나면 -1을 반환함
				if(byteData == -1 ) {
				   System.out.println();
				   break;
				}
				//새로운 파일에 데이터를 FileOutputStream으로 기록(쓴다)한다.
				out.write(byteData);
			}
			
			in.close();
			out.close();
			System.out.println("복사가 완료되었습니다.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
