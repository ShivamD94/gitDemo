
package model.Request.Quote.AddQuote;


public class Weight {

    private String unit;
    private Float weight;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Weight() {
    }

    /**
     * 
     * @param unit
     * @param weight
     */
    public Weight(String unit, Float weight) {
        super();
        this.unit = unit;
        this.weight = weight;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

}
