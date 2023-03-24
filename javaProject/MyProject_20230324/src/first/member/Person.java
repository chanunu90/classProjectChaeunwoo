package first.member;

public class Person {

	public static void main(String[] args) {

		String memberName = "김민재";
		String memPhoneNm = "010-7777-7777";
		String personNumber = "960103-1035879";
		
		//① 회원이름을 저장하는 변수
		System.out.println("이름:"+memberName);
		//② 회원 전화번호 ( 000-0000-0000 )를 저장하는 변수
		System.out.println("연락처:"+memPhoneNm);
		//③ 회원 주민등록번호 ( 000000-0000000 또는 0000000000000 )를 저장하는 변수
		long pNum = 9912101111111L;
//		System.out.println("주민번호"+personNumber);
		System.out.println("주민번호"+pNum);
		
	}
}