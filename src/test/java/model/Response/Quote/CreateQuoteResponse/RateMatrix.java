
package model.Response.Quote.CreateQuoteResponse;

import java.util.List;

public class RateMatrix {

    private String amount;
    private List<Deductible> deductible = null;

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
