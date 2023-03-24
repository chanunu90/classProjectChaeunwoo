package chapter04;

public class IfTest5 {

	public static void main(String[] args) {

		// if 구문 내부에 또다른 if 구문이 중첩해서 사용이 가능
		
		// 양수, 음수, 0 판별하는 프로그램
		int number = 10;
		
		if(number > 0) {
			System.out.println("양수");
			if(number%2 == 0) {
				System.out.println("짝수");
			}else{
				System.out.println("홀수");
			}
		}else{
			 if(number < 0) {
				 System.out.println("음수");
			 }else{
				 System.out.println("0");
			 }
		}
		
	}

}
