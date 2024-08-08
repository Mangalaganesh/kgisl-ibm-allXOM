
public class IgResponse {

	private String insCode;
	private String natCode;
	private String insDob;
	private double igAmt;
	private double igContri;

	public IgResponse() {
		super();
	}

	public IgResponse(String insCode, String natCode, String insDob, double igAmt, double igContri) {
		super();
		this.insCode = insCode;
		this.natCode = natCode;
		this.insDob = insDob;
		this.igAmt = igAmt;
		this.igContri = igContri;
	}

	public String getInsCode() {
		return insCode;
	}

	public void setInsCode(String insCode) {
		this.insCode = insCode;
	}

	public String getNatCode() {
		return natCode;
	}

	public void setNatCode(String natCode) {
		this.natCode = natCode;
	}

	public String getInsDob() {
		return insDob;
	}

	public void setInsDob(String insDob) {
		this.insDob = insDob;
	}

	public double getIgAmt() {
		return igAmt;
	}

	public void setIgAmt(double igAmt) {
		this.igAmt = igAmt;
	}

	public double getIgContri() {
		return igContri;
	}

	public void setIgContri(double igContri) {
		this.igContri = igContri;
	}

}
