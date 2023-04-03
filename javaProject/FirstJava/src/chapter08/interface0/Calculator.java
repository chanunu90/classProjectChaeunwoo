package chapter08.interface0;

public interface Calculator {
	 long add(long n1, long n2);  //public abstract 생략 인터페이스로 만들면 자동 상수 및 추상메소드 되버림
	 long sub(long n1, long n2 );
	 long mul(long n1, long n2 );
	 double div(double n1, double n2 );
}
