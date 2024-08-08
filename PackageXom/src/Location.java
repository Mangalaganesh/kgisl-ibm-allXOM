import java.util.ArrayList;

public class Location {

	private ArrayList<RiskInterest> riskIntList;

	public Location() {
		super();
	}

	public Location(ArrayList<RiskInterest> riskIntList) {

		this.riskIntList = riskIntList;
	}

	public ArrayList<RiskInterest> getRiskIntList() {
		return riskIntList;
	}

	public void setRiskIntList(ArrayList<RiskInterest> riskIntList) {
		this.riskIntList = riskIntList;
	}

}
