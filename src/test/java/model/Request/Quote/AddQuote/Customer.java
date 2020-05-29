
package model.Request.Quote.AddQuote;

import java.util.List;

public class Customer {

    private String customerId;
    private Boolean isPolicyHolder;
    private Boolean emailOptIn;
    private IndividualPolicyHolder individualPolicyHolder;
    private List<PartnerMember> partnerMembers = null;
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
     * @param individualPolicyHolder
     * @param partnerMembers
     * @param customerId
     * @param isPolicyHolder
     * @param emailOptIn
     */
    public Customer(String customerId, Boolean isPolicyHolder, Boolean emailOptIn, IndividualPolicyHolder individualPolicyHolder, List<PartnerMember> partnerMembers, List<Pet> pets) {
        super();
        this.customerId = customerId;
        this.isPolicyHolder = isPolicyHolder;
        this.emailOptIn = emailOptIn;
        this.individualPolicyHolder = individualPolicyHolder;
        this.partnerMembers = partnerMembers;
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

    public Boolean getEmailOptIn() {
        return emailOptIn;
    }

    public void setEmailOptIn(Boolean emailOptIn) {
        this.emailOptIn = emailOptIn;
    }

    public IndividualPolicyHolder getIndividualPolicyHolder() {
        return individualPolicyHolder;
    }

    public void setIndividualPolicyHolder(IndividualPolicyHolder individualPolicyHolder) {
        this.individualPolicyHolder = individualPolicyHolder;
    }

    public List<PartnerMember> getPartnerMembers() {
        return partnerMembers;
    }

    public void setPartnerMembers(List<PartnerMember> partnerMembers) {
        this.partnerMembers = partnerMembers;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

}
