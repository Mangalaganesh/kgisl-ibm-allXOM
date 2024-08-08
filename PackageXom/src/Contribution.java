import java.util.ArrayList;

public class Contribution {

	private double locSumCovered;
	private double locContri;
	private ArrayList<RiskInterestResponse> riskIntList;

	public Contribution() {
		super();

	}

	public Contribution(double locSumCovered, double locContri, ArrayList<RiskInterestResponse> riskIntList) {

		this.locSumCovered = locSumCovered;
		this.locContri = locContri;
		this.riskIntList = riskIntList;
	}

	public double getLocSumCovered() {
		return locSumCovered;
	}

	public void setLocSumCovered(double locSumCovered) {
		this.locSumCovered = locSumCovered;
	}

	public double getLocContri() {
		return locContri;
	}

	public void setLocContri(double locContri) {
		this.locContri = locContri;
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
