
package model.Response.quote.CreateQuote;

import java.util.List;

public class Pet {

    private String petId;
    private String petName;
    private Dob dob;
    private String petType;
    private String breedId;
    private String gender;
    private Weight weight;
    private Boolean hasMicrochip;
    private Boolean isWorkingDog;
    private String state;
    private String zip;
    private String countryCode;
    private GeneralQuoteRequest generalQuoteRequest;
    private List<RateMatrix> rateMatrix = null;
    private List<Quote> quotes = null;
    private List<Link> links = null;

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Dob getDob() {
        return dob;
    }

    public void setDob(Dob dob) {
        this.dob = dob;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getBreedId() {
        return breedId;
    }

    public void setBreedId(String breedId) {
        this.breedId = breedId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public Boolean getHasMicrochip() {
        return hasMicrochip;
    }

    public void setHasMicrochip(Boolean hasMicrochip) {
        this.hasMicrochip = hasMicrochip;
    }

    public Boolean getIsWorkingDog() {
        return isWorkingDog;
    }

    public void setIsWorkingDog(Boolean isWorkingDog) {
        this.isWorkingDog = isWorkingDog;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public GeneralQuoteRequest getGeneralQuoteRequest() {
        return generalQuoteRequest;
    }

    public void setGeneralQuoteRequest(GeneralQuoteRequest generalQuoteRequest) {
        this.generalQuoteRequest = generalQuoteRequest;
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

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

}
