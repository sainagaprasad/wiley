package datetime;

import java.util.Calendar;
import java.util.Date;

public class Demo1 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(calendar.YEAR));
	}
}
