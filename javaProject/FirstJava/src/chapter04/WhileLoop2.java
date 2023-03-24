package chapter04;

public class WhileLoop2 {

	public static void main(String[] args) {

		int num = 1;
		int dan = 2;
		
		while (dan < 10) {
			while (num < 10 ) {
				System.out.printf(dan + "x"+ num + "=" + (dan*num++) + "\t");
			}
			System.out.println();
			dan++;
			num = 1;
		}
		
		System.out.println("-----------------");
		num = 1;
		dan = 2;
		while (dan < 10) {
			while (num < 10 ) {
				System.out.printf(num + "x"+ dan + "=" + (dan*num++) + "\t");
			}
			System.out.println();
			dan++;
			num = 1;
		}
		

		
	}

}
