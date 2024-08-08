import java.util.ArrayList;

public class LocationDetail {

	private String riskCode;
	private double locSumCovered;
	private ArrayList<InterestRequest> intList;
	
	public LocationDetail() {
		super();
	}

	public LocationDetail(String riskCode, double locSumCovered, ArrayList<InterestRequest> intList) {
		
		this.riskCode = riskCode;
		this.locSumCovered = locSumCovered;
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

	public ArrayList<InterestRequest> getIntList() {
		return intList;
	}

	public void setIntList(ArrayList<InterestRequest> intList) {
		this.intList = intList;
	}
	
	
}
