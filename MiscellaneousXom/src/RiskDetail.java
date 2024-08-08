import java.util.ArrayList;

public class RiskDetail {

	private ArrayList<IgInterest> igIntList;
	private ArrayList<RiskInterest> riskIntList;

	public RiskDetail() {
		super();
	}

	public RiskDetail(ArrayList<IgInterest> igIntList, ArrayList<RiskInterest> riskIntList) {
		super();
		this.igIntList = igIntList;
		this.riskIntList = riskIntList;
	}

	public ArrayList<IgInterest> getIgIntList() {
		return igIntList;
	}

	public void setIgIntList(ArrayList<IgInterest> igIntList) {
		this.igIntList = igIntList;
	}

	public ArrayList<RiskInterest> getRiskIntList() {
		return riskIntList;
	}

	public void setRiskIntList(ArrayList<RiskInterest> riskIntList) {
		this.riskIntList = riskIntList;
	}

	
}
