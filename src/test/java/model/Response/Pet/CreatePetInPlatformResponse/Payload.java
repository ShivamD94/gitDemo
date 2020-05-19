package model.Response.Pet.CreatePetInPlatformResponse;

import java.util.List;

public class Payload {

    private List<Responses> responses=null;

    public List<Responses> getResponses() {
        return responses;
    }

    public void setResponse(List<Responses> responses) {
        this.responses = responses;
    }
}
