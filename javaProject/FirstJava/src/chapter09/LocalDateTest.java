package chapter09;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTest {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		System.out.println(now.getYear());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
		
		
		
		LocalDate nextDay1 = now.plusDays(1);
		System.out.println(nextDay1);
		LocalDate nextDay2 = now.plusMonths(1);
		System.out.println(nextDay2);
		LocalDate nextDay3 = now.plusYears(1);
		System.out.println(nextDay3);
		
		
		
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		
		
	}

}
