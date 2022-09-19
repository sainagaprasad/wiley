package datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class Demo5 {
	public static void main(String[] args) {
		LocalTime start=LocalTime.of(10, 2, 20);
		LocalTime end=LocalTime.of(11, 2, 8);
		
		Duration dur=Duration.between(start, end);
		System.out.println(dur);
		System.out.println(dur.getSeconds());
		long dura=dur.toMillis();
		System.out.println(dura);
		
		Instant ins=Instant.now();
		System.out.println(ins);
	}
}
