package chapter04;

public class DoWhileLoop {

	public static void main(String[] args) {
		//do while 은 한번은 무조건 실행함
		int num = 5;
		do {
			System.out.println('A');
			num++;
		} while (num < 5); // 반복의 여부를 판별하는 조건식
	}

}