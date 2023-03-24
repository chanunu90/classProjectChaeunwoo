package first;

public class Member {

	public static void main(String[] args) {
		
//		1. 앞서 생성 했던 Member 클래스에 main() 메소드 안에 아래 조건의 변수를 정의해봅시다.
//		① String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.
//		② int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.
//		③ double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다.
//		④ boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다.
//		⑤ 이름과 나이, 키, 책의 보유 여부를 출력해봅시다.
		String name = "차은우";
		int age = 32;
		double height = 231.3;
//		boolean hasBook = false;
		boolean isBook = true;
		System.out.println("이름 : "+ name +"\n나이 : "+ age +"\n키 : "+ height +"\n책의 보유 여부 : " + isBook);
		
		// 자기 자신의 이름을 출력
//		System.out.println("차은우");
		
	}

}
