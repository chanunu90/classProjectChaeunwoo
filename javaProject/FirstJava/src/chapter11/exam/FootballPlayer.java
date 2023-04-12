package chapter11.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FootballPlayer {
	 String name;
	 int number;
	 String team;
	 int age;
	 
	public FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}
	 
	 public static void main(String[] args) {
		 
		 Map<Integer , FootballPlayer> myTeam = new HashMap<>();
		 myTeam.put(1,new FootballPlayer("파마이어",13,"게르만",30));
		 myTeam.put(2,new FootballPlayer("슈바인슈타이거" ,10,"마인츠",40));
		 myTeam.put(3,new FootballPlayer("마리오고메스"  ,9,"뮌헨",35));
		 myTeam.put(4,new FootballPlayer("니클라스쥘레",25,"돌문",25));
		 myTeam.put(5,new FootballPlayer("슐로터베크",4,"독일",21));
		 
		 Scanner sc = new Scanner(System.in);
		 String name = null;
		 int number = 0;
		 String team = null;
		 int age = 0;
		 
		 int button = 0;
		 
		 while(true){
			 
			 try {
			 System.out.print("이름 : ");
			 name = sc.nextLine();
			 System.out.print("등번호 : ");
			 number = sc.nextInt();
			 sc.nextLine();
			 
			 System.out.print("팀 : ");
			 team = sc.nextLine();
			 System.out.print("나이 : ");
			 age = sc.nextInt();
			 sc.nextLine();
			 
			 myTeam.put(myTeam.size()+1  ,new FootballPlayer(name,number,team,age));
			 
			 System.out.println("추가 입력 하시겠씁니까? 1.입력 2.나가기");
			 
				 button = sc.nextInt();
				 sc.nextLine();
			 
			 }catch (Exception e) {
				System.out.println("잘못된 입력 값입니다. 입력을 종료 합니다.");
				break;
			 }
			 
			 
			 if(button == 2) {
				 System.out.println();
				 break;
			 } else if(button == 1) {
				 System.out.println("추가 입력 시작");
				 System.out.println();
			 } else {
				 System.out.println("알수없는 버튼입력 입니다 종료합니다.");
				 System.out.println();
				 break;
			 }
			 
		 }
		 
		 System.out.println("===============입력된 선수들의 정보를 표출합니다.================");
		 
		 Set<Integer> keySet = myTeam.keySet();
	 	 for(int keyName : keySet) {
	 	 	System.out.println(keyName + " : " + "선수명 : "+myTeam.get(keyName).name + "\t\t등번호 : " + myTeam.get(keyName).number +  "\t팀 : " + myTeam.get(keyName).team +  "\t나이 : "  + myTeam.get(keyName).age );
		 }
	 	 
	 	 System.out.println("===============+++++++++++++++++++++---================");
	 }

}

