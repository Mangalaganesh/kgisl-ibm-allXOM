import java.util.ArrayList;

public class RiskInterest {

	private String riskCode;
	private String occCode;
	private double locSumCovered;
	private String consClsCode;
	private ArrayList<Interest> intList;

	public RiskInterest() {
		super();
	}

	public RiskInterest(String riskCode, String occCode,double locSumCovered, String consClsCode, ArrayList<Interest> intList) {
		super();
		this.riskCode = riskCode;
		this.occCode = occCode;
		this.locSumCovered = locSumCovered;
		this.consClsCode = consClsCode;
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

	public ArrayList<Interest> getIntList() {
		return intList;
	}

	public void setIntList(ArrayList<Interest> intList) {
		this.intList = intList;
	}
	public String getOccCode() {
		return occCode;
	}

	public void setOccCode(String occCode) {
		this.occCode = occCode;
	}

}
