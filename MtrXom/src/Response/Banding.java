package Response;

public class Banding {

	private String relativityCount;
    private String relativityRates;
    private String lowerBanding;
    private String upperBanding;
    private String ndSerialNo;
	public Banding() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Banding(String relativityCount, String relativityRates, String lowerBanding, String upperBanding,
			String ndSerialNo) {
		super();
		this.relativityCount = relativityCount;
		this.relativityRates = relativityRates;
		this.lowerBanding = lowerBanding;
		this.upperBanding = upperBanding;
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
	public String getLowerBanding() {
		return lowerBanding;
	}
	public void setLowerBanding(String lowerBanding) {
		this.lowerBanding = lowerBanding;
	}
	public String getUpperBanding() {
		return upperBanding;
	}
	public void setUpperBanding(String upperBanding) {
		this.upperBanding = upperBanding;
	}
	public String getNdSerialNo() {
		return ndSerialNo;
	}
	public void setNdSerialNo(String ndSerialNo) {
		this.ndSerialNo = ndSerialNo;
	}
    
    
}
