package chapter04;

public class WhileLoop4 {

	public static void main(String[] args) {

		//1~10까지 출력
		int num = 0;
		while (num < 10) {
			num++;
			if(num%2==0) {
				continue;
			}
			//홀수만 출력
			System.out.println(num);
		}
			
	}

}
