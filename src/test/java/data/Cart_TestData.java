package data;

import model.Request.Cart.CreateCart.*;
import model.Response.Quote.CreateQuoteResponse.Quote;
import model.Response.Quote.CreateQuoteResponse.RateMatrix;

import java.util.ArrayList;
import java.util.List;

public class Cart_TestData {
    /**
     *
     * @param prospectId
     * @param policyholder
     * @param previouspolicy
     * @param petId
     * @param rateMatrix
     * @param quotes
     * @return
     */
    public static CreateCart createCartPayload(String prospectId, Boolean policyholder, Boolean previouspolicy,
                                               String petId, List<RateMatrix> rateMatrix, Quote quotes){
        List<Pet> pets=new ArrayList<>();
        List<model.Request.Cart.CreateCart.Quote> quote=new ArrayList<>();
        UpsellData upsellData= new UpsellData(450,20000,70);
        quote.add(new model.Request.Cart.CreateCart.Quote(quotes.getId(),quotes.getVersion(),quotes.getChosenQuote(),
                quotes.getPriceAffinityType(),quotes.getIsCustom(),quotes.getDeductibleType(),quotes.getAnnualPolicyMaximumLimit(),
                quotes.getCoPayPercentage(),quotes.getAnnualDeductibleDollarAmount(),quotes.getPremium(),
                quotes.getTaxAndServicePremium(),upsellData));
        pets.add(new Pet(petId, rateMatrix,quote));
        Customer customer=new Customer(prospectId, policyholder,previouspolicy, pets);
        CreateCart createcart= new CreateCart(customer);
        return createcart;
    }
}
