package chapter04;

public class IfTest03 {

	public static void main(String[] args) {

		int score = 98;
		if (score >= 90) {
			// 90점 이상
//			System.out.println("A");
			if(score > 96) System.out.println("A+");
			else if(score > 93) System.out.println("A");
			else System.out.println("-A");
		
		} else if (score >= 80) {
			// 90점 이상이 아니고, 80점 이상인 경우
			System.out.println("B");
		
		} else {
			// 90점 이상도 아니고, 80점 이상도 아닌 경우
			System.out.println("C");
		
		}
		
	}

}
