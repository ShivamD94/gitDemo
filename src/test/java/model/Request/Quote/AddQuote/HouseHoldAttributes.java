
package model.Request.Quote.AddQuote;


public class HouseHoldAttributes {

    private Boolean memberOfAnimalShelterHumaneSociety;
    private Boolean isInMedicalServices;
    private Boolean isMilitaryOrVeteran;
    private Boolean isVetStaff;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HouseHoldAttributes() {
    }

    /**
     * 
     * @param isVetStaff
     * @param isInMedicalServices
     * @param isMilitaryOrVeteran
     * @param memberOfAnimalShelterHumaneSociety
     */
    public HouseHoldAttributes(Boolean memberOfAnimalShelterHumaneSociety, Boolean isInMedicalServices, Boolean isMilitaryOrVeteran, Boolean isVetStaff) {
        super();
        this.memberOfAnimalShelterHumaneSociety = memberOfAnimalShelterHumaneSociety;
        this.isInMedicalServices = isInMedicalServices;
        this.isMilitaryOrVeteran = isMilitaryOrVeteran;
        this.isVetStaff = isVetStaff;
    }

    public Boolean getMemberOfAnimalShelterHumaneSociety() {
        return memberOfAnimalShelterHumaneSociety;
    }

    public void setMemberOfAnimalShelterHumaneSociety(Boolean memberOfAnimalShelterHumaneSociety) {
        this.memberOfAnimalShelterHumaneSociety = memberOfAnimalShelterHumaneSociety;
    }

    public Boolean getIsInMedicalServices() {
        return isInMedicalServices;
    }

    public void setIsInMedicalServices(Boolean isInMedicalServices) {
        this.isInMedicalServices = isInMedicalServices;
    }

    public Boolean getIsMilitaryOrVeteran() {
        return isMilitaryOrVeteran;
    }

    public void setIsMilitaryOrVeteran(Boolean isMilitaryOrVeteran) {
        this.isMilitaryOrVeteran = isMilitaryOrVeteran;
    }

    public Boolean getIsVetStaff() {
        return isVetStaff;
    }

    public void setIsVetStaff(Boolean isVetStaff) {
        this.isVetStaff = isVetStaff;
    }

}
