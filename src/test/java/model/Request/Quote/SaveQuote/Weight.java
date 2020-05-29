
package model.Request.Quote.SaveQuote;


public class Weight {

    private String unit;
    private Double weight;

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
    public Weight(String unit, Double weight) {
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

}
