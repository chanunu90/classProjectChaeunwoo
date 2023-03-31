package chapter08.phone;

public class SmartPhone implements Phone{
	
	boolean power; // false
	
	@Override
	public void call() {
		
		String number1 = String.valueOf(PHONE_NUM_1);
		String number2 = String.valueOf(PHONE_NUM_1);
		String number3 = String.valueOf(PHONE_NUM_9);
		System.out.println(number1+number2+number3+ "에 전화를 합니다.");
		
	}

	@Override
	public void turnOn() {
		
		if(!power) {
			power = true;
			System.out.println("전원을 켭니다.");
		}else {
			power = false;
			System.out.println("전원을 끕니다.");
		}
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
	}
	
	
	public static void main(String[] args) {
		SmartPhone asd = new SmartPhone();
		asd.call();
		asd.turnOn();
	}

}
