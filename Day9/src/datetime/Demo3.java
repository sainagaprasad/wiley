package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm");
		String formatteddate=formatter.format(dateTime);
		System.out.println(formatteddate);
	}
		
}
