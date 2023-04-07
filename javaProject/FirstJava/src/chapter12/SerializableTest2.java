package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest2 {

	public static void main(String[] args) {
		
		ObjectInputStream InputStream = null;
		
		try {
			FileInputStream in = new FileInputStream("instanceData.ser");
			
			InputStream = new ObjectInputStream(in);
			Person person = (Person) InputStream.readObject();
			String newStr = (String) InputStream.readObject();
			
			
			person.tell();
			System.err.println(newStr);
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		

		
		
	}

}
