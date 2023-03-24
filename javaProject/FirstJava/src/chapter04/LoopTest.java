package chapter04;

public class LoopTest {

	public static void main(String[] args) {

		int result = 1;
		int num = 0;
		for(int i=0 ; i <= 10 ; i++) {
			num	= num + i;
		}
		
		System.out.println(num);
		System.out.println("-----------");
		num = 0;
		int sum = 1;
		while(sum<11) {
			num	= num + sum;
			sum++;
			
			System.out.println(sum-1 + "+ :" + "\t" + num);
		}
				
	}

}
