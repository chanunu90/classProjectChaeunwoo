package chapter06;

public class ArrayExam1 {

	public static void main(String[] args) {
		int[] korScore = {100,80,60,40,80,50,60,90,40,100};
		int[] endScore = {70,40,80,90,90,60,80,60,90,70};
		int[] matScore = {60,80,69,100,30,40,90,90,50,80};
		
		System.out.println("국어: \t영어: \t수학: \t총점:  \t평균:");
		
		for(int i=0; i <10; i++) {
			int sum = korScore[i]+endScore[i]+matScore[i];
			float avg = (float)(korScore[i]+endScore[i]+matScore[i])/3;
			System.out.println(korScore[i]+"\t"+endScore[i]+"\t"+matScore[i]+"\t"+ sum +"\t"+ avg);
		}
		
		
		
		
		System.out.println("============================================================================");
		
		
		int[][] scores = {
			{100,90,80},
			{90,50,90},
			{80,60,80},
			{70,70,70},
			{60,80,50},
			{50,90,40},
			{80,40,50},
			{90,60,50},
			{50,70,70},
			{70,80,50},
		};
		
		System.out.println("국어: \t영어: \t수학: \t총점:  \t평균:");
		
		for(int i=0; i < scores.length; i++) {
			int sum = 0;
			float agv = 0;
			for(int j=0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
				sum += scores[i][j];
			}
			agv = (float)sum/scores[i].length;
			System.out.print(sum + "\t");
			System.out.print(agv);
			System.out.println();
		}
	}
	
	
}
