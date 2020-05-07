package data;

import Utility.UtilityMethods;
import model.Request.Pet.AddPet;
import model.Request.Pet.createPetProspect.CreatePetProspect;
import model.Request.Pet.createPetProspect.Link;
import model.Request.Pet.createPetProspect.Prospect;
import model.Request.Pet.createPetProspect.Weight;
import model.Request.Prospect.CreateProspect.AddProspect;
import model.Request.Prospect.CreateProspect.AdditionalAttribute;
import model.Request.Prospect.CreateProspect.Contact;
import model.Request.Prospect.CreateProspect.Detail;

import java.util.ArrayList;
import java.util.List;

public class Pet_TestData {
    /**
     *
     * @param id
     * @param catid
     * @param pname
     * @return
     */
    public static AddPet addpetpayload(int id, int catid, String pname){
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
     *
     * @param name
     * @param type
     * @param breedID
     * @param DOB
     * @param prospectID
     * @return
     */
    public static CreatePetProspect addPetProspectpayload(String name, String type, String breedID, String DOB,String prospectID){
        List<Weight> weight=new ArrayList<>();
        List<Link> link=new ArrayList<>();

        weight.add(new Weight(DOB,"KG",20.6));
        link.add(new Link("self","/v1/prospects/"+prospectID));
        Prospect prospect=new Prospect(prospectID,"INDIVIDUAL",link);
        CreatePetProspect createPetPros=new CreatePetProspect(name,type,breedID,DOB,true,weight,prospect);

        return createPetPros;
    }
}
