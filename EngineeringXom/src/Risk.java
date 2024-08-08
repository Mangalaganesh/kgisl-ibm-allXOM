
public class Risk {

	private String sItemCode;
	private double sContAmt;
	private double sRatePct;
	private double sContri;

	public Risk() {
		super();

	}

	public Risk(String sItemCode, double sContAmt, double sRatePct, double sContri) {

		this.sItemCode = sItemCode;
		this.sContAmt = sContAmt;
		this.sRatePct = sRatePct;
		this.sContri = sContri;
	}

	public String getsItemCode() {
		return sItemCode;
	}

	public void setsItemCode(String sItemCode) {
		this.sItemCode = sItemCode;
	}

	public double getsContAmt() {
		return sContAmt;
	}

	public void setsContAmt(double sContAmt) {
		this.sContAmt = sContAmt;
	}

	public double getsRatePct() {
		return sRatePct;
	}

	public void setsRatePct(double sRatePct) {
		this.sRatePct = sRatePct;
	}

	public double getsContri() {
		return sContri;
	}

	public void setsContri(double sContri) {
		this.sContri = sContri;
	}

}
