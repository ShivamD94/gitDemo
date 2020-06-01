package endpoints.pet;

/**
 * Enum to mention  pet endpoints
 */
public enum PetEndpoint {

    GetPet("/v2/pet/11"),
    AddPet("/v2/pet"),
    AddPetInPlatform("fdp-pet-service/v1/pets"),
    GetPetAttribute("fdp-pet-service/v1/pets/attributes"),
    GetPetBreed("fdp-pet-service/v1/pets/attributes/{petType}/breeds");
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
