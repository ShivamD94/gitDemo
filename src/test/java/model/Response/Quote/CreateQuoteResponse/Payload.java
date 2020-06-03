
package model.Response.Quote.CreateQuoteResponse;

import java.util.List;

public class Payload {

    private List<Response> responses = null;
    private List<Error> errors = null;

    public List<Response> getResponses() {
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

}
