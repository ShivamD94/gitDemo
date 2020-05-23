
package model.Response.Cart.GetCartRes;

import java.util.List;

public class Deductible {

    private Integer amount;
    private List<CoPay> coPay = null;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public List<CoPay> getCoPay() {
        return coPay;
    }

    public void setCoPay(List<CoPay> coPay) {
        this.coPay = coPay;
    }

}
