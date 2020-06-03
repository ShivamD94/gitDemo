
package model.Response.Pet.GetProspectPetResponse;

import java.util.List;

public class Prospect {

    private String id;
    private String prospectType;
    private List<Link> links = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProspectType() {
        return prospectType;
    }

    public void setProspectType(String prospectType) {
        this.prospectType = prospectType;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

}
