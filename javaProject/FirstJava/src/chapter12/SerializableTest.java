package chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args) {
		// 객체 저장
		Person person = new Person("KING", 20);
		String msg = "안녕하세요.";
		
		ObjectOutputStream outputStream = null;
		
		try {
			
			FileOutputStream fos = new FileOutputStream("instanceData.ser");
			outputStream = new ObjectOutputStream(fos);
			
			outputStream.writeObject(person);
			outputStream.writeObject(msg);
			
			
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
		
		
	}

}
