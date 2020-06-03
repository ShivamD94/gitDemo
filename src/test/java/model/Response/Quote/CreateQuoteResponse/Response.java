
package model.Response.Quote.CreateQuoteResponse;


public class Response {

    private Customer customer;
    private Attribution attribution;

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
