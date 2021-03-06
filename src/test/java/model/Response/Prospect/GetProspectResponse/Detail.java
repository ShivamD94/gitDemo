
package model.Response.Prospect.GetProspectResponse;

import java.util.List;

public class Detail {

    private String firstName;
    private String middleName;
    private String lastName;
    private String name;
    private String email;
    private Boolean isPrimary;
    private List<Contact> contacts = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Detail() {
    }

    /**
     * 
     * @param firstName
     * @param lastName
     * @param isPrimary
     * @param name
     * @param middleName
     * @param email
     * @param contacts
     */
    public Detail(String firstName, String middleName, String lastName, String name, String email, Boolean isPrimary, List<Contact> contacts) {
        super();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.name = name;
        this.email = email;
        this.isPrimary = isPrimary;
        this.contacts = contacts;
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

}
