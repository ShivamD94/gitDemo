
package model.Response.Prospect.GetProspectResponse;


public class Contact {

    private String type;
    private String value;
    private Integer preference;

    /**
     * No args constructor for use in serialization
     *
     */
    public Contact() {
    }

    /**
     *
     * @param preference
     * @param type
     * @param value
     */
    public Contact(String type, String value, Integer preference) {
        super();
        this.type = type;
        this.value = value;
        this.preference = preference;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getPreference() {
        return preference;
    }

    public void setPreference(Integer preference) {
        this.preference = preference;
    }

}