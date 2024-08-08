
public class PcwResponse {

	private String pcwCode;
	private String pcwInd;
	private String perilInd;
	private double pSumCovered;
	private double pcwRatePct;
	private double pcwContri;

	public PcwResponse() {
		super();
	}

	public PcwResponse(String pcwCode, String pcwInd, String perilInd, double pSumCovered, double pcwRatePct,
			double pcwContri) {

		this.pcwCode = pcwCode;
		this.pcwInd = pcwInd;
		this.perilInd = perilInd;
		this.pSumCovered = pSumCovered;
		this.pcwRatePct = pcwRatePct;
		this.pcwContri = pcwContri;
	}

	public String getPcwCode() {
		return pcwCode;
	}

	public void setPcwCode(String pcwCode) {
		this.pcwCode = pcwCode;
	}

	public String getPcwInd() {
		return pcwInd;
	}

	public void setPcwInd(String pcwInd) {
		this.pcwInd = pcwInd;
	}

	public String getPerilInd() {
		return perilInd;
	}

	public void setPerilInd(String perilInd) {
		this.perilInd = perilInd;
	}

	public double getpSumCovered() {
		return pSumCovered;
	}

	public void setpSumCovered(double pSumCovered) {
		this.pSumCovered = pSumCovered;
	}

	public double getPcwRatePct() {
		return pcwRatePct;
	}

	public void setPcwRatePct(double pcwRatePct) {
		this.pcwRatePct = pcwRatePct;
	}

	public double getPcwContri() {
		return pcwContri;
	}

	public void setPcwContri(double pcwContri) {
		this.pcwContri = pcwContri;
	}

}
