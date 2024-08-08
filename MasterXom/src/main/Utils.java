package main;

public class Utils {
	public static double roundValue(double value, int decimalPlaces) {
		double scale = Math.pow(10, decimalPlaces);
		return Math.round(value * scale) / scale;
	}

	public static double roundMax(double value) {
		return Math.ceil(value);
	}
	
	public static String trimEmpty(String  input) {
		if(input != null) {
		input =  input.trim();}
		return input;
	}
	
	// Method to perform the calculation
    public static double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
               if(num2 !=0) {
                    return num1 / num2;
                } else{
                	throw new ArithmeticException("Division by zero!");
                }
            case "%":
                return num1 % num2;
            case "**":
                return Math.pow(num1, num2);
            default:
            	throw new ArithmeticException("No matching operator!");
        }
    }
	

}
