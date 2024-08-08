package main;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringUtils {
	
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

}
