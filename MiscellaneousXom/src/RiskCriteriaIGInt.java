
public class RiskCriteriaIGInt {
	
	private String natCode;
	private double insAge;
	
	
	public RiskCriteriaIGInt() {
		super();
	}


	public RiskCriteriaIGInt(String natCode, double insAge) {
		super();
		this.natCode = natCode;
		this.insAge = insAge;
	}
	
	
	public String getNatCode() {
		return natCode;
	}
	public void setNatCode(String natCode) {
		this.natCode = natCode;
	}
	public double getInsAge() {
		return insAge;
	}
	public void setInsAge(double insAge) {
		this.insAge = insAge;
	}
	

}
