package fire;

import java.util.LinkedList;

public class LocDetailResponse {

	private String riskCode;
	private String consClsCode;
    private double locSumCovered;
    private double locContri;
    private LinkedList<IntDetailResponse> intDetails;
    private double totNoHectares;
    private LinkedList<TreeAgeWise> treeAgeWise;
    private double totSumVal;
    
	public LocDetailResponse(String riskCode, String consClsCode, double locSumCovered, double locContri,
			LinkedList<IntDetailResponse> intDetails, double totNoHectares, LinkedList<TreeAgeWise> treeAgeWise,
			double totSumVal) {
		super();
		this.riskCode = riskCode;
		this.consClsCode = consClsCode;
		this.locSumCovered = locSumCovered;
		this.locContri = locContri;
		this.intDetails = intDetails;
		this.totNoHectares = totNoHectares;
		this.treeAgeWise = treeAgeWise;
		this.totSumVal = totSumVal;
	}  
	
	public LocDetailResponse() {
		super();
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

	public double getLocContri() {
		return locContri;
	}

	public void setLocContri(double locContri) {
		this.locContri = locContri;
	}

	public LinkedList<IntDetailResponse> getIntDetails() {
		return intDetails;
	}

	public void setIntDetails(LinkedList<IntDetailResponse> intDetails) {
		this.intDetails = intDetails;
	}

	public double getTotNoHectares() {
		return totNoHectares;
	}

	public void setTotNoHectares(double totNoHectares) {
		this.totNoHectares = totNoHectares;
	}

	public LinkedList<TreeAgeWise> getTreeAgeWise() {
		return treeAgeWise;
	}

	public void setTreeAgeWise(LinkedList<TreeAgeWise> treeAgeWise) {
		this.treeAgeWise = treeAgeWise;
	}

	public double getTotSumVal() {
		return totSumVal;
	}

	public void setTotSumVal(double totSumVal) {
		this.totSumVal = totSumVal;
	}

}
