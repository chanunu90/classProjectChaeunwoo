package chapter07;

public class SmartPhone extends Phone{
	
	// 자식클래스 : 좁은 의미 , 기능의 확장
	
	String model;
	
	public SmartPhone() {
		//기본생성자가 들어감 Phone()
		super();
	}
	
	void game() {
		System.out.println(model + "게임을 합니다.");
	}
	
	
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.phoneNumber = "010-9547-8548";
		sp.call();
		sp.model = "겔럭시50 ";
		sp.game();
		
	}
	
}
