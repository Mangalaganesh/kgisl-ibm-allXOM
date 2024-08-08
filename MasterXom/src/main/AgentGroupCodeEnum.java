package main;

public enum AgentGroupCodeEnum {

	TAB("TAB"), ABC("ABC"), XYZ("XYZ");

	private String value;

	private AgentGroupCodeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
