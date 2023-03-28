package chapter05;

public class ModifierPrivate {

	private String name;
	private int age;
	
	//나중되면 게터랑 세터쓰지 이것도 잘안씀
	public ModifierPrivate(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//은닉된 변수들은 딱 정해진 메소드를 통해서 엑세스, 설정하게 한다. 
	//직접 변수에 값을 넣어주면 추후 데이터를 너무 손쉽게 변경할수있다. 그걸 막는다.
	
	// Getter
	public String getName() { //규칙 겟으로 사용할떈 변수명을 뒤에 대문자 철자로쓰면서 앞에 겟인지 셋인지를 적어준다.
		return this.name;		
	}
	// Setter
	public void setName(String name) { //값을 받아올떄는 넣어줄 변수값앞에 set을 넣어준다.
		this.name = name;
	}
	
	// Getter
	public int getAge() { //규칙 겟으로 사용할떈 변수명을 뒤에 대문자 철자로쓰면서 앞에 겟인지 셋인지를 적어준다.
		return this.age;		
	}
	// Setter
	public void setAge(int age) { //값을 받아올떄는 넣어줄 변수값앞에 set을 넣어준다.
		this.age = age;
	}
		
	void tell() {
	
		System.out.println("안녕하세요. " + age + "살 " + name + " 입니다.");
	
	}
	
}
