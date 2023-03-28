package chapter05;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.printData();
		
		
		Singleton s1 = Singleton.getInstance();
		
		
	}

}
