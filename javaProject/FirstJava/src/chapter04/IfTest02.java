package chapter04;

public class IfTest02 {

	public static void main(String[] args) {
		
		int score = 0;
		score = 50;
		
		if (score >= 60) { 
			// score 변수의 값을 60 이상인지를 비교
			// 60점 이상일 때
			System.out.println("PASS");
		
		} else {
			System.out.println("FAIL");
		}
		
//		if (score < 60) {
//			// score 변수의 값을 60 이상인지를 비교 값이 false 일 때
//			// 60점 이상이 아닐 때 즉, 60점 미만일 때
//			System.out.println("FAIL");
//		}
		
		
		System.out.println();
		
		
		int age = 20;
		
		if (age > 19) { 
			System.out.println("투표가 가능합니다.");
		
		} else {
			System.out.println("아직 투표권이 없습니다.");
		}
		
		System.out.println();
				
		//짝수 홀수 판단하는 프로그램
		int num = 10;
		
		if( num%2 == 0 )     System.out.println("짝수임");
		else if (num%2 == 1) System.out.println("홀수임");
		

	}

}
