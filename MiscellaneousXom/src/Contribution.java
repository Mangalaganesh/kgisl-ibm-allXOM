import java.util.ArrayList;

public class Contribution {
	private ArrayList<IgInterestResponse> igIntList;

	private ArrayList<RiskInterestResponse> riskIntList;

	public Contribution() {
		super();
	}

	public Contribution(ArrayList<IgInterestResponse> igIntList, ArrayList<RiskInterestResponse> riskIntList) {

		this.igIntList = igIntList;
		this.riskIntList = riskIntList;
	}

	public ArrayList<IgInterestResponse> getIgIntList() {
		return igIntList;
	}

	public void setIgIntList(ArrayList<IgInterestResponse> igIntList) {
		this.igIntList = igIntList;
	}

	public ArrayList<RiskInterestResponse> getRiskIntList() {
		return riskIntList;
	}

	public void setRiskIntList(ArrayList<RiskInterestResponse> riskIntList) {
		this.riskIntList = riskIntList;
	}

	public static double getFTR(String consClsCode, double c1a, double c1b, double c2, double c3) {
		switch (consClsCode) {
		case "C1A":
			return c1a;
		case "C1B":
			return c1b;
		case "C2":
			return c2;
		case "C13":
			return c3;

		default:
			return 0;
		}

	}

}
