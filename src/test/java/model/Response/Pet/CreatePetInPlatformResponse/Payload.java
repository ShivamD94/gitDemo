package model.Response.Pet.CreatePetInPlatformResponse;

import java.util.List;

public class Payload {

    private List<Response> response=null;

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }
}
