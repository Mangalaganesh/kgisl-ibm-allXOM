package fire;

import java.util.LinkedList;

public class IntDetailRequest {

	private String sItemCode;
	private double sRatePct;
	private double sSumCovered;
	private double noOfHectares;
	private double treeAge;
	private LinkedList<PcwDetailsRequest> pcwDetails;

	public IntDetailRequest() {
		super();
	}

	public IntDetailRequest(String sItemCode, double sRatePct, double sSumCovered, double noOfHectares, double treeAge,
			LinkedList<PcwDetailsRequest> pcwDetails) {
		this.sItemCode = sItemCode;
		this.sRatePct = sRatePct;
		this.sSumCovered = sSumCovered;
		this.noOfHectares = noOfHectares;
		this.treeAge = treeAge;
		this.pcwDetails = pcwDetails;
	}

	public String getsItemCode() {
		return sItemCode;
	}

	public void setsItemCode(String sItemCode) {
		this.sItemCode = sItemCode;
	}

	public double getsRatePct() {
		return sRatePct;
	}

	public void setsRatePct(double sRatePct) {
		this.sRatePct = sRatePct;
	}

	public double getsSumCovered() {
		return sSumCovered;
	}

	public void setsSumCovered(double sSumCovered) {
		this.sSumCovered = sSumCovered;
	}

	public double getNoOfHectares() {
		return noOfHectares;
	}

	public void setNoOfHectares(double noOfHectares) {
		this.noOfHectares = noOfHectares;
	}

	public double getTreeAge() {
		return treeAge;
	}

	public void setTreeAge(double treeAge) {
		this.treeAge = treeAge;
	}

	public LinkedList<PcwDetailsRequest> getPcwDetails() {
		return pcwDetails;
	}

	public void setPcwDetails(LinkedList<PcwDetailsRequest> pcwDetails) {
		this.pcwDetails = pcwDetails;
	}

}
