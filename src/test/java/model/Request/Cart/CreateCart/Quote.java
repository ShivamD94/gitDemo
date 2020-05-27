
package model.Request.Cart.CreateCart;

import java.util.List;

public class Quote {

    private String id;
    private String version;
    private Boolean chosenQuote;
    private String priceAffinityType;
    private Boolean isCustom;
    private String deductibleType;
    private String annualPolicyMaximumLimit;
    private Double coPayPercentage;
    private Double annualDeductibleDollarAmount;
    private List<Double> premium = null;
    private List<Double> taxAndServicePremium = null;
    private UpsellData upsellData;

    public Quote(String id,String version,Boolean chosenQuote,String priceAffinityType,Boolean isCustom,String deductibleType,
                 String annualPolicyMaximumLimit,Double coPayPercentage,Double annualDeductibleDollarAmount,
                 List<Double> premium,List<Double> taxAndServicePremium,UpsellData upsellData){
        this.id=id;
        this.version=version;
        this.chosenQuote=chosenQuote;
        this.priceAffinityType=priceAffinityType;
        this.isCustom=isCustom;
        this.deductibleType=deductibleType;
        this.annualPolicyMaximumLimit=annualPolicyMaximumLimit;
        this.coPayPercentage=coPayPercentage;
        this.annualDeductibleDollarAmount=annualDeductibleDollarAmount;
        this.premium=premium;
        this.taxAndServicePremium=taxAndServicePremium;
        this.upsellData=upsellData;
    }

    public String getId() {
        return id;
    }
    public String getVersion() {
        return version;
    }
    public Boolean getChosenQuote() {
        return chosenQuote;
    }
    public String getPriceAffinityType() {
        return priceAffinityType;
    }
    public Boolean getIsCustom() {
        return isCustom;
    }
    public String getDeductibleType() {
        return deductibleType;
    }
    public String getAnnualPolicyMaximumLimit() {
        return annualPolicyMaximumLimit;
    }
    public Double getCoPayPercentage() {
        return coPayPercentage;
    }
    public Double getAnnualDeductibleDollarAmount() {
        return annualDeductibleDollarAmount;
    }
    public List<Double> getPremium() {
        return premium;
    }
    public List<Double> getTaxAndServicePremium() {
        return taxAndServicePremium;
    }
    public UpsellData getUpsellData() {
        return upsellData;
    }

}
