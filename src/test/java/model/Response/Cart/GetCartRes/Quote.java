
package model.Response.Cart.GetCartRes;

import java.util.List;

public class Quote {

    private Integer annualDeductibleDollarAmount;
    private Integer annualPolicyMaximumLimit;
    private Boolean chosenQuote;
    private Integer coPayPercentage;
    private String deductibleType;
    private String id;
    private Boolean isCustom;
    private List<Integer> premium = null;
    private String priceAffinityType;
    private List<Integer> taxAndServicePremium = null;
    private UpsellData upsellData;
    private String version;

    public Integer getAnnualDeductibleDollarAmount() {
        return annualDeductibleDollarAmount;
    }

    public void setAnnualDeductibleDollarAmount(Integer annualDeductibleDollarAmount) {
        this.annualDeductibleDollarAmount = annualDeductibleDollarAmount;
    }

    public Integer getAnnualPolicyMaximumLimit() {
        return annualPolicyMaximumLimit;
    }

    public void setAnnualPolicyMaximumLimit(Integer annualPolicyMaximumLimit) {
        this.annualPolicyMaximumLimit = annualPolicyMaximumLimit;
    }

    public Boolean getChosenQuote() {
        return chosenQuote;
    }

    public void setChosenQuote(Boolean chosenQuote) {
        this.chosenQuote = chosenQuote;
    }

    public Integer getCoPayPercentage() {
        return coPayPercentage;
    }

    public void setCoPayPercentage(Integer coPayPercentage) {
        this.coPayPercentage = coPayPercentage;
    }

    public String getDeductibleType() {
        return deductibleType;
    }

    public void setDeductibleType(String deductibleType) {
        this.deductibleType = deductibleType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsCustom() {
        return isCustom;
    }

    public void setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
    }

    public List<Integer> getPremium() {
        return premium;
    }

    public void setPremium(List<Integer> premium) {
        this.premium = premium;
    }

    public String getPriceAffinityType() {
        return priceAffinityType;
    }

    public void setPriceAffinityType(String priceAffinityType) {
        this.priceAffinityType = priceAffinityType;
    }

    public List<Integer> getTaxAndServicePremium() {
        return taxAndServicePremium;
    }

    public void setTaxAndServicePremium(List<Integer> taxAndServicePremium) {
        this.taxAndServicePremium = taxAndServicePremium;
    }

    public UpsellData getUpsellData() {
        return upsellData;
    }

    public void setUpsellData(UpsellData upsellData) {
        this.upsellData = upsellData;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
