package chapter04;

public class WhileLoop1 {

	public static void main(String[] args) {
		int num = 0; // 초기식, 반복을 위한 조건에 사용하는 변수, 카운팅용
		
		while (num < 5)
		{
			System.out.println("A : " + num); 
			num++;// num = num + 1 , num += 1
		}

	}

}
