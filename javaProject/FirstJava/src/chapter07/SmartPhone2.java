package chapter07;

public class SmartPhone2 extends Phone{
	
	String model;

	//★★★★★상위클래스에 매게변수가 있는 생성자가 있다면 상위클래스의 맴버를 초기화할 데이터까지 받아서 상위클레스의 생성자를 호출해주어야한다.★★
	//현재클레스의 맴버를 초기화한다!
	public SmartPhone2(String phoneNumber,String model) {
		//상위 클레스의 생성자를 먼저 호출
		//super()이놈 괄호있으면 생성자 불러오는거임 그래서 안쪽에서는 생성자와 같은 매개변수값들 들어가야함
		//super(phoneNumber); == Phone(String phoneNumber); 같은거임 super 가 상위 클레스의 생성자 명인거임
		super(phoneNumber);
		//현재클래스의 인스턴스 변수의 초기화
		this.model = model;
	}
	
	void game() {
		super.call();
		System.out.println(model + "게임을 합니다.");
	}
	
	public static void main(String[] args) {
		SmartPhone2 sp2 = new SmartPhone2("010-5687-4123", "아이폰8");
		sp2.game();
	}
	
	
}



