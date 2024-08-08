package Lb;

import java.util.ArrayList;

public class LocDetailResponse {
	
	
	String sRiskCode;
	private  double locSumCovered;
	private double locContri;
	ArrayList<ItemDetailsResponse> intList;
	
	
	
	public LocDetailResponse() {
		super();
		
	}
	
	public LocDetailResponse(String sRiskCode, double locSumCovered, double locContri, ArrayList<ItemDetailsResponse> intList) {
		super();
		this.sRiskCode = sRiskCode;
		this.locSumCovered = locSumCovered;
		this.locContri = locContri;
		this.intList = intList;
	}
	
	
	

	public double getLocSumCovered() {
		return locSumCovered;
	}

	public void setLocSumCovered(double locSumCovered) {
		this.locSumCovered = locSumCovered;
	}

	public String getsRiskCode() {
		return sRiskCode;
	}
	public void setsRiskCode(String sRiskCode) {
		this.sRiskCode = sRiskCode;
	}
	public double getLocContri() {
		return locContri;
	}
	public void setLocContri(double locContri) {
		this.locContri = locContri;
	}
	public ArrayList<ItemDetailsResponse> getIntList() {
		return intList;
	}
	public void setIntList(ArrayList<ItemDetailsResponse> intList) {
		this.intList = intList;
	}
	

}
