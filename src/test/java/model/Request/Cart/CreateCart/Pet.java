
package model.Request.Cart.CreateCart;

import model.Response.Quote.CreateQuoteResponse.RateMatrix;

import java.util.List;

public class Pet {

    private String petId;
    private List<RateMatrix> rateMatrix = null;
    private List<Quote> quotes = null;

    /**
     * 
     * @param petId
     * @param rateMatrix
     * @param quotes
     */
    public Pet(String petId, List<RateMatrix> rateMatrix, List<Quote> quotes) {
        super();
        this.petId = petId;
        this.rateMatrix = rateMatrix;
        this.quotes = quotes;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public List<RateMatrix> getRateMatrix() {
        return rateMatrix;
    }

    public void setRateMatrix(List<RateMatrix> rateMatrix) {
        this.rateMatrix = rateMatrix;
    }

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

}
