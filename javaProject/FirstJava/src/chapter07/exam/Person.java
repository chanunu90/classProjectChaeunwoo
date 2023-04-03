package chapter07.exam;

public class Person {

	// 이름 주민번호 
	private String name;
	private static String personNumber;
	
	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}

	public void printGreeting(){
		System.out.println("안녕하세요. 저는 " + name + "입니다." + getAge() + "살 입니다.");
	}
	
	
	// 주민번호를 통해서 나이를 계산해서 반환하는 메소드
	static int getAge() {
		
		int age = 0;
		//991111-1000000
//		personNumber.charAt(age);
		String year = personNumber.substring(0,2);
		char gender = personNumber.charAt(7);
			
		
//		System.out.println( year + "-" +gender );
		
//		int personYear = 0;
		if(gender <'3') {
			//1900 + year
			age = 2023 - 1900 - Integer.parseInt(year) + 1;
			
		}else {
			//2000 + year
			age = 2023 - 2000 - Integer.parseInt(year) + 1;
		}
		
		return age;
	}
	
	public static void main(String[] args) {
		
		Person p = new Person("차은우" , "900111-4000000");
		
		System.out.println(p.getAge());
		
		
		
	}
	
		
}
