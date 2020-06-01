
package model.Request.Quote.SaveQuote;

import java.util.List;

public class CoPay {

    private Integer percentage;
    private List<Integer> premium = null;
    private List<Integer> taxAndServicePremium = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CoPay() {
    }

    /**
     * 
     * @param premium
     * @param percentage
     * @param taxAndServicePremium
     */
    public CoPay(Integer percentage, List<Integer> premium, List<Integer> taxAndServicePremium) {
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
