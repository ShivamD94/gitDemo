
package model.Response.ErrorHandling;


public class Error {

    private String errorCode;
    private String message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Error() {
    }

    /**
     * 
     * @param errorCode
     * @param message
     */
    public Error(String errorCode, String message) {
        super();
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
