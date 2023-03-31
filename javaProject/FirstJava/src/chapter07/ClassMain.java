package chapter07;

public class ClassMain {

	public static void main(String[] args) {

		AndroidPhone ap= new AndroidPhone("010-9245-0660");
		
		Phone phone = new AndroidPhone("11");
		Phone p = new IPhone("222");
		
		Phone phone1 = (Phone)ap;
		Phone phone2 = ap;//하위타입의 참조변수를 상위타입으로 변경은 생략 가능
		
		AndroidPhone phone3 = (AndroidPhone)phone;
		
		//AndroidPhone phone4 = (AndroidPhone)p; // 이뜻은 new IPhone("222");랑 똑같다. 즉 캐스팅할떄 에러날꺼다.
		
		IPhone iPhone = null;
		AndroidPhone androidPhone2 = null;
		
		if(p instanceof IPhone) { //형변환이가 능하는면 true 불가능하면 false
			iPhone = (IPhone)p;
			iPhone.call();
			
//			System.out.println("가능합니다.");
		}else if(p instanceof AndroidPhone){
			androidPhone2 = (AndroidPhone)p;
			androidPhone2.call();
		}
		
		
	}

}
