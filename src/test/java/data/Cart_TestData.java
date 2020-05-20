package data;

import model.Request.Cart.CreateCart.*;
import model.Response.quote.CreateQuote.RateMatrix;
import model.Response.quote.CreateQuote.Quote;

import java.util.ArrayList;
import java.util.List;

public class Cart_TestData {
   public static List<model.Request.Cart.CreateCart.Quote> quote=new ArrayList<>();
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
                                               String petId, List<RateMatrix> rateMatrix, List<Quote> quotes){
        List<Pet> pets=new ArrayList<>();
        UpsellData upsellData= new UpsellData(450,20000,70);
        quote.add(new model.Request.Cart.CreateCart.Quote(quotes,upsellData));
        pets.add(new Pet(petId, rateMatrix,quote));
        Customer customer=new Customer(prospectId, policyholder,previouspolicy, pets);
        CreateCart createcart= new CreateCart(customer);
        return createcart;
    }
}
