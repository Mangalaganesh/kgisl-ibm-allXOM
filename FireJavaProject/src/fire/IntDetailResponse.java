package fire;

import java.util.LinkedList;

public class IntDetailResponse {

	private String sItemCode;
    private double sSumCovered;
    private double sRatePct;
    private double sContri;
    private double sumValue;
    private LinkedList<PcwDetailResponse> pcwDetails;
    
	public IntDetailResponse() {
		super();
	}
	
	public IntDetailResponse(String sItemCode, double sSumCovered, double sRatePct, double sContri,double sumValue,
			LinkedList<PcwDetailResponse> pcwDetails) {
		this.sItemCode = sItemCode;
		this.sSumCovered = sSumCovered;
		this.sRatePct = sRatePct;
		this.sContri = sContri;
		this.sumValue=sumValue;
		this.pcwDetails = pcwDetails;
	}
	

    
	public double getSumValue() {
		return sumValue;
	}

	public void setSumValue(double sumValue) {
		this.sumValue = sumValue;
	}

	public String getsItemCode() {
		return sItemCode;
	}
	public void setsItemCode(String sItemCode) {
		this.sItemCode = sItemCode;
	}
	public double getsSumCovered() {
		return sSumCovered;
	}
	public void setsSumCovered(double sSumCovered) {
		this.sSumCovered = sSumCovered;
	}
	public double getsRatePct() {
		return sRatePct;
	}
	public void setsRatePct(double sRatePct) {
		this.sRatePct = sRatePct;
	}
	public double getsContri() {
		return sContri;
	}
	public void setsContri(double sContri) {
		this.sContri = sContri;
	}
	public LinkedList<PcwDetailResponse> getPcwDetails() {
		return pcwDetails;
	}
	public void setPcwDetails(LinkedList<PcwDetailResponse> pcwDetails) {
		this.pcwDetails = pcwDetails;
	}

	
}
