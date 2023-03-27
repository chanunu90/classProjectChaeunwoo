package chapter05;

public class ClassVariableMain {
	
	static ClassVariable cv = new ClassVariable();
	
	public static void main(String[] args) {
		System.out.println(ClassVariable.name);
		System.out.println(ClassVariable.age);
		System.out.println();
		InstanceVariable.telName();
		System.out.println();
		
		
		cv.tellName();
		cv.tellAge();
		
	}

}
