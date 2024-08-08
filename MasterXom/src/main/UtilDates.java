package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class UtilDates {
	public static long dateDifferenceString(String firstDate, String secondDate) {
		LocalDate date1 = LocalDate.parse(firstDate);
		LocalDate date2 = LocalDate.parse(secondDate);

		long daysDifference = ChronoUnit.DAYS.between(date1, date2);

		return daysDifference;
	}

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

	public static Date converDateFormat(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date response = new Date();
		try {
			response = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

	public static Date convertDateFormat(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date response = new Date();
		try {
			response = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

	public static long calculateDaysDifference(Date date) {
		Instant instantDate1 = date.toInstant();

		ZoneId zoneId = ZoneId.systemDefault();

		ZonedDateTime zonedDateTime1 = instantDate1.atZone(zoneId);
		LocalDate inputDate = zonedDateTime1.toLocalDate();

		LocalDate currentDate = LocalDate.now();

		long daysDifference = ChronoUnit.DAYS.between(inputDate, currentDate);

		return daysDifference;

	}

	public static Date getCurrentDate() {
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = localDate.format(formatter);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date response = new Date();
		try {
			response = sdf.parse(formattedDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return response;
	}
}
