package main;

import java.util.Date;

import main.genric.Master;

public class Validation {

	public static String validate(String inClsCode, String vClsCode, String inProductCode, String vProductCode) {
		String response = "";
		if (!vClsCode.contains(inClsCode)) {
			response = "Main Class Code Mismatch.";
		}
		if (!vProductCode.contains(inProductCode)) {
			response = "Product Code Mismatch.";
		}
		return response;
	}

	public static String validate(Master inMaster, Master vMaster) {
		String response = "";

		if (!vMaster.getMainClsCode().equals(inMaster.getMainClsCode())) {
			response += "Main Class Code Mismatch. ";
		}

		if (!vMaster.getProductCode().equals(inMaster.getProductCode())) {
			response += "Product Code Mismatch. ";
		}

		return response.trim();

	}

	public static String validateM(Master inMaster, Master vMaster) {
		String response = "";

		if (!vMaster.getMainClsCode().equals(inMaster.getMainClsCode())) {
			response += "Main Class Code Mismatch. ";
		}

		if (!vMaster.getProductCode().equals(inMaster.getProductCode())) {
			response = response + " Product Code Mismatch. ";
		}

		return response.trim();

	}

	public static String validateS(String inClsCode, String vClsCode, String inProductCode, String vProductCode) {
		String response = "";
		if (!vClsCode.contains(inClsCode)) {
			response = "Main Class Code Mismatch.";
		}
		if (!vProductCode.contains(inProductCode)) {
			response = response + " Product Code Mismatch.";
		}
		return response;
	}

}
