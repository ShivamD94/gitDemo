package endpoints.pet;

/**
 * Enum to mention  pet endpoints
 */
public enum PetEndpoint {

    GetPet("/v2/pet/11"),
    AddPet("/v2/pet"),
    AddPetInPlatform("/v2/pets");

    AddPet("/v2/pet"),
    GetPetAttribute("/v1/pets/attributes/"),
    PostPetProspect("v1/prospect-pets");
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
