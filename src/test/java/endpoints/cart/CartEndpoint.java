package endpoints.cart;

/**
 * Enum to mention  pet endpoints
 */
public enum CartEndpoint {

    AddCart("fdp-cart-service/v1/carts"),
    GetCart("fdp-cart-service/v1/carts/{emailId}"),
    UpdateCart("fdp-cart-service/v1/carts/{cartId}");
    private String resource;

    CartEndpoint(String resource)
    {
        this.resource=resource;
    }

    public String getResource()
    {
        return resource;
    }
}
