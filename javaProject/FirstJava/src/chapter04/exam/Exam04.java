package chapter04.exam;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		//4번.SwitchBreak.java를 switch문이 아닌, if~else를 사용하는 형태로 변경해 보자.
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. >>");
		int key = in.nextInt();

		if(key == 1 ) {
			System.out.println("Simple Java");
		}else if(key == 2) {
			System.out.println("Funny Java");
		}else if(key == 3) {
			System.out.println("Fantastic Java");
		}else{
			System.out.println("The best programming language");
		}
		System.out.println("Do you like coffee?");
	}
}
