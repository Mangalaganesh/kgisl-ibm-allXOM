package fire;

import java.util.LinkedList;

public class LocationDetailsResponse {
	
	private LinkedList<LocDetailResponse> locDetails;

	public LocationDetailsResponse() {
		super();
	}
	
	 public LocationDetailsResponse(LinkedList<LocDetailResponse> locDetails) {
		this.locDetails = locDetails;
	}

	public LinkedList<LocDetailResponse> getLocDetails() {
		return locDetails;
	}

	public void setLocDetails(LinkedList<LocDetailResponse> locDetails) {
		this.locDetails = locDetails;
	}

}
