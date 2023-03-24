package chapter04;

public class SwitchCase2 {

	public static void main(String[] args) {

		//사용자 권한 :
		//일반 유저 : 읽기
		//메니자 : 읽기, 쓰기
		//관리자 : 읽기, 쓰기, 삭제
	
		String grade = "manager"; //admin, manager, user
		
		
		switch (grade) {
		case "admin" : {
			System.out.printf("삭제,");
		}
		case "manager" : {
			System.out.printf("쓰기,");
		}
		case "user" : {
			System.out.println("읽기 기능 사용 가능");
			break;
		}
		
		default:
			System.out.println("넌 아무것도 할 수 없다 돌아가라");
		}
	}

}
