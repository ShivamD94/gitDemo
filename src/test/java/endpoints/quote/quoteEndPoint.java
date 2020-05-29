package endpoints.quote;

public enum quoteEndPoint {


    AddQuote("fdp-quote-service/v1/quotes"),
    SaveQuote("fdp-quote-service/v1/quotes/aggregate");

    private String resource;

    quoteEndPoint(String resource) {
        this.resource=resource;
    }

    public String getResource()    {
        return resource;
    }
}
