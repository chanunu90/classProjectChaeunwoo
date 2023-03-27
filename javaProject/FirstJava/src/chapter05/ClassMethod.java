package chapter05;

public class ClassMethod {
	
	int iv = 10; // 인스턴스 변수
	static int cv = 30; // 클래스 변수
	
	void printMumber1() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void printNumber2() {
		System.out.println("Class Method");
		
		ClassMethod asd = new ClassMethod();
		asd.printMumber1();
				
		System.out.println(asd.iv);
	}
	
	public static void main(String[] args) {

		ClassMethod.printNumber2();
	}
	
}
