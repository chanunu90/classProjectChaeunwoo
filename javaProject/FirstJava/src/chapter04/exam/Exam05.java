package chapter04.exam;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		//2번
		/*
		 * 다음과 같이 출력이 이루어지도록 작성해보자.
		 * score < 0 이라면 “0 미만” 출력
		 * 0 ≤ score <100 이라면 “0이상 100 미만“ 출력
		 * 100 ≤ score < 200 이라면 “100이상 200 미만“ 출력
		 * 200 ≤ score < 300 이라면 “200이상 300 미만“ 출력
		 * 300 ≤ score 이라면 “300이상 “ 출력
		 */
		
		System.out.println("입력을 해보셈");
		Scanner in = new Scanner(System.in);
		
		int score = in.nextInt();
		
		switch (score/100) {
		case 0: {
			System.out.println("0 이상 100 미만 입니다.");
			break;
		}
		case 1: {
			System.out.println("100 이상 200 미만 입니다.");
			break;
		}
		case 2: {
			System.out.println("200 이상 300 미만 입니다.");
			break;
		}
		default:
			System.out.println("300 이상 입니다.");			
		} 
			
	}

}
