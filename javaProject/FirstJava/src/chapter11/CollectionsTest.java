package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {
	
	public static void main(String[] args) {
		List<Integer> lottoNumbers = new ArrayList<Integer>();
		for(int i = 0; i < 6 ; i++) {
			int n  = new Random(System.nanoTime()).nextInt(45)+1;
			lottoNumbers.add(n);
		}
		
		System.out.println("최초 입력 데이터");
		
		
		System.out.println("최대 값 : " + Collections.max(lottoNumbers));
		System.out.println("최소 값 : " + Collections.min(lottoNumbers));
		
		
		Collections.sort(lottoNumbers); // 정렬
		Collections.reverse(lottoNumbers); // 반대로
		
		Collections.shuffle(lottoNumbers); // 다시 섞음
		displayList(lottoNumbers);
		
	}
	
	static <E> void displayList(List<E> list) {
		System.out.println("=================================================");
		for(E num : list) {
			System.out.println(num);
		}
	} 
	
}
