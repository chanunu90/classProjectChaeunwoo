package chapter05.phone;

public class SmartPhoneMain {

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone();
		SmartPhone sp1 = new SmartPhone("blue",7.0f,14);
		SmartPhone sp2 = new SmartPhone("red",8.5f);
//		SmartPhone sp3 = new SmartPhone();
		
		
		
		System.out.print(sp.color + "\t");
		System.out.print(sp.size + "\t");
		System.out.print(sp.volume + "\t");
		
		System.out.println();
		
		System.out.print(sp1.color + "\t");
		System.out.print(sp1.size + "\t");
		System.out.print(sp1.volume + "\t");
		
		System.out.println();
		
		System.out.print(sp2.color + "\t");
		System.out.print(sp2.size + "\t");
		System.out.print(sp2.volume + "\t");
		
	}

}
