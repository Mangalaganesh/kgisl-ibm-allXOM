package Response;

public class PremiumComputaion {

	private double actBasePremium;
	private double nonActBasePremium;
	private double basicPremium;
	private double technicalPremium;
	private double allRiderAmount;
	private double vehicleAgeLoading;
	private double insuredAgeLoading;
	private double afterLoading;
	private double annualPremium;
	private double ncdPercent;
	private double ncdAmount;
	private double tariffExtraCoverageAmount;
	private double detariffExtcvgPerc;
	private double detariffExtcvgAmount;
	private double grossPremium;
	private double gstPercent;
	private double gstPremium;
	private double commissionPercent;
	private double commissionAmount;
	private double gstCommissionPercent;
	private double gstCommissionAmount;
	private double fleetDiscountAmount;
	private double fleetLoadAmount;
	private double excessFactor;
	private double excessAmount;
	private double voluntaryExcessDiscount;
	private double rhbAllowedDiscount;
	private double rhbAllowedLoading;
	private double commercialPremium;
	private double netPremium;
	private double paydPerc;
	private double paydDisc;
	private double paydDiscOnExt;
	private double paydDiscOnBasic;
	private double totalPremium;
	private double grossWithTax;
	private double excessDiscAmt;
	private double revisedGross;
	private double totalDiscountPerc;
	private double taxAmt;
	private double grossWithNcd;
	private double vehAgeLoadAmt;
	private double ehailingAmt;
	private double grossWithoutExt;
	private double commAmt;
	private double rebateAmt;
	private double taxCommAmt;
	private double vehAgeLoadPerc;
	private double taxCommPerc;
	private double taxPerc;
	private double actPerc;
	private double excessDiscPerc;
	
	public PremiumComputaion(double actBasePremium, double nonActBasePremium, double basicPremium, double technicalPremium,
			double allRiderAmount, double vehicleAgeLoading, double insuredAgeLoading, double afterLoading,
			double annualPremium, double ncdPercent, double ncdAmount, double tariffExtraCoverageAmount,
			double detariffExtcvgPerc, double detariffExtcvgAmount, double grossPremium, double gstPercent,
			double gstPremium, double commissionPercent, double commissionAmount, double gstCommissionPercent,
			double gstCommissionAmount, double fleetDiscountAmount, double fleetLoadAmount, double excessFactor,
			double excessAmount, double voluntaryExcessDiscount, double rhbAllowedDiscount, double rhbAllowedLoading,
			double commercialPremium, double netPremium, double paydPerc, double paydDisc, double paydDiscOnExt,
			double paydDiscOnBasic,double totalPremium, double grossWithTax, double excessDiscAmt,
			double revisedGross,
			double totalDiscountPerc,double taxAmt,double grossWithNcd,double vehAgeLoadAmt,
			double ehailingAmt,double grossWithoutExt,double commAmt,double rebateAmt,double taxCommAmt,
			double vehAgeLoadPerc, double taxCommPerc,double taxPerc,double actPerc,double excessDiscPerc) {
		super();
		this.actBasePremium = actBasePremium;
		this.nonActBasePremium = nonActBasePremium;
		this.basicPremium = basicPremium;
		this.technicalPremium = technicalPremium;
		this.allRiderAmount = allRiderAmount;
		this.vehicleAgeLoading = vehicleAgeLoading;
		this.insuredAgeLoading = insuredAgeLoading;
		this.afterLoading = afterLoading;
		this.annualPremium = annualPremium;
		this.ncdPercent = ncdPercent;
		this.ncdAmount = ncdAmount;
		this.tariffExtraCoverageAmount = tariffExtraCoverageAmount;
		this.detariffExtcvgPerc = detariffExtcvgPerc;
		this.detariffExtcvgAmount = detariffExtcvgAmount;
		this.grossPremium = grossPremium;
		this.gstPercent = gstPercent;
		this.gstPremium = gstPremium;
		this.commissionPercent = commissionPercent;
		this.commissionAmount = commissionAmount;
		this.gstCommissionPercent = gstCommissionPercent;
		this.gstCommissionAmount = gstCommissionAmount;
		this.fleetDiscountAmount = fleetDiscountAmount;
		this.fleetLoadAmount = fleetLoadAmount;
		this.excessFactor = excessFactor;
		this.excessAmount = excessAmount;
		this.voluntaryExcessDiscount = voluntaryExcessDiscount;
		this.rhbAllowedDiscount = rhbAllowedDiscount;
		this.rhbAllowedLoading = rhbAllowedLoading;
		this.commercialPremium = commercialPremium;
		this.netPremium = netPremium;
		this.paydPerc = paydPerc;
		this.paydDisc = paydDisc;
		this.paydDiscOnExt = paydDiscOnExt;
		this.paydDiscOnBasic = paydDiscOnBasic;
		this.totalPremium= totalPremium;
		this.grossWithTax= grossWithTax;
		this.excessDiscAmt= excessDiscAmt;
		this.revisedGross=revisedGross;
		this.totalDiscountPerc=totalDiscountPerc;
		this.taxAmt=taxAmt;
		this.grossWithNcd=grossWithNcd;
		
		this.vehAgeLoadAmt=vehAgeLoadAmt;
		this.ehailingAmt=ehailingAmt;
		this.grossWithoutExt=grossWithoutExt;
		this.commAmt=commAmt;
		this.rebateAmt=rebateAmt;
		this.taxCommAmt=taxCommAmt;
		this.vehAgeLoadPerc=vehAgeLoadPerc;
		this.taxCommPerc= taxCommPerc;
		this.taxPerc=taxPerc;
		this.actPerc=actPerc;
		this.excessDiscPerc=excessDiscPerc;
		
	}

	public double getTotalDiscountPerc() {
		return totalDiscountPerc;
	}

	public void setTotalDiscountPerc(double totalDiscountPerc) {
		this.totalDiscountPerc = totalDiscountPerc;
	}

	public double getTaxAmt() {
		return taxAmt;
	}

	public void setTaxAmt(double taxAmt) {
		this.taxAmt = taxAmt;
	}

	public double getGrossWithNcd() {
		return grossWithNcd;
	}

	public void setGrossWithNcd(double grossWithNcd) {
		this.grossWithNcd = grossWithNcd;
	}



	public double getVehAgeLoadAmt() {
		return vehAgeLoadAmt;
	}

	public void setVehAgeLoadAmt(double vehAgeLoadAmt) {
		this.vehAgeLoadAmt = vehAgeLoadAmt;
	}

	public double getEhailingAmt() {
		return ehailingAmt;
	}

	public void setEhailingAmt(double ehailingAmt) {
		this.ehailingAmt = ehailingAmt;
	}

	public double getGrossWithoutExt() {
		return grossWithoutExt;
	}

	public void setGrossWithoutExt(double grossWithoutExt) {
		this.grossWithoutExt = grossWithoutExt;
	}

	public double getCommAmt() {
		return commAmt;
	}

	public void setCommAmt(double commAmt) {
		this.commAmt = commAmt;
	}

	public double getRebateAmt() {
		return rebateAmt;
	}

	public void setRebateAmt(double rebateAmt) {
		this.rebateAmt = rebateAmt;
	}

	public double getTaxCommAmt() {
		return taxCommAmt;
	}

	public void setTaxCommAmt(double taxCommAmt) {
		this.taxCommAmt = taxCommAmt;
	}

	public double getExcessDiscAmt() {
		return excessDiscAmt;
	}

	public void setExcessDiscAmt(double excessDiscAmt) {
		this.excessDiscAmt = excessDiscAmt;
	}

	public double getRevisedGross() {
		return revisedGross;
	}

	public void setRevisedGross(double revisedGross) {
		this.revisedGross = revisedGross;
	}

	public double getGrossWithTax() {
		return grossWithTax;
	}

	public void setGrossWithTax(double grossWithTax) {
		this.grossWithTax = grossWithTax;
	}

	public double getTotalPremium() {
		return totalPremium;
	}

	public void setTotalPremium(double totalPremium) {
		this.totalPremium = totalPremium;
	}

	public PremiumComputaion() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public double getActBasePremium() {
		return actBasePremium;
	}

	public void setActBasePremium(double actBasePremium) {
		this.actBasePremium = actBasePremium;
	}

	public double getNonActBasePremium() {
		return nonActBasePremium;
	}

	public void setNonActBasePremium(double nonActBasePremium) {
		this.nonActBasePremium = nonActBasePremium;
	}

	public double getBasicPremium() {
		return basicPremium;
	}

	public void setBasicPremium(double basicPremium) {
		this.basicPremium = basicPremium;
	}

	public double getTechnicalPremium() {
		return technicalPremium;
	}

	public void setTechnicalPremium(double technicalPremium) {
		this.technicalPremium = technicalPremium;
	}

	public double getAllRiderAmount() {
		return allRiderAmount;
	}

	public void setAllRiderAmount(double allRiderAmount) {
		this.allRiderAmount = allRiderAmount;
	}

	public double getVehicleAgeLoading() {
		return vehicleAgeLoading;
	}

	public void setVehicleAgeLoading(double vehicleAgeLoading) {
		this.vehicleAgeLoading = vehicleAgeLoading;
	}

	public double getInsuredAgeLoading() {
		return insuredAgeLoading;
	}

	public void setInsuredAgeLoading(double insuredAgeLoading) {
		this.insuredAgeLoading = insuredAgeLoading;
	}

	public double getAfterLoading() {
		return afterLoading;
	}

	public void setAfterLoading(double afterLoading) {
		this.afterLoading = afterLoading;
	}

	public double getAnnualPremium() {
		return annualPremium;
	}

	public void setAnnualPremium(double annualPremium) {
		this.annualPremium = annualPremium;
	}

	public double getNcdPercent() {
		return ncdPercent;
	}

	public void setNcdPercent(double ncdPercent) {
		this.ncdPercent = ncdPercent;
	}

	public double getNcdAmount() {
		return ncdAmount;
	}

	public void setNcdAmount(double ncdAmount) {
		this.ncdAmount = ncdAmount;
	}

	public double getTariffExtraCoverageAmount() {
		return tariffExtraCoverageAmount;
	}

	public void setTariffExtraCoverageAmount(double tariffExtraCoverageAmount) {
		this.tariffExtraCoverageAmount = tariffExtraCoverageAmount;
	}

	public double getDetariffExtcvgPerc() {
		return detariffExtcvgPerc;
	}

	public void setDetariffExtcvgPerc(double detariffExtcvgPerc) {
		this.detariffExtcvgPerc = detariffExtcvgPerc;
	}

	public double getDetariffExtcvgAmount() {
		return detariffExtcvgAmount;
	}

	public void setDetariffExtcvgAmount(double detariffExtcvgAmount) {
		this.detariffExtcvgAmount = detariffExtcvgAmount;
	}

	public double getGrossPremium() {
		return grossPremium;
	}

	public void setGrossPremium(double grossPremium) {
		this.grossPremium = grossPremium;
	}

	public double getGstPercent() {
		return gstPercent;
	}

	public void setGstPercent(double gstPercent) {
		this.gstPercent = gstPercent;
	}

	public double getGstPremium() {
		return gstPremium;
	}

	public void setGstPremium(double gstPremium) {
		this.gstPremium = gstPremium;
	}

	public double getCommissionPercent() {
		return commissionPercent;
	}

	public void setCommissionPercent(double commissionPercent) {
		this.commissionPercent = commissionPercent;
	}

	public double getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public double getGstCommissionPercent() {
		return gstCommissionPercent;
	}

	public void setGstCommissionPercent(double gstCommissionPercent) {
		this.gstCommissionPercent = gstCommissionPercent;
	}

	public double getGstCommissionAmount() {
		return gstCommissionAmount;
	}

	public void setGstCommissionAmount(double gstCommissionAmount) {
		this.gstCommissionAmount = gstCommissionAmount;
	}

	public double getFleetDiscountAmount() {
		return fleetDiscountAmount;
	}

	public void setFleetDiscountAmount(double fleetDiscountAmount) {
		this.fleetDiscountAmount = fleetDiscountAmount;
	}

	public double getFleetLoadAmount() {
		return fleetLoadAmount;
	}

	public void setFleetLoadAmount(double fleetLoadAmount) {
		this.fleetLoadAmount = fleetLoadAmount;
	}

	public double getExcessFactor() {
		return excessFactor;
	}

	public void setExcessFactor(double excessFactor) {
		this.excessFactor = excessFactor;
	}

	public double getExcessAmount() {
		return excessAmount;
	}

	public void setExcessAmount(double excessAmount) {
		this.excessAmount = excessAmount;
	}

	public double getVoluntaryExcessDiscount() {
		return voluntaryExcessDiscount;
	}

	public void setVoluntaryExcessDiscount(double voluntaryExcessDiscount) {
		this.voluntaryExcessDiscount = voluntaryExcessDiscount;
	}

	public double getRhbAllowedDiscount() {
		return rhbAllowedDiscount;
	}

	public void setRhbAllowedDiscount(double rhbAllowedDiscount) {
		this.rhbAllowedDiscount = rhbAllowedDiscount;
	}

	public double getRhbAllowedLoading() {
		return rhbAllowedLoading;
	}

	public void setRhbAllowedLoading(double rhbAllowedLoading) {
		this.rhbAllowedLoading = rhbAllowedLoading;
	}

	public double getCommercialPremium() {
		return commercialPremium;
	}

	public void setCommercialPremium(double commercialPremium) {
		this.commercialPremium = commercialPremium;
	}

	public double getNetPremium() {
		return netPremium;
	}

	public void setNetPremium(double netPremium) {
		this.netPremium = netPremium;
	}

	public double getPaydPerc() {
		return paydPerc;
	}

	public void setPaydPerc(double paydPerc) {
		this.paydPerc = paydPerc;
	}

	public double getPaydDisc() {
		return paydDisc;
	}

	public void setPaydDisc(double paydDisc) {
		this.paydDisc = paydDisc;
	}

	public double getPaydDiscOnExt() {
		return paydDiscOnExt;
	}

	public void setPaydDiscOnExt(double paydDiscOnExt) {
		this.paydDiscOnExt = paydDiscOnExt;
	}

	public double getPaydDiscOnBasic() {
		return paydDiscOnBasic;
	}

	public void setPaydDiscOnBasic(double paydDiscOnBasic) {
		this.paydDiscOnBasic = paydDiscOnBasic;
	}
	

	public double getVehAgeLoadPerc() {
		return vehAgeLoadPerc;
	}

	public void setVehAgeLoadPerc(double vehAgeLoadPerc) {
		this.vehAgeLoadPerc = vehAgeLoadPerc;
	}
	

	public double getTaxCommPerc() {
		return taxCommPerc;
	}

	public void setTaxCommPerc(double taxCommPerc) {
		this.taxCommPerc = taxCommPerc;
	}
	

	public double getTaxPerc() {
		return taxPerc;
	}

	public void setTaxPerc(double taxPerc) {
		this.taxPerc = taxPerc;
	}
	

	public double getActPerc() {
		return actPerc;
	}

	public void setActPerc(double actPerc) {
		this.actPerc = actPerc;
	}
	

	public double getExcessDiscPerc() {
		return excessDiscPerc;
	}

	public void setExcessDiscPerc(double excessDiscPerc) {
		this.excessDiscPerc = excessDiscPerc;
	}

	@Override
	public String toString() {
		return "PremiumComputaion [actBasePremium=" + actBasePremium + ", nonActBasePremium=" + nonActBasePremium
				+ ", basicPremium=" + basicPremium + ", technicalPremium=" + technicalPremium + ", allRiderAmount="
				+ allRiderAmount + ", vehicleAgeLoading=" + vehicleAgeLoading + ", insuredAgeLoading="
				+ insuredAgeLoading + ", afterLoading=" + afterLoading + ", annualPremium=" + annualPremium
				+ ", ncdPercent=" + ncdPercent + ", ncdAmount=" + ncdAmount + ", tariffExtraCoverageAmount="
				+ tariffExtraCoverageAmount + ", detariffExtcvgPerc=" + detariffExtcvgPerc + ", detariffExtcvgAmount="
				+ detariffExtcvgAmount + ", grossPremium=" + grossPremium + ", gstPercent=" + gstPercent
				+ ", gstPremium=" + gstPremium + ", commissionPercent=" + commissionPercent + ", commissionAmount="
				+ commissionAmount + ", gstCommissionPercent=" + gstCommissionPercent + ", gstCommissionAmount="
				+ gstCommissionAmount + ", fleetDiscountAmount=" + fleetDiscountAmount + ", fleetLoadAmount="
				+ fleetLoadAmount + ", excessFactor=" + excessFactor + ", excessAmount=" + excessAmount
				+ ", voluntaryExcessDiscount=" + voluntaryExcessDiscount + ", rhbAllowedDiscount=" + rhbAllowedDiscount
				+ ", rhbAllowedLoading=" + rhbAllowedLoading + ", commercialPremium=" + commercialPremium
				+ ", netPremium=" + netPremium + ", paydPerc=" + paydPerc + ", paydDisc=" + paydDisc
				+ ", paydDiscOnExt=" + paydDiscOnExt + ", paydDiscOnBasic=" + paydDiscOnBasic + "]";
	}
	

}
