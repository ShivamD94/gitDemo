
package model.Response.ErrorHandling;

import java.util.List;

public class ErrorHandle {

    private String correlationId;
    private List<Error> errors = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ErrorHandle() {
    }

    /**
     * 
     * @param correlationId
     * @param errors
     */
    public ErrorHandle(String correlationId, List<Error> errors) {
        super();
        this.correlationId = correlationId;
        this.errors = errors;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

}
