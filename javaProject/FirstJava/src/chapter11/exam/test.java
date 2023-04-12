package chapter11.exam;

import chapter04.SwitchCase1;

public class test {

	public static void main(String[] args) {

		
		for(int i= 1 ; i <= 10; i++) {
			for(int j=0; j <10; j++) {
				
				if(i+j > 10) {
					System.out.print((i+j)-10 + " ");
				}else {
					System.out.print(i+j + " ");
				}
				
			}
			System.out.println();
		}
		

//		변수 money에 10 ~ 5000사이의 난수를 발생시켜 넣는다.
//		단, 3450, 2100, 60과 같이 1의자리 숫자는 반드시 0이 되도록 한다.
//
//		발생된 난수 money를 동전으로 바꾸면 각 동전이 몇개씩 필요한지를 판단하는 코드를 작성
//		가능한한 적은 수의 동전을 사용하도록 한다.
//
//		2590 -> 500원 : 5개, 50원 : 1개, 10원 : 4개
//		for문 1개
		
		
		
		
		
		
		
		int money = (int) (Math.random()*5010+11);
		
		String m_box = "";
		for(int i = 0; i < String.valueOf(money).length() ; i++) {
			if( i+1 == String.valueOf(money).length() ) {
				m_box += "0";
			}else {
				m_box += String.valueOf(money).charAt(i);
			}
		}
		money = Integer.parseInt(m_box);
		System.out.println(money);
		int c_500 = 0;
		int c_50 = 0;
		int c_10 = 0;
		
		c_500 = money/500;
		money = money%500;
		c_50 = money/50;
		money = money%50;
		c_10 = money/10;

		System.out.println("500원 : " + c_500 + ", 50원 : " + c_50 + ", 10원 : " + c_10);
		
		
		
//		문제14>
//		회문수 구하기.
//		회문수란 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 숫자를 말합니다. 
//		예를들어 12121과 같은 숫자.
//		키보드에서 아무값이나 입력받은 후 해당 값이 회문수인지 아닌지를 판단하는 로직(코드)을 구현하자.
//		결과 :
//		입력 : 123
//		123은(는) 회문수가 아닙니다.
//		or
//		입력 : a12321a
//		a12321a은(는) 회문수 입니다.
		
		String num = "12321";
		
		char first_c;
		char last_c;
		
		int notCount = 0;
		boolean key = false;
		
		if(num.length()%2 == 1) {
			notCount = (num.length() / 2) + 1;
		}
		
		for(int i = 0; i <= (int)num.length() / 2 - 1; i++) {
			
			first_c = num.charAt(i);
			last_c = num.charAt(num.length() - (i+1));
			
			if(first_c != last_c || first_c < '0' || first_c > '9') {
				System.out.println(num + "은(는) 회문수가 아닙니다.");
				key = false;
				break;
			}else {
				key = true;
			}
			
		}
		
		if(key == true) {
			System.out.println("☆ " + num + "은(는) 회문수 입니다.");
		}
		
		
//		문제16>
//		0 ~ 9사이의 난수를 100개 만들과, 발생된 난수에서 숫자가 몇개씩 있는지를 판별하여 그래프화 해보자.
//
//		6654654546545646841231... // 난수 100개
//		0의 갯수 : ##########10
//		1의 갯수 : #######7
//		.....
//		9의 갯수 : ############12
		
		
		int num = 0;
		String str = "";
		
		int c_0 = 0,c_1 = 0,c_2 = 0,c_3 = 0,c_4 = 0,c_5 = 0,c_6 = 0,c_7 = 0,c_8 = 0,c_9 = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			num = (int) (Math.random()*10);
			str += String.valueOf(num);
			
			switch (num) {
				case 0 : {	c_0 += 1;	break;	}
				case 1 : {	c_1 += 1;	break;	}
				case 2 : {	c_2 += 1;	break;	}
				case 3 : {	c_3 += 1;	break;	}
				case 4 : {	c_4 += 1;	break;	}
				case 5 : {	c_5 += 1;	break;	}
				case 6 : {	c_6 += 1;	break;	}
				case 7 : {	c_7 += 1;	break;	}
				case 8 : {	c_8 += 1;	break;	}
				case 9 : {	c_9 += 1;	break;	}
			}
			
		}
		
		int[] arr_num = { c_0, c_1, c_2, c_3,	c_4, c_5, c_6,	c_7, c_8, c_9 };
		
		System.out.println("난수 확인 : " + str);
		
		String str_0 = "", str_1 = "",str_2 = "", str_3 = "",str_4 = "", str_5 = "",str_6 = "", str_7 = "",str_8 = "", str_9 = "";
		String[] arr_str = {str_0,	str_1,	str_2,	str_3,	str_4,	str_5,	str_6,	str_7,	str_8,	str_9};
		
		for(int i = 0 ; i < arr_str.length ; i++) {
			for(int j = 0 ; j < arr_num[i]; j++) {
				arr_str[i] += "#";
			}
			System.out.println(arr_str[i] + " : " + i + "의 숫자");
		}
		
//			============================================================
		
		
		
		//	    *
		//     ***
		//    *****
		//   *******
		//  *********
		
		int count=4;
		int star_num = 0;
		String star_line = "";

		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < 10; j++) {
				
				if(count == 0) {
					if(star_num >= 0) {
						star_num--;
					}else {
						star_line += "*";
					}
					
				} else {
					star_line += " ";
					count--;
					star_num++;
				}
				
			}
			System.out.println(star_line);
			count= 4 - i;
			star_line = "";
			star_num = 0;
		}
		
		
		
		

		
	}

}
