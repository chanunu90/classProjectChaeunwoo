package chapter07.exam;

public class PersonMain {

	public static void main(String[] args) {

			Mail m1 = new Mail("송흥민","991111-1111111","축구선수입니다.");
			m1.printGreeting();
			
			Person p1 = m1;
			p1.printGreeting();

			Person p2 = new Female("원더우먼", "020517-3111111");
			p2.printGreeting();

	}

}
