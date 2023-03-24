package chapter04.exam;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
		
		System.out.println("비교할 첫번째 숫자를 입력하세요 >>");
        int num1=in1.nextInt();
		System.out.println("비교할 두번째 숫자를 입력하세요 >>");
        int num2=in2.nextInt();
        
        int big = 0, diff = 0;
        if(num1>num2) {
        	big = num1;
        }else {
        	big = num2;
        }
        
        System.out.println("두수중 큰수는 " + big + "입니다.");
        
        if(num1>num2) {
        	diff = num1-num2;
        }else {
        	diff = num2-num1;
        }
        System.out.println("두수의 차는 " + diff + "입니다.");
		
		
	}

}
