package data;

import Utility.UtilityMethods;
import model.Pet.*;

import java.util.ArrayList;
import java.util.List;

public class AddPetInPlatform_TestData {

    public AddPetInPlatform addpetpayload(String type, String gender, String identifer, String breedId, String dateOfBirth){

        boolean isCalculated=false;
        Source source=new Source("BAU");

        List<Ownerships> ownerships=new ArrayList<>();
        List<Weights> weights=new ArrayList<>();
        List<Tags> tags=new ArrayList<>();
        List<Vets> vets=new ArrayList<>();

        weights.add(new Weights("2030-04-01", (float) 12.3,"LBS"));
        tags.add(new Tags("6XGXGX7UXUXUX87","2030-04-01"));
        vets.add(new Vets(UtilityMethods.getRandomString(),"123xxxxx", 0));
        ownerships.add(new Ownerships(UtilityMethods.getRandomString(),"2030-04-01","INDIVIDUAL",UtilityMethods.getRandomString()));

        AddPetInPlatform addPetInPlatform = new AddPetInPlatform(type, gender, identifer, breedId, isCalculated, dateOfBirth, source, ownerships, weights, tags, vets);
        return addPetInPlatform;

    }
}
