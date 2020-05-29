
package model.Request.Pet.CreatePetProspect;

import java.util.List;

public class CreatePetProspect {

    private String name;
    private String type;
    private String breedId;
    private String dateOfBirth;
    private Boolean isActual;
    private String gender;
    private String state;
    private String zipcode;
    private List<Weight> weight = null;
    private Prospect prospect;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CreatePetProspect() {
    }

    /**
     * 
     * @param zipcode
     * @param prospect
     * @param isActual
     * @param gender
     * @param breedId
     * @param name
     * @param weight
     * @param dateOfBirth
     * @param state
     * @param type
     */
    public CreatePetProspect(String name, String type, String breedId, String dateOfBirth, Boolean isActual, String gender, String state, String zipcode, List<Weight> weight, Prospect prospect) {
        super();
        this.name = name;
        this.type = type;
        this.breedId = breedId;
        this.dateOfBirth = dateOfBirth;
        this.isActual = isActual;
        this.gender = gender;
        this.state = state;
        this.zipcode = zipcode;
        this.weight = weight;
        this.prospect = prospect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreedId() {
        return breedId;
    }

    public void setBreedId(String breedId) {
        this.breedId = breedId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getIsActual() {
        return isActual;
    }

    public void setIsActual(Boolean isActual) {
        this.isActual = isActual;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public List<Weight> getWeight() {
        return weight;
    }

    public void setWeight(List<Weight> weight) {
        this.weight = weight;
    }

    public Prospect getProspect() {
        return prospect;
    }

    public void setProspect(Prospect prospect) {
        this.prospect = prospect;
    }

}
