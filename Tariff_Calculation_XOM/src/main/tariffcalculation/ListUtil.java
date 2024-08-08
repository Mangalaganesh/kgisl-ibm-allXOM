package main.tariffcalculation;

import java.util.List;

public class ListUtil {

	public static double findLargestNumber(List<Object> list) {
		return list.stream().filter(obj -> obj instanceof Integer).mapToInt(obj -> (Integer) obj).max()
				.orElse(Integer.MAX_VALUE);
	}

	public static double largestNumber(List<Object> list) {
		int largestNumber = Integer.MIN_VALUE; // Initialize with smallest possible value

		for (Object obj : list) {
			if (obj instanceof Integer) {
				int num = (Integer) obj;
				if (num > largestNumber) {
					largestNumber = num;
				}
			}
		}
		return largestNumber;

	}

}
