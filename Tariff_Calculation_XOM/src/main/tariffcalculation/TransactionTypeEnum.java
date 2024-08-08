package main.tariffcalculation;

public enum TransactionTypeEnum {

	NEWBUSINESS("NEWBUSINESS"), RENEWAL("RENEWAL");

	private String value;

	private TransactionTypeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
