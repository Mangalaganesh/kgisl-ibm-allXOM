import java.util.ArrayList;

public class RiskInterestResponse {

	private String riskCode;
	private String consClsCode;
	private String fireDiscInd;
	private String piamCode;
	private double riskSumCovered;
	private double riskContri;
	private double fireRiskContri;
	private double fireProtDisRatePct;
	private double fireProtDis;
	private ArrayList<InterestResponse> intList;

	public RiskInterestResponse() {
		super();
	}

	public RiskInterestResponse(String riskCode, String consClsCode, String fireDiscInd, String piamCode,
			double riskSumCovered, double riskContri, double fireRiskContri, double fireProtDisRatePct,
			double fireProtDis, ArrayList<InterestResponse> intList) {
		super();
		this.riskCode = riskCode;
		this.consClsCode = consClsCode;
		this.fireDiscInd = fireDiscInd;
		this.piamCode = piamCode;
		this.riskSumCovered = riskSumCovered;
		this.riskContri = riskContri;
		this.fireRiskContri = fireRiskContri;
		this.fireProtDisRatePct = fireProtDisRatePct;
		this.fireProtDis = fireProtDis;
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

	public double getRiskContri() {
		return riskContri;
	}

	public void setRiskContri(double riskContri) {
		this.riskContri = riskContri;
	}

	public double getFireRiskContri() {
		return fireRiskContri;
	}

	public void setFireRiskContri(double fireRiskContri) {
		this.fireRiskContri = fireRiskContri;
	}

	public double getFireProtDisRatePct() {
		return fireProtDisRatePct;
	}

	public void setFireProtDisRatePct(double fireProtDisRatePct) {
		this.fireProtDisRatePct = fireProtDisRatePct;
	}

	public double getFireProtDis() {
		return fireProtDis;
	}

	public void setFireProtDis(double fireProtDis) {
		this.fireProtDis = fireProtDis;
	}

	public ArrayList<InterestResponse> getIntList() {
		return intList;
	}

	public void setIntList(ArrayList<InterestResponse> intList) {
		this.intList = intList;
	}

}
