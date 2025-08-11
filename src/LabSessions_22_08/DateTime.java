package LabSessions_22_08;

import java.time.*;
import java.time.format.*;


public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE MMMM dd-MM-yyyy hh-mm-ss");
		String formated = time.format(formatter);
		System.out.println(formated);
		LocalDate dt = LocalDate.now();
		LocalTime tt = LocalTime.now();
		System.out.println(dt.toString());
		System.out.println(tt.toString());
	}
}