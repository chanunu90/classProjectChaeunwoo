package chapter08.phone;

public interface Phone {
	
	// 상수 : 값이 변하지 않는 변수 => 최초 입력후 이후에는 값을 변경 할 수 없다.
	// 인터페이스에는 변수는 상수 형태로만 구성된다.
	public static final int PHONE_NUM_1 = 1;
	// public static final 생략가능 : 인터페이스 에서는 자동 상수적용
	int PHONE_NUM_2 = 2;
	int PHONE_NUM_3 = 3;
	int PHONE_NUM_4 = 4;
	int PHONE_NUM_5 = 5;
	int PHONE_NUM_6 = 6;
	int PHONE_NUM_7 = 7;
	int PHONE_NUM_8 = 8;
	int PHONE_NUM_9 = 9;
	int PHONE_NUM_0 = 0;
	
	//추상 메소드 : 가이드 같은역할
	//call 이라는걸 만들어라 라는 가이드 같은거다.
	//인터페이스에서는 public abstract 이거 생략 가능 
//	public abstract void call();
	void call();
	void turnOn();
	void turnOff();
	
}