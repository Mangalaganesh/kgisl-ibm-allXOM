package main.tariffcalculation;

public enum ChannelEnum {

	AGENCY("AGENCY"), BANCA("BANCA");

	private String value;

	private ChannelEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
