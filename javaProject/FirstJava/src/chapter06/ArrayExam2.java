package chapter06;

public class ArrayExam2 {

	public static void main(String[] args) {

		//Student 타입의 배열 10개 생성
		Student[] sd = new Student[10];
		
		sd[0] = new Student("son01", 100, 50, 80);
		sd[1] = new Student("son02", 90, 40, 90);
		sd[2] = new Student("son03", 80, 30, 100);
		sd[3] = new Student("son04", 70, 90, 10);
		sd[4] = new Student("son05", 80, 10, 20);
		sd[5] = new Student("son06", 50, 60, 30);
		sd[6] = new Student("son07", 40, 70, 30);
		sd[7] = new Student("son08", 30, 90, 50);
		sd[8] = new Student("son09", 20, 80, 60);
		sd[9] = new Student("son10", 10, 100, 70);
		
//		for(int i = 0; i < sd.length ; i++) {
//			System.out.println(sd[i].result());
//		}
		System.out.println("이름 \t국어 \t영어 \t수학 \t총점 \t평균");
		System.out.println("============================================================================");
		
		int sumKorScore = 0;
		int sumEngScore = 0;
		int sumMathScore = 0;
		
		for(Student a : sd) {
			System.out.println(a.result());
			
			sumKorScore += a.getKorScore();
			sumEngScore += a.getEngScore();
			sumMathScore += a.getMathScore();
			
		}
	
		System.out.println("-\t국어총점\t영어총점\t수학총점\t-");
		System.out.println("-\t"+sumKorScore+"\t"+sumEngScore+"\t"+sumMathScore+"\t-");
	
	}

}
