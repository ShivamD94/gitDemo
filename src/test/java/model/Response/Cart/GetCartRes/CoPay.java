
package model.Response.Cart.GetCartRes;

import java.util.List;

public class CoPay {

    private Double percentage;
    private List<Double> premium = null;
    private List<Double> taxAndServicePremium = null;

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
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
