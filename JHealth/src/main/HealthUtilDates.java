package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.TimeZone;

public class HealthUtilDates {

	public static Date converDateFormat(String strDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date date = new Date();
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
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
