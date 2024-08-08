import java.util.ArrayList;

public class Location {

	private ArrayList<LocationDetail> locDetails;

	public Location() {
		super();
	}

	public Location(ArrayList<LocationDetail> locDetails) {
		this.locDetails = locDetails;
	}

	public ArrayList<LocationDetail> getLocDetails() {
		return locDetails;
	}

	public void setLocDetails(ArrayList<LocationDetail> locDetails) {
		this.locDetails = locDetails;
	}
	
	
}
