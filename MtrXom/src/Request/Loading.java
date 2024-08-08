package Request;

public class Loading {
	private double vehicleAgeLoadPercent;
	private double insuredAgeLoadPercent;

	public Loading() {
		super();
	}

	public Loading(double vehicleAgeLoadPercent, double insuredAgeLoadPercent) {
		super();
		this.vehicleAgeLoadPercent = vehicleAgeLoadPercent;
		this.insuredAgeLoadPercent = insuredAgeLoadPercent;
	}

	// Getter for vehicleAgeLoadPercent
	public double getVehicleAgeLoadPercent() {
		return vehicleAgeLoadPercent;
	}

	// Setter for vehicleAgeLoadPercent
	public void setVehicleAgeLoadPercent(double vehicleAgeLoadPercent) {
		this.vehicleAgeLoadPercent = vehicleAgeLoadPercent;
	}

	// Getter for insuredAgeLoadPercent
	public double getInsuredAgeLoadPercent() {
		return insuredAgeLoadPercent;
	}

	// Setter for insuredAgeLoadPercent
	public void setInsuredAgeLoadPercent(double insuredAgeLoadPercent) {
		this.insuredAgeLoadPercent = insuredAgeLoadPercent;
	}
}
