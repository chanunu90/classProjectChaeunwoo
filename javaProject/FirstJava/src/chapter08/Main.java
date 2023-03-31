package chapter08;

public class Main {
	
	public static void main(String[] args) {
		
//		AbstractClass abstractClass = new AbstractClass();  //추상클래스는 인스턴스 생성 불가
		NewClass b = new NewClass();
		b.abstractMethod();
		b.instanceMethod();
		b.printData();
		
		
	}
	
	
	
	
}
