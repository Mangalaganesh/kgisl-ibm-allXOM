package Response;

public class RFactor {

	private int relativityCount;
	private double relativityRates;
	private double rfValue;
	private double rate;
	private String ndSerialNo;

	public RFactor() {
		super();
	}

	public RFactor(int relativityCount, double relativityRates, double rfValue, double rate, String ndSerialNo) {
		super();
		this.relativityCount = relativityCount;
		this.relativityRates = relativityRates;
		this.rfValue = rfValue;
		this.rate = rate;
		this.ndSerialNo = ndSerialNo;
	}

	public int getRelativityCount() {
		return relativityCount;
	}

	public void setRelativityCount(int relativityCount) {
		this.relativityCount = relativityCount;
	}

	public double getRelativityRates() {
		return relativityRates;
	}

	public void setRelativityRates(double relativityRates) {
		this.relativityRates = relativityRates;
	}

	public double getRfValue() {
		return rfValue;
	}

	public void setRfValue(double rfValue) {
		this.rfValue = rfValue;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getNdSerialNo() {
		return ndSerialNo;
	}

	public void setNdSerialNo(String ndSerialNo) {
		this.ndSerialNo = ndSerialNo;
	}

}
