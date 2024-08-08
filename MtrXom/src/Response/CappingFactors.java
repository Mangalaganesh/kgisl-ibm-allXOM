package Response;

public class CappingFactors {

	private double minCappingPercent;
	private double maxCappingPercent;
	private double rhbDiscountPercent;
	private double rhbLoadingPercent;
	private double fleetPercent;
	private double fleetLoadPercent;
	private double minCappingAmount;
	private double maxCappingAmount;
	private double maxDiscountAllowed;
	private double rhbAllowedDiscount;
	private double rhbAllowedLoading;

	public CappingFactors() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CappingFactors(double minCappingPercent, double maxCappingPercent, double rhbDiscountPercent,
			double rhbLoadingPercent, double fleetPercent, double fleetLoadPercent, double minCappingAmount,
			double maxCappingAmount, double maxDiscountAllowed, double rhbAllowedDiscount, double rhbAllowedLoading) {
		super();
		this.minCappingPercent = minCappingPercent;
		this.maxCappingPercent = maxCappingPercent;
		this.rhbDiscountPercent = rhbDiscountPercent;
		this.rhbLoadingPercent = rhbLoadingPercent;
		this.fleetPercent = fleetPercent;
		this.fleetLoadPercent = fleetLoadPercent;
		this.minCappingAmount = minCappingAmount;
		this.maxCappingAmount = maxCappingAmount;
		this.maxDiscountAllowed = maxDiscountAllowed;
		this.rhbAllowedDiscount = rhbAllowedDiscount;
		this.rhbAllowedLoading = rhbAllowedLoading;
	}

	public double getMinCappingPercent() {
		return minCappingPercent;
	}

	public void setMinCappingPercent(double minCappingPercent) {
		this.minCappingPercent = minCappingPercent;
	}

	public double getMaxCappingPercent() {
		return maxCappingPercent;
	}

	public void setMaxCappingPercent(double maxCappingPercent) {
		this.maxCappingPercent = maxCappingPercent;
	}

	public double getRhbDiscountPercent() {
		return rhbDiscountPercent;
	}

	public void setRhbDiscountPercent(double rhbDiscountPercent) {
		this.rhbDiscountPercent = rhbDiscountPercent;
	}

	public double getRhbLoadingPercent() {
		return rhbLoadingPercent;
	}

	public void setRhbLoadingPercent(double rhbLoadingPercent) {
		this.rhbLoadingPercent = rhbLoadingPercent;
	}

	public double getFleetPercent() {
		return fleetPercent;
	}

	public void setFleetPercent(double fleetPercent) {
		this.fleetPercent = fleetPercent;
	}

	public double getFleetLoadPercent() {
		return fleetLoadPercent;
	}

	public void setFleetLoadPercent(double fleetLoadPercent) {
		this.fleetLoadPercent = fleetLoadPercent;
	}

	public double getMinCappingAmount() {
		return minCappingAmount;
	}

	public void setMinCappingAmount(double minCappingAmount) {
		this.minCappingAmount = minCappingAmount;
	}

	public double getMaxCappingAmount() {
		return maxCappingAmount;
	}

	public void setMaxCappingAmount(double maxCappingAmount) {
		this.maxCappingAmount = maxCappingAmount;
	}

	public double getMaxDiscountAllowed() {
		return maxDiscountAllowed;
	}

	public void setMaxDiscountAllowed(double maxDiscountAllowed) {
		this.maxDiscountAllowed = maxDiscountAllowed;
	}

	public double getRhbAllowedDiscount() {
		return rhbAllowedDiscount;
	}

	public void setRhbAllowedDiscount(double rhbAllowedDiscount) {
		this.rhbAllowedDiscount = rhbAllowedDiscount;
	}

	public double getRhbAllowedLoading() {
		return rhbAllowedLoading;
	}

	public void setRhbAllowedLoading(double rhbAllowedLoading) {
		this.rhbAllowedLoading = rhbAllowedLoading;
	}

}
