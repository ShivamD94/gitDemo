package model.Response.Pet.CreatePetInPlatformResponse;

public class AddPetInPlatformRes {

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
