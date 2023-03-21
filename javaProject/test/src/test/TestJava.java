package test;

public class TestJava {

	//주석은 컴파일시에 코드로 인식하지않는다
	// 변수들 정의
	// 함수(메소드) 정의
	
	/*
	 * 어떤 파일
	 * 어떤 목적
	 * 누가 작성
	 * 언제 수정
	 *   
	 * 
	 */
	
	//메인메소드 -> 클래스 실행시 시작 시점
	public static void main(String[] args) {
		//println 은 텍스트 실핼수 줄바꿈해줌 그래서 ln이 붙는다.
		//변수
		//자료형 타입 + 변수이름
		int age = 20; //메모리 공간 할당, 메모리 주소의 역할
		double pi = 3.141592; //초기값넣어주는걸 변수의 초기화 라고한다.
		System.out.println("나이" + age);
		System.out.println("원주율" + pi);
		System.out.println("나이 + 원주율 =" + (pi + age));
				
		pi = sub(age,pi);
		System.out.println("----------------------");
		System.out.println(pi);
		hello();
		hello2("차은우");
	}
	//이게 메소드 랍니당
	//반환대는 데이터 타입(여기선 더블) 을 써주고 시작 하면 된다.
	static double sub(int i1,double i2) {
		return (i1 * i2);
	}
	//인삿말을 출력하는 메소드
	//보이드는 리턴값이 없으니 자료형 선언도 안해도된다.
	static void hello() {
		System.out.println("------------------------------");
		System.out.println("안녕하세요");
		System.out.println("반갑습니다.");
	}
	
	//문자열 받아서 출력
	static void hello2(String name) {
		System.out.println("------------------------------");
		System.out.println(name + "님 안녕하세요");
	}
	
	
	
	
}