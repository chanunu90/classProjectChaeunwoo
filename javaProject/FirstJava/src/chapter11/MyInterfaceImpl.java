package chapter11;

public class MyInterfaceImpl<T1, T2> implements MyInterface<T1, T2>{

	@Override
	public T1 method1(T1 value) {
		
		return value;
	}

	@Override
	public T2 method2(T2 value) {
		
		return value;
	}
	
	
	public static void main(String[] args) {
		
		MyInterface<String, Integer> my = null;
		//my = new MyInterfaceImpl<String, Integer>();
		my = new MyInterfaceImpl<>();  // 참조변수가 이미 타입을 선언해놨으면 생성할떄 타입은 안넣어도 된다.
		
		
		System.out.println(my.method1("문자열"));
		System.out.println(my.method2(10));
		
		
		
	}
	
	
}
