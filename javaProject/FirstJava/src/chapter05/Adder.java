package chapter05;

public class Adder {

	int add(int n1, int n2) {
		System.out.println("두 정수의 합 연산");
		return n1+n2;
	}
	
	float add(float n1, float n2) {
		System.out.println("두 실수의 합 연산");
		return n1+n2;
	}
	
	void add(int num1) {
		System.out.println(num1);
	}
	
	
}
