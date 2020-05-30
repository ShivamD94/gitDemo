
package model.Request.Quote.SaveQuote;

import model.Response.Quote.CreateQuoteResponse.Dob;
import model.Response.Quote.CreateQuoteResponse.Quote;
import model.Response.Quote.CreateQuoteResponse.RateMatrix;
import model.Response.Quote.CreateQuoteResponse.Weight;

import java.util.List;

public class Pet {

    private String petId;
    private String petName;
    private model.Response.Quote.CreateQuoteResponse.Dob dob;
    private String petType;
    private String breedId;
    private String gender;
    private model.Response.Quote.CreateQuoteResponse.Weight weight;
    private Boolean hasMicrochip;
    private Boolean isWorkingDog;
    private String zip;
    private String state;
    private String countryCode;
    private List<model.Response.Quote.CreateQuoteResponse.RateMatrix> rateMatrix = null;
    private List<model.Response.Quote.CreateQuoteResponse.Quote> quotes = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pet() {
    }

    /**
     * @param pets
     * @param weight
     * @param hasMicrochip
     * @param quotes
     * @param dob
     * @param isWorkingDog
     * @param rateMatrix
     * @param dob
     */

    public Pet(List<model.Response.Quote.CreateQuoteResponse.Pet> pets, model.Response.Quote.CreateQuoteResponse.Weight weight,
               model.Response.Quote.CreateQuoteResponse.Dob dob,Boolean hasMicrochip,Boolean isWorkingDog,
               List<model.Response.Quote.CreateQuoteResponse.RateMatrix> rateMatrix,
               List<model.Response.Quote.CreateQuoteResponse.Quote> quotes) {

        petId=pets.get(0).getPetId();
        petName=pets.get(0).getPetName();
        this.dob = dob;
        petType = pets.get(0).getPetType();
        breedId = pets.get(0).getBreedId();
        gender = pets.get(0).getGender();
        this.weight = weight;
        this.hasMicrochip = hasMicrochip;
        this.isWorkingDog = isWorkingDog;
        zip = pets.get(0).getZip();
        state = pets.get(0).getState();
        countryCode = pets.get(0).getCountryCode();
        this.rateMatrix = rateMatrix;
        this.quotes = quotes;
    }

    public String getPetId() {
        return petId;
    }
    public String getPetName() {
        return petName;
    }
    public Dob getDob() {
        return dob;
    }
    public String getPetType() {
        return petType;
    }
    public String getBreedId() {
        return breedId;
    }
    public String getGender() {
        return gender;
    }
    public Weight getWeight() {
        return weight;
    }
    public Boolean getHasMicrochip() {
        return hasMicrochip;
    }
    public Boolean getIsWorkingDog() {
        return isWorkingDog;
    }
    public String getZip() {
        return zip;
    }
    public String getState() {
        return state;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public List<RateMatrix> getRateMatrix() {
        return rateMatrix;
    }
    public List<Quote> getQuotes() {
        return quotes;
    }

}
