package main.tariffcalculation;

public class RoundingUtils {

	public static double roundToDecimalPlaces(double value, int decimalPlaces) {
		double scale = Math.pow(10, decimalPlaces);
		return Math.round(value * scale) / scale;
	}

}
