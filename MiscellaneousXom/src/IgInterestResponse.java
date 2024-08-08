import java.util.ArrayList;

public class IgInterestResponse {

	private double noOfMonths;
	private double noOfIns;
	private ArrayList<IgResponse> igList;

	public IgInterestResponse() {
		super();
	}

	public IgInterestResponse(double noOfMonths, double noOfIns, ArrayList<IgResponse> igList) {
		super();
		this.noOfMonths = noOfMonths;
		this.noOfIns = noOfIns;
		this.igList = igList;
	}

	public double getNoOfMonths() {
		return noOfMonths;
	}

	public void setNoOfMonths(double noOfMonths) {
		this.noOfMonths = noOfMonths;
	}

	public double getNoOfIns() {
		return noOfIns;
	}

	public void setNoOfIns(double noOfIns) {
		this.noOfIns = noOfIns;
	}

	public ArrayList<IgResponse> getIgList() {
		return igList;
	}

	public void setIgList(ArrayList<IgResponse> igList) {
		this.igList = igList;
	}

}
