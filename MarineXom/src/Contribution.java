import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

public class Contribution {

	private ArrayList<Interest> intList;

	public Contribution() {
		super();
	} 
	
	public Contribution(ArrayList<Interest> intList) {
		
		this.intList = intList;
	}

	public ArrayList<Interest> getIntList() {
		return intList;
	}

	public void setIntList(ArrayList<Interest> intList) {
		this.intList = intList;
	}
	
	public static String appendString(String temp, String value) {
		if (temp == null || temp == "" || temp.isEmpty()) {
			temp = value;
			return temp;
		}
		temp = temp + ", " + value;
		return temp;
	}
 
	public static String removeDuplicates(String input) {
		String[] values = input.split(",\\s*");
		Set<String> uniqueValues = new LinkedHashSet<>(Arrays.asList(values));
		String result = String.join(", ", uniqueValues);
		return result;
	}
	public static Date converDate(String date) {
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
	public static double roundValue(double value, int decimalPlaces) {
		double scale = Math.pow(10, decimalPlaces);
		return Math.round(value * scale) / scale;
	}

	public static double roundMax(double value) {
		return Math.ceil(value);
	}
}
