
package model.Request.Quote.AddQuote;


public class Dob {

    private Integer petAge;
    private String petSuggestedDoB;
    private String petActualDoB;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dob() {
    }

    /**
     * 
     * @param petAge
     * @param petSuggestedDoB
     * @param petActualDoB
     */
    public Dob(Integer petAge, String petSuggestedDoB, String petActualDoB) {
        super();
        this.petAge = petAge;
        this.petSuggestedDoB = petSuggestedDoB;
        this.petActualDoB = petActualDoB;
    }

    public Integer getPetAge() {
        return petAge;
    }

    public void setPetAge(Integer petAge) {
        this.petAge = petAge;
    }

    public String getPetSuggestedDoB() {
        return petSuggestedDoB;
    }

    public void setPetSuggestedDoB(String petSuggestedDoB) {
        this.petSuggestedDoB = petSuggestedDoB;
    }

    public String getPetActualDoB() {
        return petActualDoB;
    }

    public void setPetActualDoB(String petActualDoB) {
        this.petActualDoB = petActualDoB;
    }

}
