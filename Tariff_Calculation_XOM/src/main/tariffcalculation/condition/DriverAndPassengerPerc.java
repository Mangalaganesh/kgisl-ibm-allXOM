package main.tariffcalculation.condition;

public class DriverAndPassengerPerc {

	/**
	 * Finds the Driver Percentage.
	 * 
	 * @param paDriverAmountOutput    represents the pa driver amount output.
	 * @param tpPropAccidentOutput    represents the tp prop accident output.
	 * @param calculatedDriverPercent represents the calculated driver percent.
	 * @return the driver percent.
	 */
	public static double findDriverPercentage(double paDriverAmountOutput, double tpPropAccidentOutput,
			double calculatedDriverPercent) {
		double driverPercent = calculatedDriverPercent;
		if ((paDriverAmountOutput <= tpPropAccidentOutput) || (calculatedDriverPercent <= 0.001)) {
			driverPercent = 0.001;
		} else if (calculatedDriverPercent >= 0.30) {
			driverPercent = 0.30;
		}
		return driverPercent;
	}

	/**
	 * Finds the Passenger Percentage.
	 * 
	 * @param paPassengerAmountOutput represents the pa passenger amount output.
	 * @param afterDriverAmoutOutput  represents the after driver amount output.
	 * @param calculatedDriverPercent represents the calculated driver percent.
	 * @return the passenger percent.
	 */
	public static double findPassengerPercentage(double paPassengerAmountOutput, double afterDriverAmoutOutput,
			double calculatedPassengerPercent) {
		double passengerPercent = calculatedPassengerPercent;
		if ((paPassengerAmountOutput <= afterDriverAmoutOutput) || (calculatedPassengerPercent <= 0.001)) {
			passengerPercent = 0.001;
		} else if (calculatedPassengerPercent >= 0.15) {
			passengerPercent = 0.15;
		}
		return passengerPercent;
	}

}
