package main.tariffcalculation;

public enum ModelEnum {

	MU_7("MU-7"), MU_X("MU-X"), PAJERO_SPORT("PAJERO SPORT"), XPANDER("XPANDER"), OUTLANDER("OUTLANDER"),
	CAPTIVA("CAPTIVA"), BR_V("BR-V"), CR_V("CR-V"), FREED("FREED"), CX_3("CX-3"), CX_30("CX-30"), CX_5("CX-5"),
	CX_8("CX-8"), JUKE("JUKE"), KICKS("KICKS"), LIVINA("LIVINA"), TERRA("TERRA"), X_TRAIL("X-TRAIL"),
	ECOSPORT("ECOSPORT"), ESCAPE("ESCAPE"), EVEREST("EVEREST"),FIESTA("FIESTA"), XL7("XL7"), GS("GS"), HS("HS"), HS_PHEV("HS PHEV"),
	ZS("ZS"), C_HR("C-HR"), COROLLA_CROSS("COROLLA CROSS"), FORTUNER("FORTUNER"), VELOZ("VELOZ"),
	TRANSFORMER("TRANSFORMER"), TRANSFORMER_LL("TRANSFORMER LL"), H6("H6"), JOLION("JOLION"), ALPHARD("ALPHARD"),
	ESQUIRE("ESQUIRE"), ESTIMA("ESTIMA"), HARRIER("HARRIER"), VELLFIRE("VELLFIRE"), VENTURY("VENTURY"),
	LANDCRUISER_PRADO("LANDCRUISER PRADO"), VOXY("VOXY"), COOPER("COOPER"), ONE("ONE"), OUTBACK("OUTBACK"),
	IMPREZA("IMPREZA"), LEGACY("LEGACY"), BEETLE("BEETLE"), S60("S60"), S80("S80"), S90("S90"), V40("V40"), V90("V90"),
	XC40("XC40"), XC60("XC60"), XC90("XC90"), GRAND_STAREX("GRAND STAREX"), H_1("H-1"), TUCSON("TUCSON"),
	VELOSTER("VELOSTER"), IX1("IX1"), IX("IX"), I4("I4"), IX3("IX3"), I5("I5"), I7("I7"), I3("I3"), ATTO_3("ATTO 3"),
	DOLPHIN("DOLPHIN"), ORA("ORA"), KONA("KONA"), ELETRE("ELETRE"), MIFA("MIFA"), EDELIVER("EDELIVER"), MX_30("MX-30"),
	EQS("EQS"), EQE("EQE"), EQC("EQC"), EQB("EQB"), EQA("EQA"), I_MIEV("I-MIEV"), V("V"), TWIZY("TWIZY"),
	FLUENCE("FLUENCE"), HX11("HX11"), MODEL_Y("MODEL Y"), MODEL_3("MODEL 3"), MONSTER1200("MONSTER 1200"),
	MARTIN("MARTIN"), NSX("NSX"), LEGEND("LEGEND"), ODYSSEY("ODYSSEY"), PRELUDE("PRELUDE"), PRESIDENT("PRESIDENT"),
	INFINITTY("INFINITTY"), SUPRA("SUPRA"), CBU("CBU"), ROMEO("ROMEO"), TROOPER("TROOPER"), MX5("MX5"),
	PAJERO("PAJERO"), CALIBRA("CALIBRA"), OMAGA("OMAGA"), VECTRA("VECTRA"), CELICA("CELICA"), CROWN("CROWN"),
	LANDCRUISER("LANDCRUISER"), RAV4("RAV4"), ZAFIRA("ZAFIRA"), GRAN("GRAN"), TERIOS("TERIOS"), ACCORD("ACCORD"),
	CIVIC("CIVIC"), CRV("CRV"), CAMEO("CAMEO"), RODEO("RODEO"), VEGA("VEGA"), VERTEX("VERTEX"), _121("121"),
	_626("626"), ASTINA("ASTINA"), CRONOS("CRONOS"), LANTIS("LANTIS"), GALANT("GALANT"), _200SX("200SX"),
	CEFIRO("CEFIRO"), PRIMERA("PRIMERA"), ASTRA("ASTRA"), CORSA("CORSA"), SEGA("SEGA"), ESTEEM("ESTEEM"),
	VITARA("VITARA"), CAMRY("CAMRY"), CORONA("CORONA"), STARLET("STARLET"), CKD("CKD"), _323("323"), CHAMP("CHAMP"),
	COROLLA("COROLLA"), SPORTRIDER("SPORTRIDER"), MIRA("MIRA"), CITY("CITY"), FAMILIA("FAMILIA"), NV("NV"),
	SUNNY("SUNNY"), CARRIBIAN("CARRIBIAN"), SOLUNA("SOLUNA") ;

	private String value;

	private ModelEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
