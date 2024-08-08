package main.tariffcalculation;

public enum CoverageEnum {

	COMPREHENSIVE("COMPREHENSIVE");

	private String value;

	private CoverageEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
