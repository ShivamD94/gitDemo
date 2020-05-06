package endpoints.prospect;

public enum prospectEndPoint {
    GetProspectbyID("/v1/prospects/{prospectId}"),
    AddProspect("v1/prospects");

    private String resource;

    prospectEndPoint(String resource) {
        this.resource=resource;
    }

    public String getResource()    {
        return resource;
    }
}
