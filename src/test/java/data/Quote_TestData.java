package data;

import Utility.UtilityMethods;

import model.Request.quote.*;

import org.assertj.core.util.Lists;

import java.util.ArrayList;
import java.util.List;

public class Quote_TestData {



    public static AddQuote addquotepayload(String email,String pettype,String breedid,String gender,String state,String zip,String countrycode){

        Attribution attributions=new Attribution();

        List<Contact> contact=new ArrayList<>();
        Person person=new Person(false,UtilityMethods.getRandomString(),UtilityMethods.getRandomString(),
                UtilityMethods.getRandomString(),UtilityMethods.getRandomString(),UtilityMethods.getRandomString()+ "@globallogic.com",contact);
        HouseHoldAttributes houseHoldAttributes = new HouseHoldAttributes(false,
                false,false,false);
        IndividualPolicyHolder policyholder=new IndividualPolicyHolder(person,houseHoldAttributes);
        List<Pet> pet = new ArrayList<>();
        List<PartnerMember> member = new ArrayList<>();
        Weight weight = new Weight("KG", (float) 20.0);
        GeneralQuoteRequest quotereq = new GeneralQuoteRequest("SAVE10","wellness","annual",
                "30","day","2020-05-28",
                "low");
        Dob dob = new Dob(1,"2020-10-28","2020-10-28");
        
        contact.add(new Contact("HOME","(999)-9999-999",0));
        contact.add(new Contact("MOBILE","(999)-9999-999",1));

        member.add(new PartnerMember("BENFIELD-MEMBERSHIP",
                "BENFIELD-MEMBERSHIP-123456"));
        pet.add(new Pet(UtilityMethods.getRandomString(),UtilityMethods.getRandomString(),
                dob,pettype,breedid,gender,weight,false,
                false,state,zip,countrycode,quotereq));
        Customer customers=new Customer(UtilityMethods.getRandomString(),
                false,true,policyholder,member,pet);
        Attribution attribution = new Attribution("planOptionDefaults");

        AddQuote addquote = new AddQuote(customers,attribution);

        return addquote;
    }
}
