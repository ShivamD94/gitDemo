
package model.Response.quote.CreateQuote;

import java.util.List;

public class Deductible {

    private String amount;
    private List<CoPay> coPay = null;

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
