package chapter04.exam;

public class Exam13 {

	public static void main(String[] args) {
		//	문제 13.
		//	구구단의 짝수 단(2,4,8)만 출력하는 프로그램 작성.
		//	단, 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8 까지 출력
		for(int i = 2; i < 10 ; i*=2){
			for(int j = 1; j < 10 ; j++) {
				System.out.printf(i + "x" + j + "=" + i*j + "\t");
				if(i==j) {
					System.out.println();
					break;
				}
			}
		}

	}
}
