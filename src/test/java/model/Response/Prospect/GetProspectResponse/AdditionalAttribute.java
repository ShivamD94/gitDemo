
package model.Response.Prospect.GetProspectResponse;

public class AdditionalAttribute {

    private String name;
    private String value;

    public AdditionalAttribute(String name, String value){
        this.name=name;
        this.value=value;
    }

    public String getName() {
        return name;
    }
    public String getValue() {
        return value;
    }

}
