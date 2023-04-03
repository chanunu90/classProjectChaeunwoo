package chapter08.interface0;

public class CalculatorImpl implements Calculator{

	




	@Override
	public long add(long n1, long n2) {
		return n1+n2;
	}

	@Override
	public long sub(long n1, long n2) {
		return n1-n2;
	}

	@Override
	public long mul(long n1, long n2) {
		return n1*n2;
	}

	@Override
	public double div(double n1, double n2) {
		return n1/n2;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Calculator cal = new CalculatorImpl();
		// 인터페이스 구현 => 다향성 
		// 다형성 기능 => 메소드의 매개변수로 선언 가능
		// 인터페이스 타입의 배열도 가능하다.
		
		String Buffer = "차은우";

		//.isEmpty() = 공백일경우 트루 리턴함
		//.length() = 문자의수 리턴함
		//정규식 공부해야함
		
		System.out.println(Buffer.length());
		

		//해당 문자의 위치를 알려줌
		System.out.println(Buffer.indexOf("우"));
		
		//replace 찾은 문자를 수정함
		System.out.println(Buffer.replace("차", "우"));
		
		//대문자로 변경함
		System.out.println(Buffer.toUpperCase());
		
		//trim()"  공백  " 양쪽 공백을 지워버림
		String Buffer2 = "   공백   "; 
		System.out.println(Buffer2.trim());
		
		
		
		
		System.out.println(cal.add(10,5));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
