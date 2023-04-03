package chapter09;

public class ObjectTest {

	public static void main(String[] args) {

		Car c1 = new Car("2023A001");
		Car c2 = new Car("2023A002");
		Car c3 = c1;
		Car c4 = new Car("2023A001");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString()); 
		
		System.out.println("");
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3)); 
		System.out.println(c1.equals(null));
		System.out.println(c1.equals(""));
		//객체단위의 비교는 equals 오버라이딩 해줘야함
		System.out.println(c1.equals("2023A001"));
		
		
		
	}


}
	

class Car {
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	//객체단위의 비교는 equals 오버라이딩 해줘야함
	String carNo;
	Car(String car){
		carNo = car;
	}
	@Override
	public boolean equals(Object obj) {
		//obj => null =< false 값이면
		Car car = null;
		if(obj != null && obj instanceof Car) {
			//obj instanceof Car => obj 의 타입이 Car타입으로 변환이 가능한지
			car = (Car)obj;
			
			//문자열을 비교해서 같은지 여부 반환
			if(carNo.equals(car.carNo)) {
				return true;
			}
			
		}
		//obj => Car 타입으로 형변환 가능해야한다!
		//obj => 형변환 하고 carNo를 비교해서 결과값을 리턴해줘야한다.
		
		return false;
	}
	/////////////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return carNo + "차량 입니다.";
	}
	
}