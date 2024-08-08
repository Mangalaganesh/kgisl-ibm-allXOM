package fire;

public class TreeAgeWise {

	private double noOfHectares;
	private double treeAge;
	private double hectareTreeVal;
	private double sumValAge;
	public TreeAgeWise() {
		super();
	}
	public TreeAgeWise(double noOfHectares, double treeAge, double hectareTreeVal, double sumValAge) {
		this.noOfHectares = noOfHectares;
		this.treeAge = treeAge;
		this.hectareTreeVal = hectareTreeVal;
		this.sumValAge = sumValAge;
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
	public double getHectareTreeVal() {
		return hectareTreeVal;
	}
	public void setHectareTreeVal(double hectareTreeVal) {
		this.hectareTreeVal = hectareTreeVal;
	}
	public double getSumValAge() {
		return sumValAge;
	}
	public void setSumValAge(double sumValAge) {
		this.sumValAge = sumValAge;
	}

	
	
}
