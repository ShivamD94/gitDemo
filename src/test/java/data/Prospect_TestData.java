package data;

import model.Request.Prospect.CreateProspect.*;
import org.assertj.core.util.Lists;

import java.util.ArrayList;
import java.util.List;

import static Utility.PropertyHolder.getProperty;
import static Utility.PropertyHolder.setProperty;
import static Utility.UtilityMethods.getRandomString;
public class Prospect_TestData {
    /**
     *
     * @param type
     * @param country
     * @param postalCode
     * @param state
     * @return
     */
    public static List<AddProspect> addprospectpayload(String type, String country, String postalCode, String state, String email){
        List<Detail> detail=new ArrayList<>();
        List<Contact> contact=new ArrayList<>();
        List<Address> address=new ArrayList<>();
        List<AdditionalAttribute> attribute=new ArrayList<>();

        if(email.equalsIgnoreCase("same")){email=getProperty("Email");}
        else if(email.equalsIgnoreCase("random")){email=getRandomString()+"@petplan.com";}

        contact.add(new Contact("HOME","(999)-9999-999"));
        address.add(new Address("BILLING","Benjamin street","","Los Angeles",state,country,postalCode));
        attribute.add(new AdditionalAttribute("name","value"));

        detail.add(new Detail(getRandomString(),getRandomString(),getRandomString(),email,true,contact,address,attribute));

        List<AddProspect> addprospect= Lists.newArrayList(new AddProspect(type,country,detail));
        setProperty("Email",addprospect.get(0).getDetails().get(0).getEmail());
        return addprospect;
    }
}
