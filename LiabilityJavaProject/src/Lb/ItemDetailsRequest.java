package Lb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class ItemDetailsRequest {

	
	String sRiskCode;
	private  double locSumCovered;
	ArrayList<ItemDetails> intList;


	public double getLocSumCovered() {
		return locSumCovered;
	}

	public void setLocSumCovered(double locSumCovered) {
		this.locSumCovered = locSumCovered;
	}

	public ArrayList<ItemDetails> getIntList() {
		return intList;
	}

	public void setIntList(ArrayList<ItemDetails> intList) {
		this.intList = intList;
	}

	public String getsRiskCode() {
		return sRiskCode;
	}

	public void setsRiskCode(String sRiskCode) {
		this.sRiskCode = sRiskCode;
	}
	

}
