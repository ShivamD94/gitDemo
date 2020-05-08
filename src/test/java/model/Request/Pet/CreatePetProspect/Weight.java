
package model.Request.Pet.CreatePetProspect;

public class Weight {

    private String date;
    private String uom;
    private Double weight;

    public Weight(String date,String uom,Double weight){
        this.date=date;
        this.uom=uom;
        this.weight=weight;
    }

    public String getDate() {
        return date;
    }
    public String getUom() {
        return uom;
    }
    public Double getWeight() {
        return weight;
    }
}
