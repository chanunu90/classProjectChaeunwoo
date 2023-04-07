package chapter11.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FootballPlayer implements Comparable<FootballPlayer>{
	
	private String name;
	private int number;
	private String team;
	private int age;

	public FootballPlayer() {
		// 기본생성자
	}
	
	public FootballPlayer(String name, int number, String team, int age) {
		super();
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}
	
	
	@Override
	public int hashCode() {
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		
		if(obj != null && obj instanceof FootballPlayer) {
			FootballPlayer sp = (FootballPlayer)obj;
			result = this.team.equals(sp.getTeam()) && this.name.equals(sp.getName()) && this.age == sp.getAge();
		}
		
		return result;
	}
	
	@Override
	public int compareTo(FootballPlayer o) {
		//0이면 두수가 같은거임
		int compare = 0;
		compare = this.team.compareTo(getTeam());
		if(compare == 0) {
			compare = this.name.compareTo(getName());
			if(compare == 0) {
				if(compare == 0) {
					compare = 0;
				}else {
					compare = this.age - getAge();
				}
			}
		}
		
		
		return compare;
	}
	
	
	
	
	
	public void showInfo() {
		System.out.printf("[%s] %s(등번호%d,%d) \n" , this.team, this.name, this.number, this.age);
	}
	
	
	
	

	

	// 2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록 Set<E> 컬렉션을 이용해서 축구선수
	// 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
	// 3. TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 같은 팀의 선수들은 이름 순으로 정렬하고, 같은 이름의 선수는 번호 순으로
	// 저장하는 프로그램을 만들어 봅시다.
	// 4. 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다.

}
