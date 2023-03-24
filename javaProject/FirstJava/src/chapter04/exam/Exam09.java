package chapter04.exam;

public class Exam09 {

	public static void main(String[] args) {
		
		int result = 1;
		
//		문제 9.for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램을 작성
		for(int i =1 ; i <= 10 ; i++) {
			
			System.out.println(result +" x "+ i + "=" +  i*result);
			result *= i;
		}
		
		System.out.println("총합 :" + result);
	}

}
