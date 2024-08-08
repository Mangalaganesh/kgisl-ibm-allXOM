import java.util.ArrayList;

public class RiskCriteria {

	private ArrayList<String> riskReason;

	public RiskCriteria() {
		super();
	}

	public RiskCriteria(ArrayList<String> riskReason) {
		this.riskReason = riskReason;
	}

	public ArrayList<String> getRiskReason() {
		return riskReason;
	}

	public void setRiskReason(ArrayList<String> riskReason) {
		this.riskReason = riskReason;
	}

}
