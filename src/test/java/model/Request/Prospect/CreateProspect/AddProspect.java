
package model.Request.Prospect.CreateProspect;

import java.util.List;

public class AddProspect {

    private String type;
    private String country;
    private List<Detail> details = null;

    /**
     * 
     * @param country
     * @param details
     * @param type
     */
    public AddProspect(String type, String country, List<Detail> details) {
        this.type = type;
        this.country = country;
        this.details = details;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

}
