package chapter08.phone;

public class Main {

		public static void main(String[] args) {
			
//			Phone phone = null;
//			//1.전원을 킨다.
//			phone.turnOn();
//			//2.통화를 한다.
//			phone.call();
//			//3.전원을 끈다.
//			phone.turnOff();
			
			SmartPhone2 phone2 = new SmartPhone2();
			///////////////
			// 1. 전원을 키고
			phone2.turnOn();
			// 2. 전화를 걸고
			phone2.call();
			// 3. 게임을 한다
			phone2.game();
			// 4. 전원을 끈다.
			phone2.turnOff();
			
		}
}