package chapter12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {

		char[] cBuf = new char[10];
		int readCnt = 0;
		
		try {
			
			Reader in = new FileReader("D:\\test\\test-text.txt");
			
			
			while(true) {
				readCnt = in.read(cBuf);
				if(readCnt == -1) {
					break;
				}
				System.out.println(cBuf);
			
			}
			in.close();
			System.out.println("읽기 완료");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
