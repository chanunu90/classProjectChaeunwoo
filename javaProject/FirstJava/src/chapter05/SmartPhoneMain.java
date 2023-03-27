package chapter05;

public class SmartPhoneMain {

	public static void main(String[] args) {

		// SmartPhone 클래스의 인스턴스를 만들어서 프로그램을 완성
		SmartPhone sp = new SmartPhone(7.8f);
		System.out.println(sp.color);
		System.out.println(sp.size);
		
		System.out.println();
		
		SmartPhone sp2 = new SmartPhone();
		sp2.color = "RED";
		sp2.size = 4.0f;
		System.out.println(sp2.color);
		System.out.println(sp2.size);
		
		sp = sp2;
		
		System.out.println();
		
		System.out.println(sp.color);
		System.out.println(sp.size);
		System.out.println(sp2.color);
		System.out.println(sp2.size);
		
	}

}
