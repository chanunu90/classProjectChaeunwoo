package chapter08;

//추상클래스 : 추상메소드를 하나라도 포함하는 클래스 , 미완성 -> 인스턴스 생성 불가! ,상속의 목적
public abstract class AbstractClass {

	int num;
	String name;
	
	// 추상메소드 : 완성되지않은 메소드 {} -> ; abstract 키워드가 필요
	abstract void abstractMethod();
	
	void instanceMethod() {
		abstractMethod();
	}
	
	void printData() {
		System.out.println(name);
	}
}
