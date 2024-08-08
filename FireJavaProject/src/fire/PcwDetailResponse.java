package fire;

public class PcwDetailResponse {

	private String pcwCode;
	private String pcwInd;
	private String perilInd;
	private double pSumCovered;
	private double pcwRate;
	private double pcwContri;

	public PcwDetailResponse() {
		super();
	}

	public PcwDetailResponse(String pcwCode, String pcwInd, String perilInd, double pSumCovered, double pcwRate,
			double pcwContri) {
		this.pcwCode = pcwCode;
		this.pcwInd = pcwInd;
		this.perilInd = perilInd;
		this.pSumCovered = pSumCovered;
		this.pcwRate = pcwRate;
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

	public double getPcwRate() {
		return pcwRate;
	}

	public void setPcwRate(double pcwRate) {
		this.pcwRate = pcwRate;
	}

	public double getPcwContri() {
		return pcwContri;
	}

	public void setPcwContri(double pcwContri) {
		this.pcwContri = pcwContri;
	}

}
