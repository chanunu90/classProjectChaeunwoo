package chapter11;

import chapter08.Phone;
import chapter08.SmartPhone;

public class GenericMethodByType2 {
	
	public void introdyce(MyClass<? super SmartPhone> t) {
		System.out.println("안녕하세요. " + t.toString());
	}
	
	public static void main(String[] args) {

		GenericMethodByType2 byType = new GenericMethodByType2();
		
		MyClass<Phone> class1 = new MyClass<Phone>();
		class1.setVal(new SmartPhone(null, null));		
		
		byType.introdyce(class1);
		
		

		
		
	}
}
