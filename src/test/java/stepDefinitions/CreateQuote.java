package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import model.Response.Quote.CreateQuoteResponse.AddQuoteResponse;
import model.Response.Quote.CreateQuoteResponse.Customer;
import model.Response.Quote.CreateQuoteResponse.Pet;
import model.Response.Quote.SaveQuoteResponse.SaveQuoteRes;
import org.junit.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Utility.PropertyHolder.*;
import static data.Quote_TestData.*;
import static io.restassured.RestAssured.given;

public class CreateQuote extends TestBase {

    @When("User hit the POST quote request")
    public void user_hit_the_POST_quote_request(DataTable dataTable) throws IOException {
        Map<String, String> testData = new HashMap<>(dataTable.asMap(String.class, String.class));

        setProperty("PetType",testData.get("pettype"));
        setProperty("BreedId",testData.get("breedid"));
        setProperty("Gender",testData.get("gender"));
        setProperty("State",testData.get("state"));
        setProperty("Zip",testData.get("zip"));
        setProperty("Country",testData.get("countrycode"));

        reqSpec = given().spec(requestSpesification()).body(addquotepayload(testData.get("petId"),testData.get("customerId"),testData.get("email"),
                getProperty("PetType"),getProperty("BreedId"),getProperty("Gender"),getProperty("State"),
                getProperty("Zip"),getProperty("Country")));
        response = reqSpec.when().post(getProperty("URI"));

    }

    @Then("User fetches QuoteID value")
    public void user_fetches_QuoteID_value() {
        AddQuoteResponse quoteres = response.getBody().as(AddQuoteResponse.class);
        Pet petresponse = quoteres.getPayload().getResponses().get(0).getCustomer().getPets().get(0);

        setProperty("QuoteID", petresponse.getQuotes().get(0).getId());
        setProperty("QuoteVersion",petresponse.getQuotes().get(0).getVersion());
        setProperty("ProspectID",quoteres.getPayload().getResponses().get(0).getCustomer().getCustomerId());
        setProperty("PetID",petresponse.getPetId());
        Assert.assertEquals(petresponse.getPetType(),getProperty("PetType"));
        Assert.assertEquals(petresponse.getBreedId(),getProperty("BreedId"));
        Assert.assertNotNull("Rate Matrix returned is Null",petresponse.getRateMatrix());


    }

    @When("^User hit the POST aggregate quote request$")
    public void user_hit_the_post_aggregate_quote_request() throws IOException {
        AddQuoteResponse quoteres = response.getBody().as(AddQuoteResponse.class);
        Customer customer=quoteres.getPayload().getResponses().get(0).getCustomer();
        List<Pet> pet=customer.getPets();
        reqSpec = given().spec(requestSpesification()).body(saveQuotePayload(customer.getCustomerId(),
                customer.getIsPolicyHolder(),customer.getIsPreviousPolicyholder(),pet,pet.get(0).getRateMatrix(),
                pet.get(0).getDob(),pet.get(0).getHasMicrochip(),pet.get(0).getIsWorkingDog(),pet.get(0).getQuotes(),
                pet.get(0).getWeight()));
        response = reqSpec.when().post(getProperty("URI"));

    }

    @When("^User hit the POST aggregate quote request with invalid data$")
    public void user_hit_the_post_aggregate_quote_request_with_invalid_data(DataTable table) throws IOException {
        Map<String, String> testData = new HashMap<>(table.asMap(String.class, String.class));
        AddQuoteResponse quoteres = response.getBody().as(AddQuoteResponse.class);
        Customer customer=quoteres.getPayload().getResponses().get(0).getCustomer();
        List<Pet> pet=customer.getPets();
        ////Negative test case of non mandatory fields handling
        if(testData.containsValue("null")){
            pet.get(0).getDob().setPetActualDoB(testData.get("petActualDob"));
            pet.get(0).getDob().setPetSuggestedDoB(testData.get("petSuggestedDob"));
            pet.get(0).setPetName("");
            pet.get(0).setBreedId("");
            pet.get(0).setGender("");
            pet.get(0).setState("");
            pet.get(0).setCountryCode("");
            pet.get(0).setZip("");
        }
        ////Negative test case of mandatory fields handling
        if(testData.get("customerId").equalsIgnoreCase("")){
            customer.setCustomerId("");
        }
        if(testData.get("petId").equalsIgnoreCase("")){
            pet.get(0).setPetId("");
        }
        if(testData.get("quoteId").equalsIgnoreCase("")){
            pet.get(0).getQuotes().get(0).setId("");
        }
        if(testData.get("priceAffinityType").equalsIgnoreCase("")){
            pet.get(0).getQuotes().get(0).setPriceAffinityType("");
        }
        if(testData.get("deductibleType").equalsIgnoreCase("")){
            pet.get(0).getQuotes().get(0).setDeductibleType("");
        }
        if(testData.get("annualPolicyMaximumLimit").equalsIgnoreCase("")){
            pet.get(0).getQuotes().get(0).setAnnualPolicyMaximumLimit("");
        }
        if(testData.get("premium").equalsIgnoreCase("")){
            pet.get(0).getQuotes().get(0).setPremium(null);
        }
        if(testData.get("taxAndPremium").equalsIgnoreCase("")){
            pet.get(0).getQuotes().get(0).setTaxAndServicePremium(null);
        }
        if(testData.get("petAge").equalsIgnoreCase("")){
            pet.get(0).getDob().setPetAge(null);
        }
        if(testData.get("petWeightUnit").equalsIgnoreCase("")){
            pet.get(0).getWeight().setUnit("");
        }
        if(testData.get("petWeight").equalsIgnoreCase("")){
            pet.get(0).getWeight().setWeight(null);
        }

        reqSpec = given().spec(requestSpesification()).body(saveQuotePayload(customer.getCustomerId(),
                customer.getIsPolicyHolder(),customer.getIsPreviousPolicyholder(),pet,pet.get(0).getRateMatrix(),
                pet.get(0).getDob(),pet.get(0).getHasMicrochip(),pet.get(0).getIsWorkingDog(),pet.get(0).getQuotes(),
                pet.get(0).getWeight()));
        response = reqSpec.when().post(getProperty("URI"));

    }

    @And("^User fetches AggregateQuoteID value$")
    public void user_fetches_aggregatequoteid_value(){
        SaveQuoteRes res=response.as(SaveQuoteRes.class);
        String aggregateQuote=res.getPayload().getResponses().get(0).getId();
        setProperty("AggregateQuoteID",aggregateQuote);
    }

}
