
package model.Response.Cart.GetCartRes;

import java.util.List;

public class Pet {

    private String breedId;
    private Dob dob;
    private String gender;
    private String id;
    private List<Link_> links = null;
    private String petName;
    private String petType;
    private List<Quote> quotes = null;
    private List<RateMatrix> rateMatrix = null;

    public String getBreedId() {
        return breedId;
    }

    public void setBreedId(String breedId) {
        this.breedId = breedId;
    }

    public Dob getDob() {
        return dob;
    }

    public void setDob(Dob dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Link_> getLinks() {
        return links;
    }

    public void setLinks(List<Link_> links) {
        this.links = links;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public List<RateMatrix> getRateMatrix() {
        return rateMatrix;
    }

    public void setRateMatrix(List<RateMatrix> rateMatrix) {
        this.rateMatrix = rateMatrix;
    }

}
