import java.util.ArrayList;

public class Commodity {

	private ArrayList<InterestRequest> intList;

	public Commodity() {
		super();
	}

	public Commodity(ArrayList<InterestRequest> intList) {

		this.intList = intList;
	}

	public ArrayList<InterestRequest> getIntList() {
		return intList;
	}

	public void setIntList(ArrayList<InterestRequest> intList) {
		this.intList = intList;
	}

}
