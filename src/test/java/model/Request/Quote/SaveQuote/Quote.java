
package model.Request.Quote.SaveQuote;

import model.Response.Quote.CreateQuoteResponse.Premium_;
import model.Response.Quote.CreateQuoteResponse.TaxAndServicePremium_;

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
    private Premium_ premium;
    private TaxAndServicePremium_ taxAndServicePremium;
    private UpsellData upsellData;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Quote() {
    }

    /**
     * 
     * @param annualDeductibleDollarAmount
     * @param premium
     * @param priceAffinityType
     * @param deductibleType
     * @param isCustom
     * @param coPayPercentage
     * @param taxAndServicePremium
     * @param id
     * @param chosenQuote
     * @param annualPolicyMaximumLimit
     * @param upsellData
     * @param version
     */
    public Quote(String id, String version, Boolean chosenQuote, String priceAffinityType, Boolean isCustom, String deductibleType, Double annualPolicyMaximumLimit, Double coPayPercentage, Double annualDeductibleDollarAmount, Premium_ premium, TaxAndServicePremium_ taxAndServicePremium, UpsellData upsellData) {
        super();
        this.id = id;
        this.version = version;
        this.chosenQuote = chosenQuote;
        this.priceAffinityType = priceAffinityType;
        this.isCustom = isCustom;
        this.deductibleType = deductibleType;
        this.annualPolicyMaximumLimit = annualPolicyMaximumLimit;
        this.coPayPercentage = coPayPercentage;
        this.annualDeductibleDollarAmount = annualDeductibleDollarAmount;
        this.premium = premium;
        this.taxAndServicePremium = taxAndServicePremium;
        this.upsellData = upsellData;
    }

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

}
