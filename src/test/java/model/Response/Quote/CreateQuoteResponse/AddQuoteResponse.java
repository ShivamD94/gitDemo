package model.Response.Quote.CreateQuoteResponse;



public class AddQuoteResponse {

    private String correlationId;
    private Payload payload;

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }
}
