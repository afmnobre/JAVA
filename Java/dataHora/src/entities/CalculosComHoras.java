package entities;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CalculosComHoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d01 = LocalDate.parse("2024-07-13");
		LocalDateTime d02 = LocalDateTime.parse("2024-07-13T01:30:26");
		Instant d03 = Instant.parse("2024-07-13T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
	
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
	}

}
