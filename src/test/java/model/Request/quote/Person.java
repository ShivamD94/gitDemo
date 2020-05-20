
package model.Request.quote;

import java.util.List;

public class Person {

    private Boolean isPrimary;
    private String firstName;
    private String lastName;
    private String middleName;
    private String fullName;
    private String email;
    private List<Contact> contacts = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Person() {
    }

    /**
     * 
     * @param firstName
     * @param lastName
     * @param isPrimary
     * @param fullName
     * @param middleName
     * @param email
     * @param contacts
     */
    public Person(Boolean isPrimary, String firstName, String lastName, String middleName, String fullName, String email, List<Contact> contacts) {
        super();
        this.isPrimary = isPrimary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.fullName = fullName;
        this.email = email;
        this.contacts = contacts;
    }

    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

}
