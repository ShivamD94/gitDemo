
package model.Request.Pet.createPetProspect;

import java.util.List;

public class Prospect {

    private String id;
    private String prospectType;
    private List<Link> links = null;

    public Prospect(String id,String prospectType,List<Link> links){
        this.id=id;
        this.prospectType=prospectType;
        this.links=links;
    }

    public String getId() {
        return id;
    }
    public String getProspectType() {
        return prospectType;
    }
    public List<Link> getLinks() {
        return links;
    }
}
