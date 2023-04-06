package chapter11.exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FootballPlayer {
	 String name;
	 int number;
	 String team;
	 int age;
	 
	 
		public FootballPlayer(String name, int number, String team, int age) {
			super();
			this.name = name;
			this.number = number;
			this.team = team;
			this.age = age;
		}
	 
	 public static void main(String[] args) {
		//1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다. 
		 
		 List<FootballPlayer> players = new ArrayList<>();
		 
		 players.add(new FootballPlayer("파이아이우 마이어",13,"게르만",30));
		 players.add(new FootballPlayer("슈바인 슈타이거",10,"마인츠",40));
		 players.add(new FootballPlayer("마리오 고메스",9,"뮌헨 ",35));
		 players.add(new FootballPlayer("니클라스 쥘레",25,"돌문 ",25));
		 players.add(new FootballPlayer("니코 슐로터베크",4,"독일 ",21));
		 
		 
		for(FootballPlayer player : players) {
			System.out.println("선수명 : "+player.name + "\t등번호 : " + player.number +  "\t팀 : " + player.team +  "\t나이 : "  + player.age );
		}
		
		System.out.println("------------------------------------------");
			
			
		 
	 }



	//2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록 Set<E> 컬렉션을 이용해서 축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다. 
	//3. TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 같은 팀의 선수들은 이름 순으로 정렬하고, 같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다. 
	//4. 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다. 

}

