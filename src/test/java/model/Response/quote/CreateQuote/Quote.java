
package model.Response.quote.CreateQuote;

import java.util.List;

public class Quote {

    private String id;
    private String version;
    private Boolean chosenQuote;
    private String priceAffinityType;
    private Boolean isCustom;
    private String deductibleType;
    private Double annualPolicyMaximumLimit;
    private Double coPayPercentage;
    private Double annualDeductibleDollarAmount;
    private List<Double> premium = null;
    private List<Double> taxAndServicePremium = null;

//    public List Quote(){
//        return id;
//        return version;
//        return chosenQuote;
//        return priceAffinityType;
//        return isCustom;
//        return deductibleType;
//        return annualPolicyMaximumLimit;
//        return coPayPercentage;
//        return annualDeductibleDollarAmount;
//        return premium;
//        return taxAndServicePremium;
//
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getChosenQuote() {
        return chosenQuote;
    }

    public void setChosenQuote(Boolean chosenQuote) {
        this.chosenQuote = chosenQuote;
    }

    public String getPriceAffinityType() {
        return priceAffinityType;
    }

    public void setPriceAffinityType(String priceAffinityType) {
        this.priceAffinityType = priceAffinityType;
    }

    public Boolean getIsCustom() {
        return isCustom;
    }

    public void setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
    }

    public String getDeductibleType() {
        return deductibleType;
    }

    public void setDeductibleType(String deductibleType) {
        this.deductibleType = deductibleType;
    }

    public Double getAnnualPolicyMaximumLimit() {
        return annualPolicyMaximumLimit;
    }

    public void setAnnualPolicyMaximumLimit(Double annualPolicyMaximumLimit) {
        this.annualPolicyMaximumLimit = annualPolicyMaximumLimit;
    }

    public Double getCoPayPercentage() {
        return coPayPercentage;
    }

    public void setCoPayPercentage(Double coPayPercentage) {
        this.coPayPercentage = coPayPercentage;
    }

    public Double getAnnualDeductibleDollarAmount() {
        return annualDeductibleDollarAmount;
    }

    public void setAnnualDeductibleDollarAmount(Double annualDeductibleDollarAmount) {
        this.annualDeductibleDollarAmount = annualDeductibleDollarAmount;
    }

    public List<Double> getPremium() {
        return premium;
    }

    public void setPremium(List<Double> premium) {
        this.premium = premium;
    }

    public List<Double> getTaxAndServicePremium() {
        return taxAndServicePremium;
    }

    public void setTaxAndServicePremium(List<Double> taxAndServicePremium) {
        this.taxAndServicePremium = taxAndServicePremium;
    }

}
