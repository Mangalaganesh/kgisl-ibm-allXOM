package main.tariffcalculation;

public class TariffCalculationInputVariables {

	private double sumInsured;

	private CoverageEnum coverage;

	private UsageEnum usage;

	private double carAge;

	private double capacity;

	private MakeModel makeModel;

    private double noOfClaims;

	private ChannelEnum channel;

	private TransactionTypeEnum transactionType;

	private String carType;

	private double driverCount;

	private GarageEnum garage;

	private int seats;

	private String countryCode;

	private double claimRatio;

	private Discount discount;

	public double getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(double sumInsured) {
		this.sumInsured = sumInsured;
	}

	public CoverageEnum getCoverage() {
		return coverage;
	}

	public void setCoverage(CoverageEnum coverage) {
		this.coverage = coverage;
	}

	public UsageEnum getUsage() {
		return usage;
	}

	public void setUsage(UsageEnum usage) {
		this.usage = usage;
	}

	public double getCarAge() {
		return carAge;
	}

	public void setCarAge(double carAge) {
		this.carAge = carAge;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public MakeModel getMakeModel() {
		return makeModel;
	}

	public void setMakeModel(MakeModel makeModel) {
		this.makeModel = makeModel;
	}



	public ChannelEnum getChannel() {
		return channel;
	}

	public void setChannel(ChannelEnum channel) {
		this.channel = channel;
	}

	public TransactionTypeEnum getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionTypeEnum transactionType) {
		this.transactionType = transactionType;
	}

//	public CarTypeEnum getCarType() {
//		return carType;
//	}
//
//	public void setCarType(CarTypeEnum carType) {
//		this.carType = carType;
//	}

	public double getDriverCount() {
		return driverCount;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public void setDriverCount(double driverCount) {
		this.driverCount = driverCount;
	}

	public GarageEnum getGarage() {
		return garage;
	}

	public void setGarage(GarageEnum garage) {
		this.garage = garage;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public double getClaimRatio() {
		return claimRatio;
	}

	public void setClaimRatio(double claimRatio) {
		this.claimRatio = claimRatio;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public double getNoOfClaims() {
		return noOfClaims;
	}

	public void setNoOfClaims(double noOfClaims) {
		this.noOfClaims = noOfClaims;
	}
	

}
