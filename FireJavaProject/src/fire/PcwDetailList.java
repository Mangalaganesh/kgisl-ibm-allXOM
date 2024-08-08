package fire;

import java.util.LinkedList;

public class PcwDetailList {

	public PcwDetailList() {
		super();
	}

	private LinkedList<PcwDetailsRequest> pcwdetailsvariable;

	public LinkedList<PcwDetailsRequest> getPcwdetailsvariable() {
		return pcwdetailsvariable;
	}

	public PcwDetailList(LinkedList<PcwDetailsRequest> pcwdetailsvariable) {
		this.pcwdetailsvariable = pcwdetailsvariable;
	}

	public void setPcwdetailsvariable(LinkedList<PcwDetailsRequest> pcwdetailsvariable) {
		this.pcwdetailsvariable = pcwdetailsvariable;
	}

}
