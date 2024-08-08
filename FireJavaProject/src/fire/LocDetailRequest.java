package fire;

import java.util.LinkedList;

public class LocDetailRequest {

	private String riskCode;
	private   String consClsCode;
	private  double locSumCovered;
	private double totNoHectares;
	private  LinkedList<IntDetailRequest> intDetails;
	public LocDetailRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LocDetailRequest(String riskCode, String consClsCode, double locSumCovered, double totNoHectares,
			LinkedList<IntDetailRequest> intDetails) {
		super();
		this.riskCode = riskCode;
		this.consClsCode = consClsCode;
		this.locSumCovered = locSumCovered;
		this.totNoHectares = totNoHectares;
		this.intDetails = intDetails;
	}
	public String getRiskCode() {
		return riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public String getConsClsCode() {
		return consClsCode;
	}
	public void setConsClsCode(String consClsCode) {
		this.consClsCode = consClsCode;
	}
	public double getLocSumCovered() {
		return locSumCovered;
	}
	public void setLocSumCovered(double locSumCovered) {
		this.locSumCovered = locSumCovered;
	}
	public double getTotNoHectares() {
		return totNoHectares;
	}
	public void setTotNoHectares(double totNoHectares) {
		this.totNoHectares = totNoHectares;
	}
	public LinkedList<IntDetailRequest> getIntDetails() {
		return intDetails;
	}
	public void setIntDetails(LinkedList<IntDetailRequest> intDetails) {
		this.intDetails = intDetails;
	}
	


}
