
package model.Response.Prospect.GetProspectResponse;


public class GetProspectRes {

    private String correlationId;
    private Payload payload;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetProspectRes() {
    }

    /**
     * 
     * @param payload
     * @param correlationId
     */
    public GetProspectRes(String correlationId, Payload payload) {
        super();
        this.correlationId = correlationId;
        this.payload = payload;
    }

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
