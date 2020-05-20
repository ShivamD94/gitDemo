package data;

import Utility.UtilityMethods;

import model.Request.quote.*;

import org.assertj.core.util.Lists;

import java.util.ArrayList;
import java.util.List;

public class Quote_TestData {



    public static List<AddQuote> addquotepayload(String email,String pettype,String breedid,String gender,String state,String zip,String countrycode){

        Attribution attributions=new Attribution();

        List<Contact> contact=new ArrayList<>();
        Person person=new Person(true,UtilityMethods.getRandomString(),UtilityMethods.getRandomString(),
                UtilityMethods.getRandomString(),UtilityMethods.getRandomString(),email,contact);
        HouseHoldAttributes houseHoldAttributes = new HouseHoldAttributes(false,
                false,false,false);
        IndividualPolicyHolder policyholder=new IndividualPolicyHolder(person,houseHoldAttributes);
        List<Pet> pet = new ArrayList<>();
        List<PartnerMember> member = new ArrayList<>();
        Weight weight = new Weight("KG", (float) 22.5);
        GeneralQuoteRequest quotereq = new GeneralQuoteRequest("SAVE10","wellness","annual|percondition",
                "30|12","day|month|year","10-05-2020",
                "low|medium|high");
        Dob dob = new Dob(1,"2019-10-28","2019-10-28");
        
        contact.add(new Contact("HOME","(999)-9999-999",0));
        contact.add(new Contact("MOBILE","(999)-9999-999",1));

        member.add(new PartnerMember("BENFIELD-MEMBERSHIP",
                "BENFIELD-MEMBERSHIP-123456"));
        pet.add(new Pet(UtilityMethods.getRandomString(),UtilityMethods.getRandomString(),
                dob,pettype,breedid,gender,weight,false,
                false,state,zip,countrycode,quotereq));
        Customer customers=new Customer(UtilityMethods.getRandomString(),
                false,true,policyholder,member,pet);
        Attribution attribution = new Attribution("default");

        List<AddQuote> addquote = Lists.newArrayList(new AddQuote(customers,attribution));

        return addquote;
    }
}
