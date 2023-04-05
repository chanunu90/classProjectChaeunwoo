package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
//		Scanner in = null;
		
		int num1 = 0;
		int num2 = 0;
		
		try {
			System.out.println("프로그램을 시작합니다.");
			System.out.println("정수 하나를 입력하세요.");
			num1 = in.nextInt();
		
			System.out.println("두번째 정수를 입력하세요.");
			num2 = in.nextInt();
			
//		try {
			// try 블록은 예외가 발생 예상되는 코드를 감싸주는 역할
			System.out.println(num1/num2);
			System.out.println("연산이 성공적으로 실행되었습니다.");
		}catch(ArithmeticException e){
			// catch : 예외타입에 따라 예외처리를 해주는 블록
			System.out.println("0으로 나누기는 불가합니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(InputMismatchException e){
			System.out.println("정수만 입력 가능합니다.");
		}catch(Exception e) {
			System.out.println("알수없는 에러가 발생했습니다.");
			System.out.println(e.getMessage());
		}finally {//무조건 실행하는 구문입니다.
			//try블럭으로 진입하게되면 무조건 실행이 되는 구문입니다.
			System.out.println("무조건 실행이 되는 구문입니다.");
			System.out.println("프로그램을 종료합니다.");
		}
		
//		System.out.println("프로그램을 종료합니다.");
		
	}
	
}
