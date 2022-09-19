package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Demo2 {
	public static void main(String[] args) {
		LocalDate todayDate=LocalDate.now();
		System.out.println(todayDate);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		
		LocalDate jan1=LocalDate.of(2022, Month.JANUARY, 1);
		System.out.println(jan1);

		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(LocalDate.parse("20/Mar/2003",dateTimeFormatter));
	}
}
//why date time contain private methods instead of creating new object?