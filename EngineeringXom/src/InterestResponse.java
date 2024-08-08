
public class InterestResponse {

	private String sItemCode;
	private double sSumCovered;
	private double scRatePct;
	private double sContri;

	public InterestResponse() {
		super();
	}

	public InterestResponse(String sItemCode, double sSumCovered, double scRatePct, double sContri) {

		this.sItemCode = sItemCode;
		this.sSumCovered = sSumCovered;
		this.scRatePct = scRatePct;
		this.sContri = sContri;
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

	public double getScRatePct() {
		return scRatePct;
	}

	public void setScRatePct(double scRatePct) {
		this.scRatePct = scRatePct;
	}

	public double getsContri() {
		return sContri;
	}

	public void setsContri(double sContri) {
		this.sContri = sContri;
	}

}
