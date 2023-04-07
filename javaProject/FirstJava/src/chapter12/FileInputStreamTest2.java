package chapter12;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileInputStreamTest2 {
	
	public static void main(String[] args) {
		try {
			InputStream fin = new FileInputStream("D:\\test\\test1.txt");
			
			int i = 0;
			
			//
			while(true) {
				i = fin.read(); // 읽기가 끝나면 -1을 반환함
				if(i == -1 ) {
				   System.out.println();
				   break;
				}
				System.out.print((char)i);
			}
			
			
			fin.close();
			System.out.println("파일의 데이터를 읽어왔습니다.");
			
		} catch (IOException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}
	}
	
}
