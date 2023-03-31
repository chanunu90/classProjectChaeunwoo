package chapter07;

public class SmartPhoneImpl2 extends Phone{
	
	String model;

	public SmartPhoneImpl2(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}
	
	//오버라이딩을 해부러따. 상위 메소드와 메소드명이 같으면 이걸 오버라이딩 이라고한다.
	//@Override 이걸 써주면 오버라이딩이 가능한건지 상위클레스에 같은명의 메소드가 잘있는지 확인하는거다.
	@Override //이걸 어노테이션 이라고한다. 걍 검수하는 느낌같다.
	void call() {
		super.call();
		System.out.println(model + "이어팟을 이용해서 전화를 합니다.");
	}
	
	void platMusic() {
		System.out.println("음악을 듣습니다.");
	}
	
	
	public static void main(String[] args) {
		
		//다향성 : 상위타입의 참조변수에 다양한 하위타입의 인스턴스를 참조할수 있는것
		Phone p = new SmartPhoneImpl2("010-0000-0000", "IOS");
		p.call();
//		p.platMusic();
		
		//SmartPhoneImpl2 p2 = new SmartPhoneImpl2("000", "test");
		
		SmartPhoneImpl2 p2 = (SmartPhoneImpl2)p;
		
		p2.platMusic();
		
		
	}

}
