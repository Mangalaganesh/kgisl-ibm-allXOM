import java.util.ArrayList;

public class LocationDetailsResponse {

	private String riskCode;
	private double locSumCovered;
	private ArrayList<InterestResponse> intList;
	private double locBasicContri;

	public LocationDetailsResponse() {
		super();
	}

	public LocationDetailsResponse(String riskCode, double locSumCovered, ArrayList<InterestResponse> intList,
			double locBasicContri) {

		this.riskCode = riskCode;
		this.locSumCovered = locSumCovered;
		this.intList = intList;
		this.locBasicContri = locBasicContri;
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

	public ArrayList<InterestResponse> getIntList() {
		return intList;
	}

	public void setIntList(ArrayList<InterestResponse> intList) {
		this.intList = intList;
	}

	public double getLocBasicContri() {
		return locBasicContri;
	}

	public void setLocBasicContri(double locBasicContri) {
		this.locBasicContri = locBasicContri;
	}

}
