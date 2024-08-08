
public class InterestRersponse {

	private String sItemCode;
	private double sSumCovered;
	private double sRatePct;
	private double sFltAmt;
	private double sContri;
	private double sNoOfItem;

	public InterestRersponse() {
		super();
	}

	public InterestRersponse(String sItemCode, double sSumCovered, double sRatePct, double sFltAmt, double sContri,double sNoOfItem) {

		this.sItemCode = sItemCode;
		this.sSumCovered = sSumCovered;
		this.sRatePct = sRatePct;
		this.sFltAmt = sFltAmt;
		this.sContri = sContri;
		this.sNoOfItem = sNoOfItem;
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

	public double getsFltAmt() {
		return sFltAmt;
	}

	public void setsFltAmt(double sFltAmt) {
		this.sFltAmt = sFltAmt;
	}

	public double getsContri() {
		return sContri;
	}

	public void setsContri(double sContri) {
		this.sContri = sContri;
	}

	public double getsNoOfItem() {
		return sNoOfItem;
	}

	public void setsNoOfItem(double sNoOfItem) {
		this.sNoOfItem = sNoOfItem;
	}
	

}
