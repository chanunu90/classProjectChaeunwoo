package chapter11.exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


//2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록 Set<E> 컬렉션을 이용해서 축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다. 
//3. TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 같은 팀의 선수들은 이름 순으로 정렬하고, 같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다. 
//4. 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다. 

public class FootballPlayer {
	 String name;
	 int number;
	 String team;
	 int age;
	 
	 
	 public static void main(String[] args) {
		//1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다. 
		 
		 List<FootballPlayer> players = new ArrayList<>();
		 FootballPlayer footballPlayer1 = new FootballPlayer();
		 FootballPlayer footballPlayer2 = new FootballPlayer();
		 FootballPlayer footballPlayer3 = new FootballPlayer();
		 FootballPlayer footballPlayer4 = new FootballPlayer();
		 FootballPlayer footballPlayer5 = new FootballPlayer();
		 
		 //1번
		 footballPlayer1.name = "파이아이우 마이어";
		 footballPlayer1.number = 13;
		 footballPlayer1.team = "게르만";
		 footballPlayer1.age = 30;
		 
		 //2번
		 footballPlayer2.name = "슈바인 슈타이거";
		 footballPlayer2.number = 10;
		 footballPlayer2.team = "마인츠";
		 footballPlayer2.age = 40;
		 
		 //3번
		 footballPlayer3.name = "마리오 고메스";
		 footballPlayer3.number = 9;
		 footballPlayer3.team = "뮌헨 ";
		 footballPlayer3.age = 35;
		 
		 //4번
		 footballPlayer4.name = "니클라스 쥘레";
		 footballPlayer4.number = 25;
		 footballPlayer4.team = "돌문 ";
		 footballPlayer4.age = 25;
		 
		 //5번
		 footballPlayer5.name = "니코 슐로터베크";
		 footballPlayer5.number = 4;
		 footballPlayer5.team = "독일 ";
		 footballPlayer5.age = 21;
		 
		 players.add(footballPlayer1);
		 players.add(footballPlayer2);
		 players.add(footballPlayer3);
		 players.add(footballPlayer4);
		 players.add(footballPlayer5);
			
			for(FootballPlayer player : players) {
				System.out.println("선수명 : "+player.name + "\t등번호 : " + player.number +  "\t팀 : " + player.team +  "\t나이 : "  + player.age );
			}
			
			System.out.println("------------------------------------------");
			
			
		 
	 }
}

