package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Demo6 {
	public static void main(String[] args) {
		LocalDate today =LocalDate.now();
		DayOfWeek day=today.getDayOfWeek();
		System.out.println("Dateof week "+day);
		System.out.println("Date of week "+ day.getValue());
		System.out.println(day.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
		System.out.println(day.getDisplayName(TextStyle.FULL, Locale.getDefault()));
	}
}
