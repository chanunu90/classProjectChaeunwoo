package chapter11.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class SmartPhoneHashMapTest {

	public static void main(String[] args) {
		
		HashMap<String,SmartPhone> hashMap = new HashMap<>();

		//HashMap 은 add가 아닌 put으로 데이터를 넣는다.
		SmartPhone p = new SmartPhone("Spring", "010-1111-2222");
		hashMap.put("001", p);
		
		SmartPhone p2 = new SmartPhone("SON", "010-1111-2222");
		hashMap.put("010-1111-2222", p2);
		
		System.out.println(hashMap.get("001"));
		System.out.println(hashMap.get("010-1111-2222"));
		System.out.println(hashMap.get("010-1111-2224"));
		
		System.out.println("---------------------------------------");
		
		Set<String> keySet = hashMap.keySet();
		for(String keyName : keySet) {
			System.out.println(keyName + " : " + hashMap.get(keyName));
			
		}
		
	}

}
