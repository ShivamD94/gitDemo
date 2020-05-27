
package model.Request.Cart.CreateCart;


public class CreateCart {

    private Customer customer;
    /**
     *
     * @param customer
     */
    public CreateCart(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
