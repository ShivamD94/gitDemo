
package model.Response.Cart.GetCartRes;

import java.util.List;

public class Customer {

    private String customerId;
    private Boolean isPolicyHolder;
    private Boolean isPreviousPolicyholder;
    private List<Detail> details = null;
    private List<Pet> pets = null;

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

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

}
