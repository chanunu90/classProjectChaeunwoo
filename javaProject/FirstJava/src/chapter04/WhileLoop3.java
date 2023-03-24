package chapter04;

public class WhileLoop3 {

	public static void main(String[] args) {

		int num = 0;
		while(true) {
//			System.out.println(num++);
			if(++num%12==0) {
				System.out.println("12의배수 : " + num);
				continue;
			}
				
			
			if(num == 100) {
				break;
			}
		}
		
	}

}
