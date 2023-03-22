package chapter02;

public class ByteOverFlow {

	public static void main(String[] args) {

		// 우리가 다루어야 하는 데이터의 범위에따라서 타입설정이 달라저야 한다!
		// 0~270
		byte b = 0;
		int i = 0;
		
		// 0 에서 1씩 더해서 270까지 증가
		//for (초기식; 비교식){ 반복해야하는 코드들 }
		for(int x=0 ; x <= 270 ; x++) {
//			System.out.println(x);
			System.out.println(b + "\t" + i);
			b++;
			i++;
		}
		
	}

}
