package chapter06;

public class ArrayTest9 extends Object{

	public static void main(String[] args) {

		//Member 타입의 배열 생성 : 요소는 5개 저장
		Member[] members = new  Member[5];
		
		members[0] = new Member(1, "cool", "시원한");
		members[1] = new Member(2, "hot", "뜨거운");
		members[2] = new Member(3, "son", "손흥민");
		members[3] = new Member(4, "kang", "캉진리");
		members[4] = new Member(5, "park", "박지성");
		
		System.out.println("===========회원리스트==========");
//		for(int i =0; i < members.length ; i++) {
////			System.out.println(members[i].memberId);
////			System.out.println(members[i].memberName);
//			System.out.println(members[i].toString());
		
//		}
		
		for(Member member : members) {
			System.out.println(member.toString());
		}
		
		
		
		
		
	}

}
