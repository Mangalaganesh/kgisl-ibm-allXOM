package fire;

public class PcwDetailsRequest {

	private String pcwCode;
	private String pcwInd;
	private String perilInd;
	private Double pSumCovered;
	private Double pcwRate;

	public PcwDetailsRequest() {
		super();
	}

	public PcwDetailsRequest(String pcwCode, String pcwInd, String perilInd, Double pSumCovered, Double pcwRate) {
		super();
		this.pcwCode = pcwCode;
		this.pcwInd = pcwInd;
		this.perilInd = perilInd;
		this.pSumCovered = pSumCovered;
		this.pcwRate = pcwRate;
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

	public Double getpSumCovered() {
		return pSumCovered;
	}

	public void setpSumCovered(Double pSumCovered) {
		this.pSumCovered = pSumCovered;
	}

	public Double getPcwRate() {
		return pcwRate;
	}

	public void setPcwRate(Double pcwRate) {
		this.pcwRate = pcwRate;
	}

}
