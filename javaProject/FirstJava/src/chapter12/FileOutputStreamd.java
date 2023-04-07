package chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;


public class FileOutputStreamd {

	public static void main(String[] args) {
		
		try {
			
			OutputStream fout = new FileOutputStream("D:\\test\\test1.txt"); // 생성자에 파일 경로를 이용해서 스트림 생성
			
			String str = "HO~!!@";
			byte[] arr = str.getBytes(); // String클래스에서 문자열의 byte 배열을 반환
			
			fout.write(arr);
			fout.close(); // i/o에서는 스트림 사용 후 반드시 닫아준다!!!
			System.out.println("파일에 데이터 쓰기 성공 !");
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
			e.printStackTrace();

		} catch (IOException e) {
			
			System.out.println(e);
			e.printStackTrace();
		
		}
		
	}


}
