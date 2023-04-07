package chapter11.collection;

import java.util.HashMap;
import java.util.Map;


public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer , FootballPlayer> myTeam = new HashMap<>();
		
		myTeam.put(1, new FootballPlayer("손흥민", 7 , "대한민국" , 30));
		
		
		System.out.println(myTeam.get(1));
		

	}

}
