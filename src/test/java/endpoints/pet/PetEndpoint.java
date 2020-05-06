package endpoints.pet;

/**
 * Enum to mention  pet endpoints
 */
public enum PetEndpoint {

    GetPet("/v2/pet/11"),
    AddPet("/v2/pet"),
    GetPetType("/v1/pets/attributes/{PetType}"),
    GetPetAge("/v1/pets/attributes/{Age}"),
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
