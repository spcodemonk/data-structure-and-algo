package project.leetcode.code;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DayDiff {

	public static void main(String[] args) {
			
		LocalDate first = LocalDate.parse("2019-06-29");
		
		
		LocalDate second = LocalDate.parse("2019-06-30");

		
		long noOfDaysBetween = ChronoUnit.DAYS.between(first, second);
		System.out.println(noOfDaysBetween);
		
		
		System.out.println(second.getDayOfYear()-first.getDayOfYear());
	}

}
