package endpoints.prospect;

public enum prospectEndPoint {
    GetProspectbyID("fdp-prospect-service/v1/prospects/{prospectId}"),
    AddProspect("fdp-prospect-service/v1/prospects");

    private String resource;

    prospectEndPoint(String resource) {
        this.resource=resource;
    }

    public String getResource()    {
        return resource;
    }
}
