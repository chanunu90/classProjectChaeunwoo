package MyProject;

public class Person {

	public static void main(String[] args) {
//		2. Person 클래스를 만들어 보고, 아래의 회원 정보를 저장하는 변수들을 선언해봅시다.
//		변수이름을 작성하는 규칙에 맞게 직접 변수 이름을 정의해 보세요. 
		
//		① 회원이름을 저장하는 변수
		String name = "김민재";
//		② 회원 전화번호 ( 000-0000-0000 )를 저장하는 변수
		String phoneNumber = "017-7777-7777";
//		③ 회원 주민등록번호 ( 000000-0000000 또는 0000000000000 )를 저장하는 변수
		String ResidentNumber = "990229-1000000";
		
		System.out.printf("회원이름:%s \n전화번호:%s \n회원주민번호:%s",name,phoneNumber,ResidentNumber);
	}

}
