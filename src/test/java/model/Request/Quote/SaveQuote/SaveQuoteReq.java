
package model.Request.Quote.SaveQuote;


public class SaveQuoteReq {

    private Customer customer;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SaveQuoteReq() {
    }

    /**
     * 
     * @param customer
     */
    public SaveQuoteReq(Customer customer) {
        super();
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
