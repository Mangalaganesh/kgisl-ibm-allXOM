
public class InterestRequest {

	private String sItemCode;
	private double sSumCovered;
	private double sRatePct;

	public InterestRequest() {
		super();
	}

	public InterestRequest(String sItemCode, double sSumCovered, double sRatePct) {
		
		this.sItemCode = sItemCode;
		this.sSumCovered = sSumCovered;
		this.sRatePct = sRatePct;
	}

	public String getsItemCode() {
		return sItemCode;
	}

	public void setsItemCode(String sItemCode) {
		this.sItemCode = sItemCode;
	}

	public double getsSumCovered() {
		return sSumCovered;
	}

	public void setsSumCovered(double sSumCovered) {
		this.sSumCovered = sSumCovered;
	}

	public double getsRatePct() {
		return sRatePct;
	}

	public void setsRatePct(double sRatePct) {
		this.sRatePct = sRatePct;
	}

}
