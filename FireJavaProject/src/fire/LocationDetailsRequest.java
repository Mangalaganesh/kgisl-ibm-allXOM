package fire;

import java.util.LinkedList;

public class LocationDetailsRequest {

	public LocationDetailsRequest() {
		super();
	}

	public LocationDetailsRequest(LinkedList<LocDetailRequest> locDetails) {
		this.locDetails = locDetails;
	}

	private LinkedList<LocDetailRequest> locDetails;

	public LinkedList<LocDetailRequest> getLocDetails() {
		return locDetails;
	}

	public void setLocDetails(LinkedList<LocDetailRequest> locDetails) {
		this.locDetails = locDetails;
	}

}
