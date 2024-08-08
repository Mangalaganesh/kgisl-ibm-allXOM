import java.util.ArrayList;

public class RiskInterestResponse {

	private String riskCode;
	private String occCode;
	private double locSumCovered;
	private String consClsCode;
	private double riskContri;
	private ArrayList<InterestRersponse> intList;

	public RiskInterestResponse() {
		super();
	}

	public RiskInterestResponse(String riskCode, String occCode,double locSumCovered, String consClsCode, double riskContri,
			ArrayList<InterestRersponse> intList) {

		this.riskCode = riskCode;
		this.occCode = occCode;
		this.locSumCovered = locSumCovered;
		this.consClsCode = consClsCode;
		this.riskContri = riskContri;
		this.intList = intList;
	}

	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public double getLocSumCovered() {
		return locSumCovered;
	}

	public void setLocSumCovered(double locSumCovered) {
		this.locSumCovered = locSumCovered;
	}

	public String getConsClsCode() {
		return consClsCode;
	}

	public void setConsClsCode(String consClsCode) {
		this.consClsCode = consClsCode;
	}

	public double getRiskContri() {
		return riskContri;
	}

	public void setRiskContri(double riskContri) {
		this.riskContri = riskContri;
	}

	public ArrayList<InterestRersponse> getIntList() {
		return intList;
	}

	public void setIntList(ArrayList<InterestRersponse> intList) {
		this.intList = intList;
	}
	public String getOccCode() {
		return occCode;
	}

	public void setOccCode(String occCode) {
		this.occCode = occCode;
	}

}
