package main.tariffcalculation;

public class Utils {
	
	public static double roundValue(double value, int decimalPlaces) {
		double scale = Math.pow(10, decimalPlaces);
		return Math.round(value * scale) / scale;
	}

	public static double roundMax(double value) {
		return Math.ceil(value);
	}
	

}
