package fire;

import java.util.LinkedList;

public class RiskTypeDiscList {


		public RiskTypeDiscList() {
		super();
	}

		public RiskTypeDiscList(LinkedList<String> riskReason) {
		this.riskReason = riskReason;
	}

		private LinkedList<String> riskReason;

		public LinkedList<String> getRiskReason() {
			return riskReason;
		}

		public void setRiskReason(LinkedList<String> riskReason) {
			this.riskReason = riskReason;
		}
}
