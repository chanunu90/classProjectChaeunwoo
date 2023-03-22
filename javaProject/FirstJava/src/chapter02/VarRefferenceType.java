package chapter02;

public class VarRefferenceType {

	public static void main(String[] args) {

		String str = null; //참조변수 : 객체의 주소값, null -> 아무것도 없드아
		
		str = "JAVA"; //"문자열" => String 타입의 객체로 생성
		
		System.out.println(str); // 실제로는 str.toString() 이러코롬 들어가는거다.
		
	}

}
