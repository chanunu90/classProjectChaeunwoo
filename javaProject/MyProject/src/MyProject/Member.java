package MyProject;

public class Member {

	public static void main(String[] args) {
		
		//1. MyProject라는 프로젝트를 생성해봅시다.
		//2. Member 클래스를 생성하고, main()메소드를 만들고 자기 자신의 이름을 출력하는 메소드를 만들어 출력해 봅시다. 
		System.out.println("--------------2번---------------");
		System.out.println("차은우");
		
		//3. Calculator 클래스를 정의해 봅시다.
		int firstNum = 12;
		int secondNum = 6;
		System.out.println("--------------3번---------------");
		//	① 숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
		Plus(firstNum,secondNum);
		//	② 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
		Minus(firstNum,secondNum);
		//	③ 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
		Multiplication(firstNum,secondNum);
		//	④ 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
		Division(firstNum,secondNum);

	}
		
	static void Plus(int a,int b) {
		System.out.printf("2-1 : %d + %d = %d \n",a,b,(a+b));
	}
	
	static void Minus(int a,int b) {
		System.out.printf("2-2 : %d - %d = %d \n",a,b,(a-b));
	}
	
	static void Multiplication(int a,int b) {
		System.out.printf("2-3 : %d * %d = %d \n",a,b,(a*b));
	}
	
	static void Division(int a,int b) {
		System.out.printf("2-4 : %d / %d = %d \n",a,b,(a/b));
	}

}
