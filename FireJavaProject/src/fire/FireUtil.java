package fire;
public class FireUtil {
		
	
	
	public static double checksRatePct(String consClsCode , double c1A, double c1B, double c2, double c3 ) {
		double sRatePct =0.0;
		String inputlowerCase = consClsCode.toLowerCase();
		switch (inputlowerCase) {
	    case "c1a":
	    	sRatePct = c1A;
	    	break;
	    case "c1b":
	    	sRatePct = c1B;
	        break;
	    case "c2":
	    	sRatePct = c2;
	        break;
	    case "c3":
	    	sRatePct = c3;
	        break;  
	    default:
	    	sRatePct = 0.0;
	}
		return sRatePct;
	}
	
	public static boolean checkNullPointer(String  nullCheck , boolean canContinue ) {
		
		if(nullCheck == null  || nullCheck.trim().isEmpty()) {
			canContinue =  false;
		}
		return canContinue;	
	}

	public static String trimEmpty(String  input) {
		if(input != null) {
		input =  input.trim();}
		return input;
	}

	
   public static double checklongTmPlan(String planCode , double planA, double planB, double planC, double planD, double planE ) {
		double planRate =0.0;
		
		String inputplanCode = planCode.toLowerCase();
		switch (inputplanCode) {
	    case "plana":
	    	planRate = planA;
	    	break;
	    case "planb":
	    	planRate = planB;
	        break;
	    case "planc":
	    	planRate = planC;
	        break;
	    case "pland":
	    	planRate = planD;
	        break;  
	    case "plane":
	    	planRate = planE;
	        break; 
	    default:
	    	planRate = 0.0;
	}
		return planRate;

	}
	
}


