package chapter08;

public class NewClass extends AbstractClass{
	//추상클레스를  상속 받으면 추상메소드를 맴버로 가지게 된다! -> 즉 추상클래스가 된다.
	
	@Override
	void abstractMethod() {
		System.out.println("추상메소드를 구현했습니다.");
	}
	
}
