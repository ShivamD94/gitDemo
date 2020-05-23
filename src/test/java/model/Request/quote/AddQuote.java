
package model.Request.quote;


public class AddQuote {

    private Customer customer;
    private Attribution attribution;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AddQuote() {
    }

    /**
     * 
     * @param attribution
     * @param customer
     */
    public AddQuote(Customer customer, Attribution attribution) {
        super();
        this.customer = customer;
        this.attribution = attribution;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Attribution getAttribution() {
        return attribution;
    }

    public void setAttribution(Attribution attribution) {
        this.attribution = attribution;
    }

}
