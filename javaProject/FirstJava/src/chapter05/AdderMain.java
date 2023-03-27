package chapter05;

public class AdderMain {

	public static void main(String[] args) {

		Adder ad = new Adder();
		
		System.out.println(ad.add(5,5));
		System.out.println(ad.add(5.5f,5.6f));
		ad.add(7);
		
	}
	
	
	

}
