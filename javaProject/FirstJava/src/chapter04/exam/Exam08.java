package chapter04.exam;

public class Exam08 {

	public static void main(String[] args) {

//		문제 8.1000 이하의 자연수 중에서 2의 배수 이면서 7의 배수인 숫자를 출력하고, 그 출력된 숫자들의 합을 구하는 프로그램을 while 문을 이용해서 작성
//		System.out.println("-------");
		int sum = 0;
		int num = 1;
		
		while(num <= 1000) {
			
			
			if(num%2==0 && num%7==0) {
				System.out.println(num);
				sum += num;
			}
			num++;
			
		}
		System.out.println("-------");
		System.out.println("총합 :"+ sum);
		
	}

}
