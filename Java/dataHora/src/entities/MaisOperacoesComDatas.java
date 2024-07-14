package entities;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class MaisOperacoesComDatas {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2024-07-13");
		LocalDateTime d02 = LocalDateTime.parse("2024-07-13T01:30:26");
		Instant d03 = Instant.parse("2024-07-13T01:30:26Z");
		
		for(String s : ZoneId.getAvailableZoneIds()) {
			System.out.println("-----------------");
			System.out.println("- " + s + " -");
		}
		
		System.out.println("--------------------------------------------");

		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03,ZoneId.of("Portugal"));
		
		
		System.out.println("r1 = " + r1 );
		System.out.println("r2 = " + r2 );
		System.out.println("r3 = " + r3 );
		System.out.println("d01 dia = " + d01.getDayOfMonth());
		System.out.println("d01 mês = " + d01.getMonthValue());
		System.out.println("d01 ano = " + d01.getYear());
		System.out.println("d01 dia do ano = " + d01.getDayOfYear());
		System.out.println("d02 hora = " + d02.getHour());
		System.out.println("d02 minuto = " + d02.getMinute());
		System.out.println("d02 segundo = " + d02.getSecond());
	}

}
