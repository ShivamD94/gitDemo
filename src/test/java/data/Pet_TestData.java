package data;

import Utility.PropertyHolder;
import Utility.UtilityMethods;
import model.Request.Pet.AddPet;
import model.Request.Pet.CreatePetInPlatformRequest.*;
import model.Request.Pet.CreatePetProspect.CreatePetProspect;
import model.Request.Pet.CreatePetProspect.Link;
import model.Request.Pet.CreatePetProspect.Prospect;
import model.Request.Pet.CreatePetProspect.Weight;
import org.assertj.core.util.Lists;

import java.util.ArrayList;
import java.util.List;
import static Utility.PropertyHolder.*;

public class Pet_TestData {
    /**
     * @param id
     * @param catid
     * @param pname
     * @return
     */
    public static AddPet addpetpayload(int id, int catid, String pname) {
        AddPet addpet = new AddPet();
        addpet.setId(id);
        addpet.setpetName(pname);
        addpet.setCategoryid(catid);
        addpet.setCategoryName("lb");
        addpet.setPhotourl("tesurl");
        addpet.setTagsid(2);
        addpet.setTagsName("testtag");
        return addpet;
    }

    /**
     * @param name
     * @param type
     * @param breedID
     * @param DOB
     * @param prospectID
     * @return
     */
    public static List<CreatePetProspect> addPetProspectpayload(String name, String type, String breedID,String DOB,
                                                                String state, String zip,String gender,String prospectID) {
        List<Weight> weight = new ArrayList<>();
        List<Link> link = new ArrayList<>();

        weight.add(new Weight(DOB, "KG", 20.6));
        link.add(new Link("self", "/v1/prospects/" + prospectID));
        Prospect prospect = new Prospect(prospectID, getProperty("ProspectType"), link);

        List<CreatePetProspect> createPetPros= Lists.newArrayList(new CreatePetProspect(
                name, type, breedID, DOB, true,gender,state,zip, weight, prospect));
        return createPetPros;
    }

    public static List<AddPetInPlatform> addpetpayload(String type, String breedId, String dateOfBirth, String gender) {

        boolean isCalculated = false;
        Source source = new Source("BAU");
        String identifier=UtilityMethods.getRandomString();

        List<Ownerships> ownerships = new ArrayList<>();
        List<Weights> weights = new ArrayList<>();
        List<Tags> tags = new ArrayList<>();
        List<Vets> vets = new ArrayList<>();
        PropertyHolder.setProperty("petidentifier",identifier);
        PropertyHolder.setProperty("petname", UtilityMethods.getRandomString());

        weights.add(new Weights("2030-04-01", (float) 12.3, "LBS"));
        tags.add(new Tags("6XGXGX7UXUXUX87", "2030-04-01"));
        vets.add(new Vets(UtilityMethods.getRandomString(), "123xxxxx", 0));
        ownerships.add(new Ownerships(PropertyHolder.getProperty("petname"), "2030-04-01", "INDIVIDUAL", UtilityMethods.getRandomString()));

        List<AddPetInPlatform> addPetInPlatform = Lists.newArrayList(new AddPetInPlatform(type, identifier, breedId, isCalculated, dateOfBirth, gender, source, ownerships, weights, tags, vets));
        return addPetInPlatform;
    }
}