package Lb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class ItemDetailsResponse {


	String sOccCode;
	double sSumCovered;
	double sRatePct; 
	double sContri;
	
	public double getsContri() {
		return sContri;
	}
	
	public void setsContri(double sContri) {
		this.sContri = sContri;
	}
	
	public double getsSumCovered() {
		return sSumCovered;
	}
	public void setsSumCovered(double sSumCovered) {
		this.sSumCovered = sSumCovered;
	}


	public String getsOccCode() {
		return sOccCode;
	}
	public void setsOccCode(String sOccCode) {
		this.sOccCode = sOccCode;
	}
	public double getsRatePct() {
		return sRatePct;
	}
	public void setsRatePct(double sRatePct) {
		this.sRatePct = sRatePct;
	}
	
	
}
