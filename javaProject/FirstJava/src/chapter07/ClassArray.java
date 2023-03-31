package chapter07;

public class ClassArray {

	public static void main(String[] args) {

		
		//상위 타입의 배열 인스턴스 생성
		Phone[] phones = new Phone[5];
		
		phones[0] = new AndroidPhone("011-1111-1111");
		phones[1] = new IPhone("012-9999-9999");
		phones[2] = new IPhone("013-2222-2222");
		phones[3] = new AndroidPhone("014-1235-6354");
		phones[4] = new AndroidPhone("015-6587-1999");
		
//		for(int i = 0; i < phones.length; i++) {
//			phones[i].call();
//		}
//		
		for(Phone p:phones) {
			p.call();
		}
		
		
	}

}
