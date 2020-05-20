
package model.Request.Cart.CreateCart;

import java.util.List;

public class Quote {

    private List<model.Response.quote.CreateQuote.Quote> quotes=null;
    private UpsellData upsellData;

    /**
     *
     * @param quotes
     * @param upsellData
     */
    public Quote(List<model.Response.quote.CreateQuote.Quote> quotes, UpsellData upsellData) {
        this.quotes=quotes;
        this.upsellData = upsellData;
    }

    public List<model.Response.quote.CreateQuote.Quote> getQuotes() {
        return quotes;
    }
    public UpsellData getUpsellData() {
        return upsellData;
    }

}
