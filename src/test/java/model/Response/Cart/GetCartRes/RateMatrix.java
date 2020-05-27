
package model.Response.Cart.GetCartRes;

import java.util.List;

public class RateMatrix {

    private Double amount;
    private List<Deductible> deductible = null;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<Deductible> getDeductible() {
        return deductible;
    }

    public void setDeductible(List<Deductible> deductible) {
        this.deductible = deductible;
    }

}
