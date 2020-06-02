
package model.Response.Cart.GetCartRes;

import model.Response.Quote.CreateQuoteResponse.Premium;
import model.Response.Quote.CreateQuoteResponse.TaxAndServicePremium;

public class CoPay {

    private Double percentage;
    private Premium premium;
    private TaxAndServicePremium taxAndServicePremium;

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
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
