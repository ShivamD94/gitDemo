
package model.Request.Cart.CreateCart;

import java.util.List;

public class Deductible {

    private String amount;
    private List<CoPay> coPay = null;

    /**
     * 
     * @param amount
     * @param coPay
     */
    public Deductible(String amount, List<CoPay> coPay) {
        this.amount = amount;
        this.coPay = coPay;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public List<CoPay> getCoPay() {
        return coPay;
    }

    public void setCoPay(List<CoPay> coPay) {
        this.coPay = coPay;
    }

}
