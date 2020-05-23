
package model.Response.Prospect.GetProspectResponse;

import model.Request.Prospect.CreateProspect.Detail;

import java.util.List;

public class GetProspectRes {

    private String correlationId;
    private Payload payload;

public getProspectResponsePayload(){

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
