package data;

import Utility.UtilityMethods;
import model.Request.Prospect.CreateProspect.AddProspect;
import model.Request.Prospect.CreateProspect.AdditionalAttribute;
import model.Request.Prospect.CreateProspect.Contact;
import model.Request.Prospect.CreateProspect.Detail;
import org.assertj.core.util.Lists;

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
    public static List<AddProspect> addprospectpayload(String type,String country,String postalCode,String state,String email){
        List<Detail> detail=new ArrayList<>();
        List<Contact> contact=new ArrayList<>();
        List<AdditionalAttribute> attribute=new ArrayList<>();

        contact.add(new Contact("HOME","(999)-9999-999",0));
        attribute.add(new AdditionalAttribute("name","value"));
        detail.add(new Detail(UtilityMethods.getRandomString(),UtilityMethods.getRandomString(),
                UtilityMethods.getRandomString(),email,true,contact,attribute));

        List<AddProspect> addprospect= Lists.newArrayList(new AddProspect(type,country,postalCode,state,detail));

        return addprospect;
    }
}
