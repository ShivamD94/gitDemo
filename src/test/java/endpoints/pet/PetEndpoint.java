package endpoints.pet;

/**
 * Enum to mention  pet endpoints
 */
public enum PetEndpoint {

    GetPet("/v2/pet/11"),
    AddPet("/v2/pet"),
    AddPetInPlatform("/v2/pets");

    private String resource;

    PetEndpoint(String resource)
    {
        this.resource=resource;
    }

    public String getResource()
    {
        return resource;
    }
}
