
package model.Response.Pet.GetPetBreed;

import java.util.List;

public class GetPetBreedRes {

    private String correlationId;
    private List<Payload> payload = null;

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public List<Payload> getPayload() {
        return payload;
    }

    public void setPayload(List<Payload> payload) {
        this.payload = payload;
    }

}
