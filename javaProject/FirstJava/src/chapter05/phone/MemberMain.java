package chapter05.phone;

import java.util.Date;

public class MemberMain {

	public static void main(String[] args) {
		
		Date now = new Date();
		java.sql.Date time = new java.sql.Date(0);
		
		SmartPhone sp = new SmartPhone();

		Member mb1 = new Member("송흥민", "email@naver.com", 20, "010-1111-1111" , sp);
		Member mb2 = new Member("김민재", "kim@naver.com" );
		
		mb1.showData();
		System.out.println();
		mb2.showData();
		
		dataPrint(mb1); //매개변수의 인자 - Member 타입의 인스턴스를 가르키는 주소값
		dataPrint(mb1,now,time);
	}
	
	static void dataPrint(Member member) {
		//Member member : 매개변수, 참조변수
		
		member.showData();
		
	}
	
	static void dataPrint(Member member,Date now , java.sql.Date time) {
		//Member member : 매개변수, 참조변수
		
		member.showData();
		System.out.println(now);
		System.out.println(time);
		
	}

}
