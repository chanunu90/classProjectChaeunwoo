package chapter04;

import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		
		//시험 점수가 60점 이상일떄 "PASS"를 출력하는 프로그램을 만들기
		//시험 점수 데이터
//		System.out.println("점수 입력하셈 : ");
//		Scanner score = new Scanner(System.in);
//		
		
		int score = 60;
		
		if(score >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("탈락");
		}
		
	}

}
