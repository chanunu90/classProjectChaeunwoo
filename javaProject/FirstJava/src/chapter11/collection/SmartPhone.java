package chapter11.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SmartPhone implements Comparable<SmartPhone>{


		private String name;
		private String phoneNumber;
		
		public SmartPhone(String name, String phoneNumber) {
			super();
			this.name = name;
			this.phoneNumber = phoneNumber;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		@Override
		public String toString() {
			return "SmartPhone [name=" + name + ", phoneNumber=" + phoneNumber + "]";
		}
		
		
		
		//중복일때 처리는 방식을 오버라이딩 한다.
		//헤쉬코드 쓸떄는 무조건 적절하게 오버라이딩 했야한다.
		@Override
		public int hashCode() {
			// 010-9876-5432
			return this.phoneNumber.charAt(phoneNumber.length()-1)%5; // 0 1 2 3 4
		}

		@Override
		public boolean equals(Object obj) {
			
			boolean result = false;
			
			if(obj != null && obj instanceof SmartPhone) {
				SmartPhone sp = (SmartPhone)obj;
				result = phoneNumber.equals(sp.getPhoneNumber());
			}
			
			
			return result;
		}
		
		//추상 메소드
//		@Override
//		public int compareTo(SmartPhone o) {
//			return name.compareTo(o.getName());
//		}
//		
//		정렬순서를 역순으로
		//
		@Override
		public int compareTo(SmartPhone o) {
			return name.compareTo(o.getName());
		}
		
		
		public static void main(String[] args) {
			Set<SmartPhone> phones = new HashSet<>();
			
			phones.add(new SmartPhone("손흥민","010-1234-5676"));
			phones.add(new SmartPhone("박지성","010-1234-5677"));
			phones.add(new SmartPhone("이강인","010-1234-5676"));
			phones.add(new SmartPhone("차두리","010-1234-5671"));
			
//			phones.stream().forEach(System.out::println);
			//compareTo 를 오버라이딩 해야 정렬이된다.
			phones.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
			
			
			
		}

		

}
