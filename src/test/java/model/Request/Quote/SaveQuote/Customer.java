
package model.Request.Quote.SaveQuote;

import java.util.List;

public class Customer {

    private String customerId;
    private Boolean isPolicyHolder;
    private Boolean isPreviousPolicyholder;
    private List<Pet> pets = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Customer() {
    }

    /**
     * 
     * @param pets
     * @param customerId
     * @param isPolicyHolder
     * @param isPreviousPolicyholder
     */
    public Customer(String customerId, Boolean isPolicyHolder, Boolean isPreviousPolicyholder, List<Pet> pets) {
        super();
        this.customerId = customerId;
        this.isPolicyHolder = isPolicyHolder;
        this.isPreviousPolicyholder = isPreviousPolicyholder;
        this.pets = pets;
    }

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

}
