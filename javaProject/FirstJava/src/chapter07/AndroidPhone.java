package chapter07;

public class AndroidPhone extends Phone{
	
	public AndroidPhone(String phoneNumber) {
		super(phoneNumber);
	}

	@Override
	void call() {
		super.call();
		System.out.println("안드로이드 폰입니다.");
	}
	
	
	
	
}
