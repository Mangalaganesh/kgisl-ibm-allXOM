import java.util.ArrayList;

public class IgInterest {

	private double noOfMonths;
	private double noOfIns;
	private ArrayList<Ig> igList;

	public IgInterest() {
		super();
	}

	public IgInterest(double noOfMonths, double noOfIns, ArrayList<Ig> igList) {
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

	public ArrayList<Ig> getIgList() {
		return igList;
	}

	public void setIgList(ArrayList<Ig> igList) {
		this.igList = igList;
	}

}
