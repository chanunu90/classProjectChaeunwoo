package chapter09;

public class StringTest {

	public static void main(String[] args) {

		String str1 = "String";
		String str2 = "String";
		String str3 = new String("String");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//참조변수들의 주소값을 즉 서로의 인스턴스값을 비교한다
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		//변수들 안의 문자열을 비교하려면 이퀄스를 써야한다.
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str2));
		
		//특정 타입의 데이터를 => String 타입으로 변경
		String str4 = ""+1;
		String str5 = String.valueOf(123);
		String str6 = new String(str5.toString());
		System.out.println(str5); 
		
		System.out.println();
		
		String str = "Hellow~";
//		System.out.println(str.charAt(0)); 
//		System.out.println(str.charAt(6)); 
//		System.out.println(str.length()); 
		// index : 0 ~ str.length()-1
		// 반복문
//		for(int i = 0;  i < str.length(); i++){
//			System.out.print(str.charAt(i) + " "); 
//		}
		
		for(int i = str.length()-1;  i >=0 ; i--){
			System.out.print(str.charAt(i) + " "); 
		}
		
		System.out.println();
		// compareTo -- 문자의 빼기연산
		// 문자열 두개를 빼고 남은 문자의 수를 출력
		// str = "Hellow~";
		System.out.print(str.compareTo("Hello"));
		
		
		System.out.println("-------------------------------------------");
		
		System.out.println(str.concat("JAVA!!!"));
		
		System.out.println("-------------------------------------------");
		//문자열에 특정 문자열을 포함여부를 확인하는 메소드 = > BOOLEAN 논리값으로 출력됨
		//이걸 이용해서 나중에 비속어 예외처리 가능할듯
		System.out.println(str.contains("lo"));
		System.out.println(str.contains("fine"));
		
		
		//뒤에서부터 문자열 비교함
		String file1 = "phone.jpg";
		String file2 = "java.pdf";
		if(file2.endsWith(".jpg")||file2.endsWith(".png")) {
			System.out.println("업로드가 가능합니다.");
		} else {
			System.out.println("확장자가 .jpg/.png인 파일만 업로드가 가능합니다.");	
		}
		
		
		//equals => 저장하고 있는 문자열을 비교
		System.out.println(str.equals("Hello"));
		System.out.println(str.equals("Hello~"));
		
		// 문자열의 사이즈 체크 : isEmpty() => str.length() == 0
		System.out.println(str.equals(str.isEmpty()));
		System.out.println(str.equals("".isEmpty()));
		
		//문자열의 개수
		System.out.println(str.length());
		
		System.out.println(str);
		System.out.println(str.replace('~','!'));
		
		System.out.println(str.replace("Hellow", "JAVA"));
		
		
		//시작하는 문자열 체크 : http://localhost:80/
		String url = "http://localhost:80/member/login.jsp";
		System.out.println(url.startsWith("http://"));
		String domain = "http://localhost:80/";
		
		
		//왼쪽에서부터 7번쨰까지 짜르고 나옴
		System.out.println(url.substring(domain.length()));
		
		//trim()  :: 양옆의 공백을 제거함
		String str7 = "         Hellow		java              ";
		System.out.println(str7);
		System.out.println(str7.trim());
		
		
		
		
	}

}
