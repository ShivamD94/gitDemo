package model.Request.Pet.CreatePetInPlatformRequest;

public class Vets {

    private String name;
    private String id;
    private int preference;

    public Vets(String name, String id, int preference){
        this.name=name;
        this.id=id;
        this.preference=preference;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getPreference() {
        return preference;
    }
}
