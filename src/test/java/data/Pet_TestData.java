package data;

import Utility.PropertyHolder;
import Utility.UtilityMethods;
import model.Request.Pet.AddPet;
import model.Request.Pet.CreatePetInPlatformRequest.*;
import model.Request.Pet.CreatePetProspect.CreatePetProspect;
import model.Request.Pet.CreatePetProspect.Link;
import model.Request.Pet.CreatePetProspect.Prospect;
import model.Request.Pet.CreatePetProspect.Weight;

import java.util.ArrayList;
import java.util.List;

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
    public static CreatePetProspect addPetProspectpayload(String name, String type, String breedID, String DOB, String prospectID) {
        List<Weight> weight = new ArrayList<>();
        List<Link> link = new ArrayList<>();

        weight.add(new Weight(DOB, "KG", 20.6));
        link.add(new Link("self", "/v1/prospects/" + prospectID));
        Prospect prospect = new Prospect(prospectID, "INDIVIDUAL", link);
        CreatePetProspect createPetPros = new CreatePetProspect(name, type, breedID, DOB, true, weight, prospect);

        return createPetPros;
    }

    public static AddPetInPlatform addpetpayload(String type, String identifer, String breedId, String dateOfBirth, String gender) {

        boolean isCalculated = false;
        Source source = new Source("BAU");

        List<Ownerships> ownerships = new ArrayList<>();
        List<Weights> weights = new ArrayList<>();
        List<Tags> tags = new ArrayList<>();
        List<Vets> vets = new ArrayList<>();
        PropertyHolder.setProperty("petname", UtilityMethods.getRandomString());

        weights.add(new Weights("2030-04-01", (float) 12.3, "LBS"));
        tags.add(new Tags("6XGXGX7UXUXUX87", "2030-04-01"));
        vets.add(new Vets(UtilityMethods.getRandomString(), "123xxxxx", 0));
        ownerships.add(new Ownerships(PropertyHolder.getProperty("petname"), "2030-04-01", "INDIVIDUAL", UtilityMethods.getRandomString()));

        AddPetInPlatform addPetInPlatform = new AddPetInPlatform(type, identifer, breedId, isCalculated, dateOfBirth, gender, source, ownerships, weights, tags, vets);
        return addPetInPlatform;
    }
}