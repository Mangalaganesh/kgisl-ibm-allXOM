package main.tariffcalculation;

public enum UsageEnum {

	PRIVATE("PRIVATE"), COMMERCIAL("COMMERCIAL");

	private String value;

	private UsageEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
