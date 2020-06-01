
package model.Request.Quote.SaveQuote;

import java.util.List;

public class RateMatrix {

    private String amount;
    private List<Deductible> deductible = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RateMatrix() {
    }

    /**
     * 
     * @param amount
     * @param deductible
     */
    public RateMatrix(String amount, List<Deductible> deductible) {
        super();
        this.amount = amount;
        this.deductible = deductible;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public List<Deductible> getDeductible() {
        return deductible;
    }

    public void setDeductible(List<Deductible> deductible) {
        this.deductible = deductible;
    }

}
