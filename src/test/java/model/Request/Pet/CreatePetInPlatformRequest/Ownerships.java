package model.Request.Pet.CreatePetInPlatformRequest;

public class Ownerships {

    private String petName;
    private String startDate;
    private String ownerType;
    private String ownerId;

    public Ownerships(String petName, String startDate, String ownerType, String ownerId){

        this.petName=petName;
        this.startDate=startDate;
        this.ownerType=ownerType;
        this.ownerId=ownerId;
    }

    public String getPetName() {
        return petName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public String getOwnerId() {
        return ownerId;
    }
}
