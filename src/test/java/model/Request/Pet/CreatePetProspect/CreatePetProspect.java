
package model.Request.Pet.CreatePetProspect;

import java.util.List;

public class CreatePetProspect {

    private String name;
    private String type;
    private String breedId;
    private String dateOfBirth;
    private Boolean isActual;
    private List<Weight> weight = null;
    private Prospect prospect;

    public CreatePetProspect(String name, String type, String breedId,String dateOfBirth,Boolean isActual,List<Weight> weight,Prospect prospect){
        this.name=name;
        this.type=type;
        this.breedId=breedId;
        this.dateOfBirth=dateOfBirth;
        this.isActual=isActual;
        this.weight=weight;
        this.prospect=prospect;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getBreedId() {
        return breedId;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public Boolean getIsActual() {
        return isActual;
    }
    public List<Weight> getWeight() {
        return weight;
    }
    public Prospect getProspect() {
        return prospect;
    }
}
