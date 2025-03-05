package charles;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;

public class tcDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instant currentTime = Instant.now();
		
		//System.out.println("Current time is " + currentTime);
		
		LocalDate now = LocalDate.now();
		
		LocalDate indep = LocalDate.of(1947, Month.AUGUST, 15);
		System.out.println("i "+ indep);
		System.out.println("n "+ now);
		System.out.println("tmrw" + now.plusDays(1));
		System.out.println("last month " + now.minusMonths(1));
		System.out.println("Leap? " + now.isLeapYear());
		System.out.println("Move to 30 days " + now.withDayOfMonth(30));
		
		

	}

}
