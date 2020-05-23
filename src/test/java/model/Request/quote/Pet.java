
package model.Request.quote;


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

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pet() {
    }

    /**
     * 
     * @param zip
     * @param petId
     * @param gender
     * @param generalQuoteRequest
     * @param breedId
     * @param petType
     * @param weight
     * @param hasMicrochip
     * @param petName
     * @param isWorkingDog
     * @param dob
     * @param countryCode
     * @param state
     */
    public Pet(String petId, String petName, Dob dob, String petType, String breedId, String gender, Weight weight, Boolean hasMicrochip, Boolean isWorkingDog, String state, String zip, String countryCode, GeneralQuoteRequest generalQuoteRequest) {
        super();
        this.petId = petId;
        this.petName = petName;
        this.dob = dob;
        this.petType = petType;
        this.breedId = breedId;
        this.gender = gender;
        this.weight = weight;
        this.hasMicrochip = hasMicrochip;
        this.isWorkingDog = isWorkingDog;
        this.state = state;
        this.zip = zip;
        this.countryCode = countryCode;
        this.generalQuoteRequest = generalQuoteRequest;
    }

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

}
