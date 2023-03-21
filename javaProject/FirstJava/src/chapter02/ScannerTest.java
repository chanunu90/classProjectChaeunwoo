package chapter02;

import java.util.Scanner;
import java.math.*;


public class ScannerTest {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("이름이 무엇입니까? >> ");
		String name = in.nextLine();
		System.out.println("반갑습니다. " + name + "님 >> " + Math.PI);

	}
	
}
