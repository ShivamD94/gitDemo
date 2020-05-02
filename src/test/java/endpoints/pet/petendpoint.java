package endpoints.pet;

/**
 * Enum to mention  pet endpoints
 */
public enum petendpoint {

    GetPet("/v2/pet/11"),
    AddPet("/v2/pet");
    private String resource;

    petendpoint(String resource)
    {
        this.resource=resource;
    }

    public String getResource()
    {
        return resource;
    }
}
