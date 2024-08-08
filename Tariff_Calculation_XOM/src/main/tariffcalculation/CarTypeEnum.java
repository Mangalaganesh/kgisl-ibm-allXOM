package main.tariffcalculation;

public enum CarTypeEnum {

	SEDAN110("SEDAN110");

	private String value;

	private CarTypeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
