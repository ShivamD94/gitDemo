
package model.Response.Cart.GetCartRes;

import java.util.List;

public class Pet {

    private String id;
    private String petName;
    private Dob dob;
    private String petType;
    private String breedId;
    private String gender;
    private String state;
    private String zip;
    private List<RateMatrix> rateMatrix = null;
    private List<Quote> quotes = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
