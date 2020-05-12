package model.Pet;

import java.util.List;

public class AddPetInPlatform {

   private String petType;
   private String identifer;
   private String breedId;
   private boolean isCalculated;
   private String dateOfBirth;
   private String gender;
   private Source source;
   private List<Ownerships> ownerships =  null;
   private List<Weights> weights = null;
   private List<Tags> tags = null;
   private List<Vets> vets =null;

   public AddPetInPlatform(String type, String identifer, String breedId, boolean isCalculated, String dateOfBirth, String gender,
                           Source source, List<Ownerships> ownerships, List<Weights> weights, List<Tags> tags, List<Vets> vets){
       this.petType=type;
       this.identifer=identifer;
       this.breedId=breedId;
       this.isCalculated=isCalculated;
       this.dateOfBirth=dateOfBirth;
       this.gender=gender;
       this.source=source;
       this.ownerships=ownerships;
       this.weights=weights;
       this.tags=tags;
       this.vets=vets;

   }

    public String getPetType() {
        return petType;
    }

    public String getIdentifer() {
        return identifer;
    }

    public String getBreedId() {
        return breedId;
    }

    public boolean isCalculated() {
        return isCalculated;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public Source getSource() {
        return source;
    }

    public List<Ownerships> getOwnerships() {
        return ownerships;
    }

    public List<Weights> getWeights() {
        return weights;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public List<Vets> getVets() {
        return vets;
    }
}
