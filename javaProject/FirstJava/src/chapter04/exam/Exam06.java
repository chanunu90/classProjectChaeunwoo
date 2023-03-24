package chapter04.exam;

public class Exam06 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num < 100) {
			
			
			sum += num;
			num++;
		}
		
		System.out.println(sum);
		
		
		sum = 0;
		for (num = 0 ; num <= 99 ; num++) {
			sum += num;
		}
		System.out.println(sum);
		
	}

}
