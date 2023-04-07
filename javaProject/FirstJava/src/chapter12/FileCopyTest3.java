package chapter12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest3 {

	public static void main(String[] args) {
		
		// 원본파일 : 파일 데이터를 읽어와야한다.
		// 복사본 : 원본파일의 데이터를 써야한다!
		// 배열이 아닌 버퍼 클레스로 더 빠르게 간다
		
		try {
			
			InputStream in = new FileInputStream("D:\\test\\test.zip");
			//필터스트림 사용시에는 기본 스트림이 필요!
			BufferedInputStream bin = new BufferedInputStream(in);
			
			OutputStream out = new FileOutputStream("D:\\test\\testcopy2.zip");
			// 필터스트림 사용시에는 기본 스트림이 필요!
			BufferedOutputStream bout = new BufferedOutputStream(out);
			
			int byteData = 0;
			
			//시작합니다.
			while(true) {
				byteData = bin.read(); // 읽기가 끝나면 -1을 반환함
				if(byteData == -1 ) {
				   System.out.println();
				   break;
				}
				//새로운 파일에 데이터를 FileOutputStream으로 기록(쓴다)한다.
				bout.write(byteData);
			}
			
			bin.close();
			bout.close();
			System.out.println("복사가 완료되었습니다.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
