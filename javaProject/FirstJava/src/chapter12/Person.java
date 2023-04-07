package chapter12;

import java.io.Serializable;

public class Person implements Serializable{ // Serializable 룰 구현해야 직렬화가 가능하다.

	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void tell() {
		System.out.println("안녕하세요. " + age + "살, " + name + "입니다.");
	}
	
}
