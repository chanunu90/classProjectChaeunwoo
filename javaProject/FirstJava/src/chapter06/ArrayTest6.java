package chapter06;

public class ArrayTest6 {

	public static void main(String[] args) {

		int[][] scores = {
				{100,90,80,50,50},
				{98,76,65,50},
				{40,91,50,50,50,50,50},
				{90,50,100,50},
				{90,50,100,50,50,50},
				
		};
		
		for(int i = 0; i < scores.length ; i++) {
			for(int j=0; j < scores[i].length ; j++) {
				System.out.print("numbers["+ i + "][" + j + "] =>" + scores[i][j] + "\t");
				
			}
			
			System.out.println();
		}
			
		
	}

}
