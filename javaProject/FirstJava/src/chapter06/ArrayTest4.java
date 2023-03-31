package chapter06;

public class ArrayTest4 {

	public static void main(String[] args) {
			
		//2차원 배열의 선언
		int[][] arr;
		//2차원 배열의 생성
		arr = new int[3][2];
		
		//2배열의 사이즈
		System.out.println("2차원 배열의 사이즈 : "+arr.length);
		System.out.println("2차원 배열 안의 첫번째 1차원 배열의 사이즈 : "+arr[0].length);
		System.out.println("2차원 배열 안의 두번째 1차원 배열의 사이즈 : "+arr[1].length);
		System.out.println("2차원 배열 안의 세번째 1차원 배열의 사이즈 : "+arr[2].length);
		
		
		arr[0][0] = 11;
		arr[0][1] = 12;
		

		arr[1][0] = 21;
		arr[1][1] = 22;

		arr[2][0] = 31;
		arr[2][1] = 32;

		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
		
		

		
		
	}

}
