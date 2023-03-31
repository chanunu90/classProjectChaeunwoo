package chapter06;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		int[] scores = new int[15];
//		System.out.println(scores.length);

		scores[0] = (int)(Math.random()*100);
		scores[1] = (int)(Math.random()*100);
		scores[2] = (int)(Math.random()*100);
		scores[3] = (int)(Math.random()*100);
		scores[4] = (int)(Math.random()*100);
		scores[5] = (int)(Math.random()*100);
		scores[6] = (int)(Math.random()*100);
		scores[7] = (int)(Math.random()*100);
		scores[8] = (int)(Math.random()*100);
		scores[9] = (int)(Math.random()*100);
		scores[10] = (int)(Math.random()*100);
		scores[11] = (int)(Math.random()*100);
		scores[12] = (int)(Math.random()*100);
		scores[13] = (int)(Math.random()*100);
		scores[14] = (int)(Math.random()*100);
		
		resultPrint(scores);
	}
	
	//점수를 저장하고 있는 배열을 전달받아 초어점과 평균값을 출력하는 메소드
	static void resultPrint(int[] arr) {
		int sum = 0;
		float avg = 0.0f;
		
		for (int i = 0; i < arr.length ; i++) {
			
			sum+=arr[i];
			System.out.print(i+1 + "번:" + arr[i] + "\t");
			
			if((i+1)%5==0 && i!=0) {
				System.out.println();
			}
		}
		avg = sum/(float)arr.length;
		System.out.println();
		System.out.println("=========================");
		System.out.println();
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
