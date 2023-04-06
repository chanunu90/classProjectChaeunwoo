package chapter11.collection;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		
		//compareTo로 오버라이딩해서 정렬 한다.
		TreeSet<SmartPhone> Phones = new TreeSet<>();
		Phones.add(new SmartPhone("Spring", "010-9999-9999"));
		Phones.add(new SmartPhone("King", "010-0000-0000"));
		Phones.add(new SmartPhone("Adam", "010-1111-1111"));
		Phones.add(new SmartPhone("Scott", "010-3333-3333"));
		Phones.add(new SmartPhone("Smith", "010-7777-7777"));

//		Phones.stream().forEach(System.out::println);
		
		Phones.stream().sorted().forEach(System.out::println);
		
		
//		TreeSet<Integer> numbers = new TreeSet();
//		numbers.add(10);
//		numbers.add(100);
//		numbers.add(60);
//		numbers.add(30);
//		numbers.add(70);
//		numbers.stream().forEach(System.out::println);
		
		
		
	}

}
