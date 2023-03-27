package chapter05.phone;

public class MemberMain {

	public static void main(String[] args) {

		Member mb1 = new Member("송흥민", "email@naver.com", 20, "010-1111-1111" );
		Member mb2 = new Member("김민재", "kim@naver.com");
		
		mb1.showData();
		
		System.out.println();
		
		mb2.showData();
		
		
		
		
	}

}
