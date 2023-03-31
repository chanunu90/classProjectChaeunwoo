package chapter07;

public class ClassCasting2 {

	public static void main(String[] args) {

		
		AndroidPhone androidPhone = new AndroidPhone("010-2548-5414");
		IPhone iPhone = new IPhone("010-2548-5414");
		
//		if(iPhone instanceof Phone) {
//			
//		}
		
		callByPhone(androidPhone);
		callByPhone(iPhone);
		
	}
	
	//매개변수에 다형성을 적용 -> 추가적인 메소드 생성이 필요없어진다. 
	//메소드를 호출할때 하위요소를 매개변수로 넣어서 던지면 받는쪽에서는 더 큰 조상클레스 매개변수로 변경돼도 알아서 오버라이드 해서 표출된다.
	//완전 꿀잼
	public static void callByPhone(Phone p) {
		p.call();
	}
	
//	public static void callByPhone(AndroidPhone p) {
//		p.call();
//		System.out.println("안드로이드 폰입니다.");
//	}
//	
//	public static void callByPhone(IPhone p) {
//		p.call();
//		System.out.println("아이폰 입니다.");
//	}

}
