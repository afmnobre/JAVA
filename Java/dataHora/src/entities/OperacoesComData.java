package entities;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class OperacoesComData {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2024-07-13");
		LocalDateTime d02 = LocalDateTime.parse("2024-07-13T01:30:26");
		Instant d03 = Instant.parse("2024-07-13T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d01 - fmt1 = " + d01.format(fmt1));
		System.out.println("d02 - fmt2 = " + d02.format(fmt2));
		System.out.println("d02 - fmt1 = " + d02.format(fmt1));
		System.out.println("d03 - Instant = " + fmt3.format(d03));
		System.out.println("d02 - fmt4 = " + d02.format(fmt4));
		System.out.println("d03 - fmt5 = " + fmt5.format(d03));

	}

}
