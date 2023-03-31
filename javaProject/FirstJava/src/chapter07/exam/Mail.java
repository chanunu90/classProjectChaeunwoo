package chapter07.exam;

public class Mail extends Person {

	String msg;
	
	public Mail(String name, String personNumber) {
		super(name, personNumber);
		this.msg = "하이!!";
	}

	public Mail(String name, String personNumber , String msg) {
		super(name, personNumber);
		this.msg = msg;
	}
	
	@Override
	public void printGreeting() {
		super.printGreeting();
		System.out.println(msg);
	}
	
	
}
