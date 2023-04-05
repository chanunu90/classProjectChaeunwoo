package chapter11;

public class MyClass<T> {
	// 타입이 필요한 부분
	// 1.변수 2.메소드의 반환타입 3.매개변수의 타입
	T val;
	
	public MyClass() {
		super();
	}
	
	public MyClass(T val) {
		super();
		this.val = val;
	}

	T getVal() {
		return val;
	}
	
	void setVal(T val) {
		this.val = val;
	}
	
	public static void main(String[] args) {
		
		MyClass<String> mc = new MyClass<String>();
		mc.setVal("따라라랑"); // 객체 생성할떄 만들어진 타입으로만 넣을수 있음으로 잘못된 타입이 들어가지 않도록 컨트롤 가능
		System.out.println(mc.getVal());// 객체 생성할떄 String으로 만들었으니까 String으로만 받고 넣도록 컨트롤한다.
		
		
	}
	

}
