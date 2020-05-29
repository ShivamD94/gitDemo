
package model.Request.Pet.CreatePetProspect;


public class Weight {

    private String date;
    private String uom;
    private Double weight;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Weight() {
    }

    /**
     * 
     * @param date
     * @param uom
     * @param weight
     */
    public Weight(String date, String uom, Double weight) {
        super();
        this.date = date;
        this.uom = uom;
        this.weight = weight;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

}
