
public class Interest {

	private String sItemCode;
	private double sSumCovered;
	private double sRatePct;
	private double sContri;
	private String commodityCode;
	private String subCommCode;
	

	public Interest() {
		super();
	}

	public Interest(String sItemCode, double sSumCovered, double sRatePct, double sContri,String commodityCode,String subCommCode) {
		
		this.sItemCode = sItemCode;
		this.sSumCovered = sSumCovered;
		this.sRatePct = sRatePct;
		this.sContri = sContri;
		this.commodityCode=commodityCode;
		this.subCommCode = subCommCode;
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

	
	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getSubCommCode() {
		return subCommCode;
	}

	public void setSubCommCode(String subCommCode) {
		this.subCommCode = subCommCode;
	}

	@Override
	public String toString() {
		return "Interest [sItemCode=" + sItemCode + ", sSumCovered=" + sSumCovered + ", sRatePct=" + sRatePct
				+ ", sContri=" + sContri + "]";
	}

}
