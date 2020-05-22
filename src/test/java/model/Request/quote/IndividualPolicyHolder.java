
package model.Request.quote;


import java.util.List;

public class IndividualPolicyHolder {

    private Person person;
    private HouseHoldAttributes houseHoldAttributes;

    /**
     * No args constructor for use in serialization
     * 
     */
    public IndividualPolicyHolder() {
    }

    /**
     * 
     * @param person
     * @param houseHoldAttributes
     */
    public IndividualPolicyHolder(Person person, HouseHoldAttributes houseHoldAttributes) {
        super();
        this.person = person;
        this.houseHoldAttributes = houseHoldAttributes;
    }



    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public HouseHoldAttributes getHouseHoldAttributes() {
        return houseHoldAttributes;
    }

    public void setHouseHoldAttributes(HouseHoldAttributes houseHoldAttributes) {
        this.houseHoldAttributes = houseHoldAttributes;
    }

}
