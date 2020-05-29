
package model.Request.Prospect.CreateProspect;

import java.util.List;

public class Detail {

    private String firstName;
    private String middleName;
    private String lastName;
    private String name;
    private String email;
    private Boolean isPrimary;
    private List<Contact> contacts = null;
    private List<Address> addresses = null;
    private List<AdditionalAttribute> additionalAttributes = null;
    /**
     * 
     * @param firstName
     * @param lastName
     * @param addresses
     * @param isPrimary
     * @param middleName
     * @param email
     * @param contacts
     * @param additionalAttributes
     */
    public Detail(String firstName, String middleName, String lastName, String email, Boolean isPrimary, List<Contact> contacts, List<Address> addresses, List<AdditionalAttribute> additionalAttributes) {
        super();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.name = firstName+lastName;
        this.email = email;
        this.isPrimary = isPrimary;
        this.contacts = contacts;
        this.addresses = addresses;
        this.additionalAttributes = additionalAttributes;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<AdditionalAttribute> getAdditionalAttributes() {
        return additionalAttributes;
    }

    public void setAdditionalAttributes(List<AdditionalAttribute> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
    }

}
