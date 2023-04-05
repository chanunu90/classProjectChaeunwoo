package chapter10;

import java.util.Scanner;

public class ExceptionTest1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("프로그램을 시작합니다.");
		System.out.println("정수 하나를 입력하세요.");
		int num1 = in.nextInt();
		
		System.out.println("두번째 정수를 입력하세요.");
		int num2 = in.nextInt();
		//if를 이용해서 예외 처리
		if(num1==0||num2==0) {
			System.out.println("0으로 나누기는 불가합니다.");
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		
		System.out.println(num1/num2);
		System.out.println("프로그램을 종료합니다.");
	}
	
}
