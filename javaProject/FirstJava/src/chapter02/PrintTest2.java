package chapter02;

public class PrintTest2 {

	public static void main(String[] args) {
		
		String name = "차은우";
		
		System.out.printf("안녕하세요. 저는 %s입니다.\n", name);
		System.out.printf("저는 %d살 입니다. \n", 32); 
		System.out.printf("정수 : %d, 실수 : %f \n", 10, 13.51456);
		System.out.printf("문자 : %c, 문자열 : %s \n", 'Z', "KING");
		
		System.out.println();
		
		System.out.printf("안녕하세요! 저는 %s입니다. 나이는 %d 입니다. ",name,35);
	}

}
