
package model.Response.Pet.GetBreedData;

import java.util.List;

public class Payload {

    private List<Response> responses = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payload() {
    }

    /**
     * 
     * @param responses
     */
    public Payload(List<Response> responses) {
        super();
        this.responses = responses;
    }

    public List<Response> getResponses() {
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

}
