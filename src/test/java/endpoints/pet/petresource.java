package endpoints.pet;

public enum petresource {

    GetPet("/v2/pet"),
    AddPet("/v2/pet");
    private String resource;

    petresource(String resource)
    {
        this.resource=resource;
    }

    public String getResource()
    {
        return resource;
    }
}
