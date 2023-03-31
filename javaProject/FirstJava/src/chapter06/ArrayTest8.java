package chapter06;

public class ArrayTest8 {
	
	public static void main(String[] args) {
		
		int[][] arr = {
				{500,200,300},
				{20,40,60}
		};
		
		for(int[] s : arr) {
			for(int is : s) {
				System.out.print(is + "\t");
			}
			System.out.println();
		}

	}
}
