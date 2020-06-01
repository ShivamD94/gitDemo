package data;

import model.Request.Quote.AddQuote.*;
import model.Request.Quote.SaveQuote.SaveQuoteReq;
import model.Response.Quote.CreateQuoteResponse.Quote;
import model.Response.Quote.CreateQuoteResponse.RateMatrix;

import java.util.ArrayList;
import java.util.List;

import static Utility.PropertyHolder.getProperty;
import static Utility.PropertyHolder.setProperty;
import static Utility.UtilityMethods.getRandomString;

public class Quote_TestData {

    public static AddQuote addquotepayload(String petId,String customerId,String email, String pettype, String breedid, String gender, String state, String zip, String countrycode) {

        Attribution attributions = new Attribution();
        List<Contact> contact = new ArrayList<>();
        String emailID,CustomerId,CustomerName,PetId,PetName;
        if (email.equalsIgnoreCase("random")) {
            emailID = getRandomString() + "@petplan.com";
        } else emailID = email;

        if(customerId.equalsIgnoreCase("valid")){
            CustomerId=getProperty("ProspectID");
            if(email.equalsIgnoreCase("")){ emailID=getProperty("Email");}
            else emailID=email;
        }
        else CustomerId=customerId;
        setProperty("Email", emailID);

        CustomerName=getRandomString();
        setProperty("CustomerName",CustomerName);
        PetName=getRandomString();
        setProperty("PetName",PetName);
        if(petId.equalsIgnoreCase("valid")){
            PetId =getProperty("PetID");
        }
        else PetId=petId;

        Person person = new Person(false, getRandomString(), getRandomString(),getRandomString(), CustomerName,
                emailID, contact);
        HouseHoldAttributes houseHoldAttributes = new HouseHoldAttributes(false,
                false, false, false);
        IndividualPolicyHolder policyholder = new IndividualPolicyHolder(person, houseHoldAttributes);
        List<Pet> pet = new ArrayList<>();
        List<PartnerMember> member = new ArrayList<>();
        Weight weight = new Weight("KG", (float) 20.0);
        GeneralQuoteRequest quotereq = new GeneralQuoteRequest("SAVE10", "wellness", "ANNUAL",
                "30", "day", "2020-05-28",
                "low");
        Dob dob = new Dob(1, "2020-10-28", "2020-10-28");

        contact.add(new Contact("HOME", "(999)-9999-999", 0));
        contact.add(new Contact("MOBILE", "(999)-9999-999", 1));

        member.add(new PartnerMember("BENFIELD-MEMBERSHIP",
                "BENFIELD-MEMBERSHIP-123456"));
        pet.add(new Pet(PetId, PetName,dob, pettype, breedid, gender, weight, false,
                false, state, zip, countrycode, quotereq));

        Customer customers = new Customer(CustomerId,false, true, policyholder, member, pet);
        Attribution attribution = new Attribution("planOptionDefaults");

        AddQuote addquote = new AddQuote(customers, attribution);

        return addquote;
    }

    public static SaveQuoteReq saveQuotePayload(String CustomerId, Boolean IsPolicyHolder, Boolean IsPreviousPolicyholder,
                                                List<model.Response.Quote.CreateQuoteResponse.Pet> petDetails, List<RateMatrix> RateMatrix,
                                                model.Response.Quote.CreateQuoteResponse.Dob DOB, Boolean hasMicrochip, Boolean isWorkingDog,
                                                List<Quote> quotes, model.Response.Quote.CreateQuoteResponse.Weight weight) {

        List<model.Request.Quote.SaveQuote.Pet> petDetailsforQuote=new ArrayList<>();

        petDetailsforQuote.add(new model.Request.Quote.SaveQuote.Pet(petDetails,weight,DOB,hasMicrochip,isWorkingDog,
                RateMatrix, quotes));
        SaveQuoteReq save= new SaveQuoteReq(new model.Request.Quote.SaveQuote.Customer(CustomerId,IsPolicyHolder,
                IsPreviousPolicyholder,petDetailsforQuote));
        return save;
    }
}
