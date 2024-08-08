import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class Contribution {
	private ArrayList<LocationDetailsResponse> locDetails;

	public Contribution() {
		super();
	}

	public Contribution(ArrayList<LocationDetailsResponse> locDetails) {
		
		this.locDetails = locDetails;
	}

	public ArrayList<LocationDetailsResponse> getLocDetails() {
		return locDetails;
	}

	public void setLocDetails(ArrayList<LocationDetailsResponse> locDetails) {
		this.locDetails = locDetails;
	}

	public static Date converDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date response = new Date();
		try {
			response = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

}
