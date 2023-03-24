package first;

public class Calcurater {

	public static void main(String[] args) {
		System.out.println("더하기:"+ add(5,56) +"\n빼기:"+ bbegi(6,8) +"\n곱하기:"+ gob(5,56) +"\n나눔:"+ nanum(5,56));
//		long result = 0;
//		add(5,56);
//		bbegi(6,8);
//		gob(5,56);
//		nanum(5,56);
		
	}

	//① 숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
	static long add( long num1, long num2) {
		return num1 + num2;
	}
	
	//② 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
	static long bbegi( long num1, long num2) {
		return num1 - num2;
	}
	
	//③ 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
	static long gob( long num1, long num2) {
		return num1 * num2;
	}
	
	//④ 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
	static float nanum( float num1, float num2) {
		return num1 / num2;
	}

	
}
