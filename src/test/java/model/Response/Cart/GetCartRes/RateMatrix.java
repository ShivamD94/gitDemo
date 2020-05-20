
package model.Response.Cart.GetCartRes;

import java.util.List;

public class RateMatrix {

    private String amount;
    private List<Deductible> deductible = null;
    private String state;
    private String zip;

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
