package endpoints.quote;

public enum quoteEndPoint {


    AddQuote("fdp-quote-service/v1/quotes");

    private String resource;

    quoteEndPoint(String resource) {
        this.resource=resource;
    }

    public String getResource()    {
        return resource;
    }
}
