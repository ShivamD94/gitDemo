
package model.Response.Cart.GetCartRes;

import model.Response.Quote.CreateQuoteResponse.Premium_;
import model.Response.Quote.CreateQuoteResponse.TaxAndServicePremium_;

public class Quote {

    private Boolean chosenQuote;
    private String priceAffinityType;
    private Boolean isCustom;
    private String id;
    private String deductibleType;
    private String annualPolicyMaximumLimit;
    private Double coPayPercentage;
    private Double annualDeductibleDollarAmount;
    private Premium_ premium;
    private TaxAndServicePremium_ taxAndServicePremium;
    private UpsellData upsellData;
    private String version;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeductibleType() {
        return deductibleType;
    }

    public void setDeductibleType(String deductibleType) {
        this.deductibleType = deductibleType;
    }

    public String getAnnualPolicyMaximumLimit() {
        return annualPolicyMaximumLimit;
    }

    public void setAnnualPolicyMaximumLimit(String annualPolicyMaximumLimit) {
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

    public Premium_ getPremium() {
        return premium;
    }

    public void setPremium(Premium_ premium) {
        this.premium = premium;
    }

    public TaxAndServicePremium_ getTaxAndServicePremium() {
        return taxAndServicePremium;
    }

    public void setTaxAndServicePremium(TaxAndServicePremium_ taxAndServicePremium) {
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
