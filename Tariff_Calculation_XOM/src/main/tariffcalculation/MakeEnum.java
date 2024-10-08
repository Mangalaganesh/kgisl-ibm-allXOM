package main.tariffcalculation;

public enum MakeEnum {

	ISUZU("ISUZU"), MITSUBISHI("MITSUBISHI"), CHEVROLET("CHEVROLET"), HONDA("HONDA"), MAZDA("MAZDA"), NISSAN("NISSAN"),
	FORD("FORD"), MG("MG"), TOYOTA("TOYOTA"), TR("TR"), HAVAL("HAVAL"), SUZUKI("SUZUKI"), MINI("MINI"),
	SUBARU("SUBARU"), VOLKSWAGEN("VOLKSWAGEN"), VOLVO("VOLVO"), HYUNDAI("HYUNDAI"), AUDI("AUDI"), BMW("BMW"),
	BYD("BYD"), GREAT_WALL("GREAT WALL"), JAGUAR("JAGUAR"), KIA("KIA"), LOTUS("LOTUS"), MAXUS("MAXUS"),
	MERCEDES_BENZ("MERCEDES-BENZ"), NETA("NETA"), PORSCHE("PORSCHE"), RENAULT("RENAULT"), SMART("SMART"),
	TESLA("TESLA"), DUCATI("DUCATI"), ASTON("ASTON"), BENTLEY("BENTLEY"), CADILLAC("CADILLAC"), DAIMLER("DAIMLER"),
	FERRARI("FERRARI"), MASERATI("MASERATI"), NISSSAN("NISSSAN"), ROLLSROYCE("ROLLSROYCE"), ALFA("ALFA"),
	CHRYSLER("CHRYSLER"), CITROEN("CITROEN"), HOLDEN("HOLDEN"), JEEPCHEROKEE("JEEPCHEROKEE"), LANDROVER("LANDROVER"),
	LEXUS("LEXUS"), MAGSO("MAGSO"), MERCEDESBENZ("MERCEDESBENZ"), OPEL("OPEL"), PEUGEOT("PEUGEOT"), ROVER("ROVER"),
	SAAB("SAAB"), TOYATA("TOYATA"),DAIHATSU("DAIHATSU"),FIAT("FIAT"),OPEI("OPEI"),PROTON("PROTON"),SEAT("SEAT");

	private String value;

	private MakeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
