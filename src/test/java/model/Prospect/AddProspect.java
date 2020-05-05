
package model.Prospect;

import java.util.List;

public class AddProspect {

    private String type;
    private String country;
    private String postalCode;
    private String state;
    private List<Detail> details = null;

    public AddProspect(String type,String country,String postalCode,String state,List<Detail> details){
        this.type=type;
        this.country=country;
        this.postalCode=postalCode;
        this.state=state;
        this.details=details;
    }
    public String getType() {
        return type;
    }
    public String getCountry() {
        return country;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public String getState() {
        return state;
    }
    public List<Detail> getDetails() {
        return details;
    }

}
