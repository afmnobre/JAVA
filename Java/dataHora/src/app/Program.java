package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Program {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2024-07-08");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-08T01:30:27");
		Instant d06 = Instant.parse("2024-07-08T01:30:27Z");
		Instant d07 = Instant.parse("2024-07-08T01:30:27-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("13/07/2024 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2024, 7, 13);
		LocalDateTime d11 = LocalDateTime.of(2024,7, 13,1,30);
		
		System.out.println("d01 - LocalDate     = " + d01.toString());
		System.out.println("d02 - LocalDateTime = " + d02.toString());
		System.out.println("d03 - Instant       = " + d03.toString());
		System.out.println("d04 - Parse         = " + d04.toString());
		System.out.println("d05 - Time.Parse    = " + d05.toString());
		System.out.println("d06 - Instant.Parse = " + d06.toString());
		System.out.println("d07 - Instant.Parse = " + d07.toString());
		System.out.println("d08 - Instant.Parse = " + d08.toString());
		System.out.println("d09 - Instant.Parse = " + d09.toString());
		System.out.println("d10 - Instant.Parse = " + d10.toString());
		System.out.println("d11 - Instant.Parse = " + d11.toString());
		
	}

}
