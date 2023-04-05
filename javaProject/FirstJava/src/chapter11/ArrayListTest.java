package chapter11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		// Collection => List<E> => ArrayList<E>
		// String 타입의 객체를 저장 => String 타입의 인스턴스를 참조하는 참조값을 저장
		ArrayList<String> list = new ArrayList<String>();
		
		// 인스턴스 저장 => 요소 저장 , add() 리스트에 순서대로 값을 넣는다. 
		list.add("손흥민"); // 인택스 값 없이 넣으면 순서대로 들어간다.
		list.add(new String("박지성"));
		list.add(new String("캉진리"));
		
		//데이터 참조 => get();
//		String name = list.get(0);
//		System.out.println(name);
		
		//특정 위치에 요소 삽입(배열에서 이거하려면 매우 귀찮다. 어레이리스트 편라하다.)
		list.add(2, "오현규");//인댁스값 넣으면 위치에 넣고 나머지는 오른쪽으로 쉬프트 시킨다.
		
		// 저장된 요소의 개수 : size()
		System.out.println("저장된 이름의 개수 : " + list.size());
		System.out.println("index : 0 ~ " + (list.size()-1));
		
		System.out.println("------------------------------------------");
		
		for(String a : list) {
			System.out.println(a + " : " + a.charAt(0));
		}
		
		System.out.println("------------------------------------------");
		
		list.add(3, "슐로터베크");//인댁스값 넣으면 위치에 넣고 나머지는 오른쪽으로 쉬프트 시킨다.
		for(String player : list) {
			System.out.println( player + " : " + player.charAt(2));
		}
		
		if(list.contains("손흥민")) {
			System.out.println("잘하자!");
		}
		
		if(list.contains("오현규")) {
			// 안정환 선수는 하차!
			System.out.println("오현규는 잠시 후보로 간다!");
			list.remove("오현규");
			list.remove(0);
		}
		
		System.out.println("------------------------------------------");
		
		for(String player : list) {
			System.out.println( player + " : " + player.charAt(2));
		}
		
		System.out.println("-----------------리스트 삭제-------------------------");
		
		// 전체 요소 삭제
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		System.out.println("--------------------정수 넣기-------------------------");
		
		//레퍼클레스 라는 놈이 아주 착하게 Integer라는 참조변수를 알아서 기본타입으로 변경해주는 이걸 언박싱 이라고한다.
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(50);
		numbers.add(10);
		numbers.add(30);
		numbers.add(40);
		numbers.add(60);
		
		for(int n : numbers) {
			System.out.println(n);
		}
		
	}
}
