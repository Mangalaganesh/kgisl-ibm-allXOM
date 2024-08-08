package Lb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.TimeZone;

public class Contribution {

	//ArrayList<ItemDetailsResponse> intList;
	
	
		private LinkedList<LocDetailResponse> locDetails;

		public Contribution() {
			super();
		}

		

		public Contribution(LinkedList<LocDetailResponse> locDetails) {
			super();
			this.locDetails = locDetails;
		}



		public LinkedList<LocDetailResponse> getLocDetails() {
			return locDetails;
		}



		public void setLocDetails(LinkedList<LocDetailResponse> locDetails) {
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

		public static double roundValue(double value, int decimalPlaces) {
			double scale = Math.pow(10, decimalPlaces);
			return Math.round(value * scale) / scale;
		}

		public static double roundMax(double value) {
			return Math.ceil(value);
		}
	
	

}
