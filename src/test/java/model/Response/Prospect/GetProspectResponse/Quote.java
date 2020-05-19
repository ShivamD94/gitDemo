
package model.Response.Prospect.GetProspectResponse;

import java.util.List;

public class Quote {

    private String name;
    private String peoductId;
    private List<Link__> links = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeoductId() {
        return peoductId;
    }

    public void setPeoductId(String peoductId) {
        this.peoductId = peoductId;
    }

    public List<Link__> getLinks() {
        return links;
    }

    public void setLinks(List<Link__> links) {
        this.links = links;
    }

}
