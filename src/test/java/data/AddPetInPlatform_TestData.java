package data;

import Utility.PropertyHolder;
import Utility.UtilityMethods;
import model.Pet.*;

import java.util.ArrayList;
import java.util.List;

public class AddPetInPlatform_TestData {

    public AddPetInPlatform addpetpayload(String type, String identifer, String breedId, String dateOfBirth, String gender){

        boolean isCalculated=false;
        Source source=new Source("BAU");

        List<Ownerships> ownerships=new ArrayList<>();
        List<Weights> weights=new ArrayList<>();
        List<Tags> tags=new ArrayList<>();
        List<Vets> vets=new ArrayList<>();
        PropertyHolder.setProperty("petname",UtilityMethods.getRandomString());

        weights.add(new Weights("2030-04-01", (float) 12.3,"LBS"));
        tags.add(new Tags("6XGXGX7UXUXUX87","2030-04-01"));
        vets.add(new Vets(UtilityMethods.getRandomString(),"123xxxxx", 0));
        ownerships.add(new Ownerships(PropertyHolder.getProperty("petname"),"2030-04-01","INDIVIDUAL",UtilityMethods.getRandomString()));

        AddPetInPlatform addPetInPlatform = new AddPetInPlatform(type, identifer, breedId, isCalculated, dateOfBirth, gender, source, ownerships, weights, tags, vets);
        return addPetInPlatform;

    }
}
