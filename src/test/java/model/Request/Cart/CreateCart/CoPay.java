
package model.Request.Cart.CreateCart;

public class CoPay {

    private Integer percentage;
    private Premium premium;
    private TaxAndServicePremium taxAndServicePremium;
    /**
     * 
     * @param premium
     * @param percentage
     * @param taxAndServicePremium
     */
    public CoPay(Integer percentage, Premium premium, TaxAndServicePremium taxAndServicePremium) {
        super();
        this.percentage = percentage;
        this.premium = premium;
        this.taxAndServicePremium = taxAndServicePremium;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public Premium getPremium() {
        return premium;
    }

    public void setPremium(Premium premium) {
        this.premium = premium;
    }

    public TaxAndServicePremium getTaxAndServicePremium() {
        return taxAndServicePremium;
    }

    public void setTaxAndServicePremium(TaxAndServicePremium taxAndServicePremium) {
        this.taxAndServicePremium = taxAndServicePremium;
    }

}
