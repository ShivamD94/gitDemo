
package model.Response.Pet.GetBreedData;


public class GetBreedDataRes {

    private String correlationId;
    private Payload payload;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetBreedDataRes() {
    }

    /**
     * 
     * @param payload
     * @param correlationId
     */
    public GetBreedDataRes(String correlationId, Payload payload) {
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
