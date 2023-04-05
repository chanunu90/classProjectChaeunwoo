package chapter11;

import chapter08.Phone;
import chapter08.SmartPhone;

public class GenericMethodByType {
	
	public <T extends Phone> void introdyce(T t) {
		System.out.println("안녕하세요. " + t.toString());
	}
	
	public static void main(String[] args) {
		GenericMethodByType byType = new GenericMethodByType();
		
		SmartPhone p = new SmartPhone("010-9245-0660", "IOS");
		
		
		//byType.introdyce(); 이렇게 만들어 두고 타입을 정의해주면 된다.
//		byType.<String>introdyce("1");
		byType.<SmartPhone>introdyce(p);
		byType.introdyce(p);
		
		
//		byType.<Integer>introdyce(5);
//		byType.introdyce("5"); // 앞에 타입을 넣지않아도 데이터 타입에 맞게 알아서 변경한다.
//		byType.introdyce(true);
	}
}
