
public class RiskCriteriaInt {

	private double sumCovered;
	private String originCountry;
	private String destCountry;
	public RiskCriteriaInt() {
		super();
	}
	public RiskCriteriaInt(double sumCovered, String originCountry, String destCountry) {
		super();
		this.sumCovered = sumCovered;
		this.originCountry = originCountry;
		this.destCountry = destCountry;
	}
	public double getSumCovered() {
		return sumCovered;
	}
	public void setSumCovered(double sumCovered) {
		this.sumCovered = sumCovered;
	}
	public String getOriginCountry() {
		return originCountry;
	}
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}
	public String getDestCountry() {
		return destCountry;
	}
	public void setDestCountry(String destCountry) {
		this.destCountry = destCountry;
	}
}
