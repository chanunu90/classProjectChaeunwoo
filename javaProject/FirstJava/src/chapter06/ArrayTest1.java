package chapter06;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		//배열의 선언
		int[] scores; // 인트타입의 배열인스턴스 주소를 가지는 변수다. 참조변수겠지?
		//배열의 생성 
		scores = new int[10];//힙영역에 저장하는거겠지?
		
		System.out.println(scores.length);
		
		//배열요소의 참조
		//배열 이름[index]
		// index -> 0 ~ (개수(scores.length)-1)

		scores[0] = 110;
		scores[1] = 90;
		scores[2] = 80;
		scores[3] = 73;
		scores[4] = 60;
		scores[5] = 0;
		scores[6] = 41;
		scores[7] = 30;
		scores[8] = 21;
		scores[9] = 10;
		
		//총합
		int sum = 0;
		float avg = 0.0f;
		
		System.out.println(scores[4]);
		System.out.println("------------------------");

		for(int i=0; i < scores.length ; i++) {
			sum+=scores[i];
//			if(scores[i] == 0 ) {
//				System.out.print("값이 없습니다."+ "\t");
//			}else {
//				System.out.print(scores[i]+ "\t");
//			}
			System.out.print(scores[i] == 0 ? "값이 없습니다."+ "\t" : scores[i]+ "\t");
		}
		avg =sum/(float)scores.length;
		System.out.println();
		System.out.println("총점 : " + sum + "\t 평균 : " + avg);
	}

}
