import java.util.ArrayList;

public class RiskInterest {

	private String riskCode;
	private String consClsCode;
	private String fireDiscInd;
	private String piamCode;
	private double riskSumCovered;
	private double fireProtDisRatePct;
	private ArrayList<Interest> intList;

	public RiskInterest() {
		super();
	}

	public RiskInterest(String riskCode, String consClsCode, String fireDiscInd, String piamCode, double riskSumCovered,
			double fireProtDisRatePct,ArrayList<Interest> intList) {
		super();
		this.riskCode = riskCode;
		this.consClsCode = consClsCode;
		this.fireDiscInd = fireDiscInd;
		this.piamCode = piamCode;
		this.riskSumCovered = riskSumCovered;
		this.fireProtDisRatePct = fireProtDisRatePct;
		this.intList = intList;
	}

	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getConsClsCode() {
		return consClsCode;
	}

	public void setConsClsCode(String consClsCode) {
		this.consClsCode = consClsCode;
	}

	public String getFireDiscInd() {
		return fireDiscInd;
	}

	public void setFireDiscInd(String fireDiscInd) {
		this.fireDiscInd = fireDiscInd;
	}

	public String getPiamCode() {
		return piamCode;
	}

	public void setPiamCode(String piamCode) {
		this.piamCode = piamCode;
	}

	public double getRiskSumCovered() {
		return riskSumCovered;
	}

	public void setRiskSumCovered(double riskSumCovered) {
		this.riskSumCovered = riskSumCovered;
	}

	
	public double getFireProtDisRatePct() {
		return fireProtDisRatePct;
	}

	public void setFireProtDisRatePct(double fireProtDisRatePct) {
		this.fireProtDisRatePct = fireProtDisRatePct;
	}

	public ArrayList<Interest> getIntList() {
		return intList;
	}

	public void setIntList(ArrayList<Interest> intList) {
		this.intList = intList;
	}

}
