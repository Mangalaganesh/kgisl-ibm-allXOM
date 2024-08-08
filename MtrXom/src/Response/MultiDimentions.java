package Response;

public class MultiDimentions {

	private String relativityCount;
    private String relativityRates;
    private String rate;
    private String ndSerialNo;
	public MultiDimentions() {
		super();
	}
	public MultiDimentions(String relativityCount, String relativityRates, String rate, String ndSerialNo) {
		super();
		this.relativityCount = relativityCount;
		this.relativityRates = relativityRates;
		this.rate = rate;
		this.ndSerialNo = ndSerialNo;
	}
	public String getRelativityCount() {
		return relativityCount;
	}
	public void setRelativityCount(String relativityCount) {
		this.relativityCount = relativityCount;
	}
	public String getRelativityRates() {
		return relativityRates;
	}
	public void setRelativityRates(String relativityRates) {
		this.relativityRates = relativityRates;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getNdSerialNo() {
		return ndSerialNo;
	}
	public void setNdSerialNo(String ndSerialNo) {
		this.ndSerialNo = ndSerialNo;
	}
    
}
