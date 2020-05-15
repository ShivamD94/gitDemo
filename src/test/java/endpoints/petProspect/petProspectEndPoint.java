package endpoints.petProspect;

public enum petProspectEndPoint {
    PostPetProspect("v1/prospect-pets");

    private String resource;

    petProspectEndPoint(String resource) {
        this.resource=resource;
    }

    public String getResource()    {
        return resource;
    }
}
