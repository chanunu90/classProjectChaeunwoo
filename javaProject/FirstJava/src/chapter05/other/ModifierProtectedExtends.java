package chapter05.other;

import chapter05.ModifierProtected;

public class ModifierProtectedExtends extends ModifierProtected{
	
	//name, age, tell
	//다른 패키지안에 있는 놈들은 디폴트값은 안보인다.
	public static void main(String[] args) {
		ModifierProtectedExtends mpe = new ModifierProtectedExtends();
				
		mpe.name = "이강인";
		mpe.age = 30;
		
		mpe.tell();
		
	}
	
}
