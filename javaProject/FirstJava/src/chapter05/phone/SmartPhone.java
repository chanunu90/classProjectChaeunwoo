package chapter05.phone;

public class SmartPhone {
	
	String color;
	int volume;
	float size;
	
	//생성자 : 변수를 초기화 해주는 메소드이다.
	//초기화 작업이 없는 경우 생략 가능하다.
	//아래와 같은 생성자 => 기본 생성자

	
	SmartPhone(String color,float size,int volume){
		this.color = color;
		this.volume = volume;
		this.size = size;
	}
	SmartPhone(){
		this("gold",4.5f,5);
//		color = "gold";
//		volume = 5;
//		size = 4.5f;
	}
	
	SmartPhone(String color,float size){
		this(color,size,0); //this() => 다른 생성자 호출 //같은형식의 생성자 호출 여기서는 바로 위에껄 호출해준거다.
//		this.color = color;
//		this.size = size;
//		this.volume = 0;
	}
	
	void call() {
		System.out.println("전화 걸기!");
	}
	
	void volumUp() {
		volume++;
	}
	
	void volumDown() {
		volume--;
	}
	
	
	
	
}
