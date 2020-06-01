
package model.Request.Pet.CreatePetProspect;

import java.util.List;

public class Prospect {

    private String id;
    private String prospectType;
    private List<Link> links = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Prospect() {
    }

    /**
     * 
     * @param links
     * @param id
     * @param prospectType
     */
    public Prospect(String id, String prospectType, List<Link> links) {
        super();
        this.id = id;
        this.prospectType = prospectType;
        this.links = links;
    }

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
