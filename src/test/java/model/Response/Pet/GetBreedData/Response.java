
package model.Response.Pet.GetBreedData;


public class Response {

    private String breedId;
    private String label;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Response() {
    }

    /**
     * 
     * @param breedId
     * @param label
     */
    public Response(String breedId, String label) {
        super();
        this.breedId = breedId;
        this.label = label;
    }

    public String getBreedId() {
        return breedId;
    }

    public void setBreedId(String breedId) {
        this.breedId = breedId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
