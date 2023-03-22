package chapter02;

public class Casting1 {

	public static void main(String[] args) {

		double d = 100.0;
//		System.out.println("d = " + d);
		
		int i = 100;
		int result = i + (int)d; //d 를 형변환 해줘야 연산됨 (int)이런걸 캐스팅 연산자라고함
		int result2 = (int)(i + d);
		
		
		System.out.println("d = " + d);
		System.out.println("i = " + i);
		System.out.println("result = " + result);
		System.out.println("result2 = " + result2);
		
	}

}
