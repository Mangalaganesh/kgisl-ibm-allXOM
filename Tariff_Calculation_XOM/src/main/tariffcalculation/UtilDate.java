package main.tariffcalculation;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class UtilDate {
	
	public static long differenceBetweenTwoDates(Date firstDate, Date secondDate) {
		Instant instantDate1 = firstDate.toInstant();
		Instant instantDate2 = secondDate.toInstant();

		ZoneId zoneId = ZoneId.systemDefault();

		ZonedDateTime zonedDateTime1 = instantDate1.atZone(zoneId);
		ZonedDateTime zonedDateTime2 = instantDate2.atZone(zoneId);

		LocalDate date1 = zonedDateTime1.toLocalDate();
		LocalDate date2 = zonedDateTime2.toLocalDate();

		long daysDifference = ChronoUnit.DAYS.between(date1, date2);

		return daysDifference;
	}

	public static long totalDaysInYear(Date date) {

		Instant instantDate1 = date.toInstant();

		ZoneId zoneId = ZoneId.systemDefault();

		ZonedDateTime zonedDateTime1 = instantDate1.atZone(zoneId);
		LocalDate localDate = zonedDateTime1.toLocalDate();

		boolean isLeapYear = localDate.isLeapYear();

		long totalDays = isLeapYear ? 366 : 365;

		return totalDays;
	}

	public static Long calculateAge(Date dob) {
		Instant instantDate1 = dob.toInstant();

		ZoneId zoneId = ZoneId.systemDefault();

		ZonedDateTime zonedDateTime1 = instantDate1.atZone(zoneId);
		LocalDate birthdate = zonedDateTime1.toLocalDate();

		LocalDate currentDate = LocalDate.now();

		Long age = ChronoUnit.YEARS.between(birthdate, currentDate);
		return age;
	}

}
