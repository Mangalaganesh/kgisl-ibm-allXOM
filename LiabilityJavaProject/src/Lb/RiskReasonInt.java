package Lb;

public class RiskReasonInt {

	private double sumCovered;
	private String productCode;
	public RiskReasonInt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RiskReasonInt(double sumCovered, String productCode) {
		super();
		this.sumCovered = sumCovered;
		this.productCode = productCode;
	}
	public double getSumCovered() {
		return sumCovered;
	}
	public void setSumCovered(double sumCovered) {
		this.sumCovered = sumCovered;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
//	@Override
//	public String toString() {
//		return "RiskReasonInt [sumCovered=" + sumCovered + ", productCode=" + productCode + "]";
//	}
	
}
