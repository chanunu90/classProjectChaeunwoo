package chapter11.collection;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("손흥민");
		set.add("이강인");
		set.add("손흥민");
		set.add("마누엘노이어");
		set.add("니코슐로터백");
		
		//중복값을 제거한 요소의수
		System.out.println("요소의 개수 : " + set.size());
		
		//stream().forEach 이거 진짜 짱조흠
		set.stream().forEach(System.out::println);
		
		//중복값을 제거한 요소의수
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		numbers.add(30);
		numbers.stream().forEach(System.out::println);
		
		
	}

}
