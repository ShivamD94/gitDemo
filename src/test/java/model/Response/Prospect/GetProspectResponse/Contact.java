
package model.Response.Prospect.GetProspectResponse;

public class Contact {

    private String type;
    private String value;
    private Integer preference;

    public Contact(String type,String value,Integer preference){
        this.type=type;
        this.value=value;
        this.preference=preference;
    }

    public String getType() {
        return type;
    }
    public String getValue() {
        return value;
    }
    public Integer getPreference() {
        return preference;
    }


}
