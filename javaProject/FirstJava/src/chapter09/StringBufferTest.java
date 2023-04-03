package chapter09;

public class StringBufferTest {
	
	public static void main(String[] args) {
		
		
		//String과는다르게 계속해서 데이터를 생성하는게아니라 하나의 메모리공간에서 가지고논다.
		StringBuffer sb = new StringBuffer();
//		System.out.println(sb.capacity()); // 기본값으로 16칸임
		
		StringBuffer sb2 = new StringBuffer("Hello");
//		System.out.println(sb2);
//		System.out.println(sb2.capacity());
		
		// append
//		sb2.append("~");
//		sb2.append(" java");
		
		
		//delete 문자지우기
//		sb2.append("~").append(" JAVA");
//		System.out.println(sb2); // "Hello ~ JAVA"
//		
//		sb2.delete(5,7);
//		System.out.println(sb2); // "Hello ~ JAVA"
//		
		// insert 문자넣기
		sb2.insert(5,'~');
		System.out.println(sb2); // "Hello ~ JAVA"
		
		sb2.insert(6,"~! ");
		System.out.println(sb2); // "Hello ~ JAVA"
		
		sb2.insert(sb2.length(), false);
		System.out.println(sb2); // "Hello ~ JAVA"
		
		//reverse 꽈꾸로
		sb2.reverse();
		System.out.println(sb2);
		
		String result = new String(sb2); // 원본을 그대로 두고 객체를 복사한다.
		
		
		
	}
	
}
