
public class Ig {

	private String insCode;
	private String natCode;
	private String insDob;

	public Ig() {
		super();
	}

	public Ig(String insCode, String natCode, String insDob) {
		this.insCode = insCode;
		this.natCode = natCode;
		this.insDob = insDob;
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

}
