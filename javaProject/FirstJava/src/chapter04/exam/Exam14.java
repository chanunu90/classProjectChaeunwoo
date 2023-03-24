package chapter04.exam;

public class Exam14 {

	public static void main(String[] args) {
	//문제 14. 다음 식을 만족하는 조합을 찾는 프로그램 작성. 

		int A = 0;
		int B = 0;
		
		for(int i= 0; i <10 ; i++) {
//			for(int j=0; j < 10 ; j++) {
//				
//				num1 = i*10+j;
//				num2 = j*10+i;
//				
//				if(num1 + num2 == 99) {
//					System.out.println("99가 나오는 수는 " + num1 + "+" + num2);
//				}
//				
//			}
			A = i;
			B = 9-A;
			
			System.out.println("A : " + i + ",B :" + B);
			
		}

	}

}
