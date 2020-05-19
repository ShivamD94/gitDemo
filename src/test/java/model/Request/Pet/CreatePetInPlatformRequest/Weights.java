package model.Request.Pet.CreatePetInPlatformRequest;

public class Weights {

    private String date;
    private double weight;
    private String weightMeasurement;

   public Weights(String date, float weight, String weightMeasurement)
   {
       this.date=date;
       this.weight=weight;
       this.weightMeasurement=weightMeasurement;
   }

    public String getDate() {
        return date;
    }

    public double getWeight() {
        return weight;
    }

    public String getWeightMeasurement() {
        return weightMeasurement;
    }
}
