
package model.Response.Pet.GetPetBreed;

import java.util.List;

public class Payload {

    private String label;
    private String value;
    private List<Breed> breeds = null;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Breed> getBreeds() {
        return breeds;
    }

    public void setBreeds(List<Breed> breeds) {
        this.breeds = breeds;
    }

}
