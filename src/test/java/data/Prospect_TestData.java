package data;

import Utility.UtilityMethods;
import model.Prospect.AddProspect;
import model.Prospect.AdditionalAttribute;
import model.Prospect.Contact;
import model.Prospect.Detail;

import java.util.ArrayList;
import java.util.List;

public class Prospect_TestData {
    /**
     *
     * @param type
     * @param country
     * @param postalCode
     * @param state
     * @return
     */
    public static AddProspect addprospectpayload(String type,String country,String postalCode,String state){
        List<Detail> detail=new ArrayList<>();
        List<Contact> contact=new ArrayList<>();
        List<AdditionalAttribute> attribute=new ArrayList<>();

        contact.add(new Contact("HOME","(999)-9999-999",0));
        attribute.add(new AdditionalAttribute("name","value"));
        detail.add(new Detail(UtilityMethods.getRandomString(),UtilityMethods.getRandomString(),UtilityMethods.getRandomString(),true,contact,attribute));

        AddProspect addprospect=new AddProspect(type,country,postalCode,state,detail);

        return addprospect;
    }
}
