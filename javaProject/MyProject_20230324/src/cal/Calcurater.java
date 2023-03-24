package cal;

import java.util.Scanner;

public class Calcurater {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
//		Scanner in2 = new Scanner(System.in);
//		Scanner in3 = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 넣어라 >> ");
		long num1 = in.nextLong();
		System.out.println("두번째 숫자를 넣어라 >> ");
		long num2 = in.nextLong();

		
		add(num1,num2);
		bbegi(num1,num2);
		gob(num1,num2);
		nanum(num1,num2);
		
		
		System.out.println("반지름의 길이를 넣어주세요 >> ");
		double r = in.nextDouble();
		
		System.out.println("원의 둘레 : " + call(r));
		System.out.println("원의 넓이 : " + call2(r));
		
		
	}
	
	
	
	
	//① 숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
	//변경 
	//① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
	static void add( long num1, long num2) {
		System.out.println(num1+"+"+num2+"="+(num1+num2) );
	}
	
	//② 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
	//변경 
	//② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
	static void bbegi( long num1, long num2) {
		System.out.println(num1+"-"+num2+"="+(num1-num2) );
	}
	
	//③ 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
	//변경 
	//③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의
	static void gob( long num1, long num2) {
		System.out.println(num1+"x"+num2+"="+(num1*num2) );
	}
	
	//④ 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
	//변경 
	//④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
	static void nanum( float num1, float num2) {
		System.out.println(num1+"/"+num2+"="+(num1/num2) );
	}
	
	//⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
	static double call(double r) {
		return 2*Math.PI*r;
	}
	
	//	⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
	static double call2(double r) {
		return Math.PI*r*r;
	}
	
	
	//	원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
	//	⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
	//	⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드
	//	에 추가해봅시다.

	
}
