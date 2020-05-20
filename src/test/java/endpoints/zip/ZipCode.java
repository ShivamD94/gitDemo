package endpoints.zip;

public enum ZipCode {

//    /v1/lookup/zip-code?zip=19073&countryCode=US/CAN

    zipCode ("/fdp-lookup-service/v1/lookup/zip-code");

    private String resource;

    ZipCode(String resource) {
        this.resource=resource;
    }

    public String getResource()    {
        return resource;
    }
}
