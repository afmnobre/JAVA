package entities;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CalculosComHoras {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		LocalDate d01 = LocalDate.parse("2024-07-13");
		LocalDateTime d02 = LocalDateTime.parse("2024-07-13T01:30:26");
		Instant d03 = Instant.parse("2024-07-13T01:30:26Z");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
	
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println(x1);
		System.out.println(x2);
	}

}
