package chapter04.exam;

public class Exam07 {

	public static void main(String[] args) {
		//문제 7. 1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성. while문과 do~while 문을 각각 한번씩 사용해서 작성
		
		int count = 1;
		while(count < 100) {
	
			System.out.print(count + "\t");
			if(count%5==0) {
				System.out.println();
			}
			count++;
		}
		
		
		
		do {
			System.out.print(count + "\t");
			if(count%5==0) {
				System.out.println();
			}
			if(count == 100) {
				System.out.println();
			}
			count--;
		}while(count > 0);
		
		
		
	}

}
