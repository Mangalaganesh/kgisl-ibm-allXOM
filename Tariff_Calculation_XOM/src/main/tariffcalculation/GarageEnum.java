package main.tariffcalculation;

public enum GarageEnum {

	DEALER("DEALER"), NORMAL("NORMAL");

	private String value;

	private GarageEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
