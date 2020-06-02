
package model.Response.Quote.CreateQuoteResponse;

import java.util.List;

public class Customer {

    private String customerId;
    private Boolean isPolicyHolder;
    private Boolean isPreviousPolicyholder;
    private List<Pet> pets = null;
    private List<Link_> links = null;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Boolean getIsPolicyHolder() {
        return isPolicyHolder;
    }

    public void setIsPolicyHolder(Boolean isPolicyHolder) {
        this.isPolicyHolder = isPolicyHolder;
    }

    public Boolean getIsPreviousPolicyholder() {
        return isPreviousPolicyholder;
    }

    public void setIsPreviousPolicyholder(Boolean isPreviousPolicyholder) {
        this.isPreviousPolicyholder = isPreviousPolicyholder;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public List<Link_> getLinks() {
        return links;
    }

    public void setLinks(List<Link_> links) {
        this.links = links;
    }

}
