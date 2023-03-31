package chapter07;

public class IPhone extends Phone{
	
	public IPhone(String phoneNumber) {
		super(phoneNumber);
	}
	
	@Override
	void call() {
		super.call();
		System.out.println("IPhone 입니다.");
	}
	
	
}
