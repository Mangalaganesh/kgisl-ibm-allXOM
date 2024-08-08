package Response;

public class GeneralFactors {

	private String designatedCityInd;
    private String selfBillingInd;
    private String rebateInd;
    private String masterPolicyInd;
    private String rebateCommissionInd;
   // private Map<String, String> actFactorDetails;
  //  private Map<String, String> nonActFactorDetails;
    private String parRatio;
    private String formulaSerialNo;
    private String paydInd;
	public GeneralFactors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GeneralFactors(String designatedCityInd, String selfBillingInd, String rebateInd, String masterPolicyInd,
			String rebateCommissionInd, String parRatio, String formulaSerialNo, String paydInd) {
		super();
		this.designatedCityInd = designatedCityInd;
		this.selfBillingInd = selfBillingInd;
		this.rebateInd = rebateInd;
		this.masterPolicyInd = masterPolicyInd;
		this.rebateCommissionInd = rebateCommissionInd;
		this.parRatio = parRatio;
		this.formulaSerialNo = formulaSerialNo;
		this.paydInd = paydInd;
	}
	public String getDesignatedCityInd() {
		return designatedCityInd;
	}
	public void setDesignatedCityInd(String designatedCityInd) {
		this.designatedCityInd = designatedCityInd;
	}
	public String getSelfBillingInd() {
		return selfBillingInd;
	}
	public void setSelfBillingInd(String selfBillingInd) {
		this.selfBillingInd = selfBillingInd;
	}
	public String getRebateInd() {
		return rebateInd;
	}
	public void setRebateInd(String rebateInd) {
		this.rebateInd = rebateInd;
	}
	public String getMasterPolicyInd() {
		return masterPolicyInd;
	}
	public void setMasterPolicyInd(String masterPolicyInd) {
		this.masterPolicyInd = masterPolicyInd;
	}
	public String getRebateCommissionInd() {
		return rebateCommissionInd;
	}
	public void setRebateCommissionInd(String rebateCommissionInd) {
		this.rebateCommissionInd = rebateCommissionInd;
	}
	public String getParRatio() {
		return parRatio;
	}
	public void setParRatio(String parRatio) {
		this.parRatio = parRatio;
	}
	public String getFormulaSerialNo() {
		return formulaSerialNo;
	}
	public void setFormulaSerialNo(String formulaSerialNo) {
		this.formulaSerialNo = formulaSerialNo;
	}
	public String getPaydInd() {
		return paydInd;
	}
	public void setPaydInd(String paydInd) {
		this.paydInd = paydInd;
	}
    
    
}
