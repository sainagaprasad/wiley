package datetime;

import java.time.LocalDate;
import java.time.Period;

public class Demo4 {
	public static void main(String[] args) {
		LocalDate startlocaldate=LocalDate.of(2020, 3, 12);
		LocalDate endlocaldate=LocalDate.of(2022, 7, 15);
		//find difference between two days
		Period between=Period.between(startlocaldate, endlocaldate);
		System.out.println(between);
		System.out.println(between.getDays());
		System.out.println(between.getYears());
		System.out.println(between.getMonths());
	}
}
