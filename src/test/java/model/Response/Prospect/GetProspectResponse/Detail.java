
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
    private List<AdditionalAttribute> additionalAttributes = null;

    public Detail(String firstName,String middleName, String lastName, String email,Boolean isPrimary,
                  List<Contact> contacts,List<AdditionalAttribute> additionalAttributes){
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.name = this.firstName + " " + this.middleName + " " + this.lastName;
        if(email.equalsIgnoreCase("random")) {
            this.email = this.firstName + "." + this.lastName + "@pet.com";
        }
        else{ this.email=email;}
        this.isPrimary=isPrimary;
        this.contacts=contacts;
        this.additionalAttributes=additionalAttributes;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public Boolean getIsPrimary() {
        return isPrimary;
    }
    public List<Contact> getContacts() {
        return contacts;
    }
    public List<AdditionalAttribute> getAdditionalAttributes() {
        return additionalAttributes;
    }


}

