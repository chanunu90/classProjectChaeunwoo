package chapter09;

public class Rotto {

	public static void main(String[] args) {
		int[] list = new int[6];
		int num = 0;
		
		
		
		for(int i = 0; i <= 5 ; i++) {
			num = (int) (Math.random()*45+1);
			list[i] = num;
//			System.out.println( i + "번쨰 번호 :" + list[i]);
		}
		
		//중복체크
		for(int i = 0; i <= 5; i++ ) {
			for(int j = 0; j <=5; j++) {
				if(i != j) {
					if(list[i] == list[j]) {
//						System.out.println("중복입니다.");
						list[i] = (int) (Math.random()*45+1);
						i = 0;
					}
				}else {
					continue;
				}
			}
//			System.out.println( i+1 + "번쨰 번호 :" + list[i]);
		}
		
		//출력
		System.out.println("중복 없는 번호 6자리:");
		for(int i = 0; i <= 5; i++ ) {
			System.out.println(list[i]);
		}
		
	}
		
		
}
