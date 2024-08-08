import java.util.ArrayList;

public class InterestResponse {

	private String sItemCode;
	private String compPerilInd;
	private double sSumCovered;
	private double sRatePct;
	private double sFltAmt;
	private double noOfMember;
	private double sContri;
	private ArrayList<PcwResponse> pcwList;

	public InterestResponse() {
		super();
	}

	public InterestResponse(String sItemCode, String compPerilInd, double sSumCovered, double sRatePct, double sFltAmt,
			double noOfMember, double sContri, ArrayList<PcwResponse> pcwList) {
		this.sItemCode = sItemCode;
		this.compPerilInd = compPerilInd;
		this.sSumCovered = sSumCovered;
		this.sRatePct = sRatePct;
		this.sFltAmt = sFltAmt;
		this.noOfMember = noOfMember;
		this.sContri = sContri;
		this.pcwList = pcwList;
	}

	public String getsItemCode() {
		return sItemCode;
	}

	public void setsItemCode(String sItemCode) {
		this.sItemCode = sItemCode;
	}

	public String getCompPerilInd() {
		return compPerilInd;
	}

	public void setCompPerilInd(String compPerilInd) {
		this.compPerilInd = compPerilInd;
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

	public double getNoOfMember() {
		return noOfMember;
	}

	public void setNoOfMember(double noOfMember) {
		this.noOfMember = noOfMember;
	}

	public double getsContri() {
		return sContri;
	}

	public void setsContri(double sContri) {
		this.sContri = sContri;
	}

	public ArrayList<PcwResponse> getPcwList() {
		return pcwList;
	}

	public void setPcwList(ArrayList<PcwResponse> pcwList) {
		this.pcwList = pcwList;
	}

}
