package chapter09;

public class Rotto {

	public static void main(String[] args) {
		int[] list = {
				0,0,0,0,0,0
		};
		
		//중복체크
		for(int i = 0; i <= 5; i++ ) {
			for(int j = 0; j <=5; j++) {
				if(i != j) {
					if(list[i] == list[j] || list[i] == 0) {
						list[i] = (int) (Math.random()*6+1);
						i=0;
					}
				}else {
					continue;
				}
			}
		}
		
		//출력
		System.out.println("중복 없는 번호 6자리:");
		for(int i = 0; i <= 5; i++ ) {
			System.out.println(list[i]);
		}
		
	}
		
		
}
