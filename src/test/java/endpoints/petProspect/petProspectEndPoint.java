package endpoints.petProspect;

public enum petProspectEndPoint {
    PostPetProspect("fdp-prospect-pet-service/v1/prospect-pets"),
	GetProspectPet("fdp-prospect-pet-service/v1/prospect-pets");
    private String resource;

    petProspectEndPoint(String resource) {
        this.resource=resource;
    }

    public String getResource()    {
        return resource;
    }
}
