package chapter03;

public class Operator15 {

	public static void main(String[] args) {

		int num1 = 2;
		int num2 = 5;
		
		int min = (num1 < num2)               ?             num1 : num2;
		//        (num1 < num2) (if쓰기 싫을떄 한줄에쓸떄 쓰면조으다) true : false;
		System.out.println("작은 수 : " + min);
		
		int max = (num1 > num2) ? num1 : num2;
		System.out.println("큰 수 : " + max);
		
		String result = num1 % 2 == 0 ? "짝수" : "홀수";
		System.out.println("num1은 " + result);
		
		result = num2 % 2 == 0 ? "짝수" : "홀수";
		System.out.println("num2는 " + result);

	}

}
