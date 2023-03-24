package chapter04;

public class ForLoop3 {

	public static void main(String[] args) {

		//행을 표현 => 외부 loop
		for(int i=1; i < 10 ; i++) {
			for(int j=2; j <10; j++) {
				System.out.printf(i + "x" +  j +"=" + (i*j) + "\t");
			}
			System.out.println();
		}
		
	}

}
