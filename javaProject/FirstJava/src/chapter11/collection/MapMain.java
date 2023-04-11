package chapter11.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//디비 데이터가지고올때 이거참고해라
public class MapMain {
	
	public static void main(String[] args) {
		
		Map<Integer , FootballPlayer> myTeam = new HashMap<>();
		
		myTeam.put(1, new FootballPlayer("손흥민", 7 , "대한민국" , 30));
		myTeam.put(2, new FootballPlayer("차은우", 11 , "대한민국" , 34));
		
		Set<Integer> keySet = myTeam.keySet();
		for(int keyName : keySet) {
			System.out.println(keyName + " : " + myTeam.get(keyName));
		}   
		
//		System.out.println(myTeam.get(1));
//		System.out.println(myTeam.get(2));

	}

}
