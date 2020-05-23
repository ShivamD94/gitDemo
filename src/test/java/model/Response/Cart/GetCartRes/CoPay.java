
package model.Response.Cart.GetCartRes;

import java.util.List;

public class CoPay {

    private Double percentage;
    private List<Integer> premium = null;
    private List<Integer> taxAndServicePremium = null;

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public List<Integer> getPremium() {
        return premium;
    }

    public void setPremium(List<Integer> premium) {
        this.premium = premium;
    }

    public List<Integer> getTaxAndServicePremium() {
        return taxAndServicePremium;
    }

    public void setTaxAndServicePremium(List<Integer> taxAndServicePremium) {
        this.taxAndServicePremium = taxAndServicePremium;
    }

}
