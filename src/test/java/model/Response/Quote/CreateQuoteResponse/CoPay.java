
package model.Response.Quote.CreateQuoteResponse;


public class CoPay {

    private Integer percentage;
    private Premium premium;
    private TaxAndServicePremium taxAndServicePremium;

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
