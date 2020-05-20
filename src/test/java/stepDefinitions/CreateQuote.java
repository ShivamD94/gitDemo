package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import model.Response.Quote.CreateQuoteResponse.AddQuoteResponse;
import org.junit.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static Utility.PropertyHolder.getProperty;
import static Utility.PropertyHolder.setProperty;
import static data.Prospect_TestData.addprospectpayload;
import static data.Quote_TestData.addquotepayload;
import static io.restassured.RestAssured.given;

public class CreateQuote extends TestBase {

    @When("User hit the POST quote request")
    public void user_hit_the_POST_quote_request(DataTable dataTable) throws IOException {
        Map<String, String> testData = new HashMap<>(dataTable.asMap(String.class, String.class));
        setProperty("Email",testData.get("email"));
        setProperty("PetType",testData.get("pettype"));
        setProperty("BreedId",testData.get("breedid"));
        setProperty("Gender",testData.get("gender"));
        setProperty("State",testData.get("state"));
        setProperty("Zip",testData.get("zip"));
        setProperty("CountryCode",testData.get("countrycode"));

        reqSpec = given().spec(requestSpesification()).body(addquotepayload(getProperty("Email"),getProperty("PetType"),
                getProperty("BreedId"),getProperty("Gender"),getProperty("State"),
                getProperty("Zip"),getProperty("CountryCode")));
        response = reqSpec.when().post(getProperty("URI"));

    }

    @Then("User fetches QuoteID value")
    public void user_fetches_QuoteID_value() {
        AddQuoteResponse quoteres = response.getBody().as(AddQuoteResponse.class);
        String QuoteID = quoteres.getPayload().getResponses().get(0).getCustomer().getPets().
                get(0).getQuotes().get(0).getId();
        setProperty("QuoteID", QuoteID);
        String quoteversion = quoteres.getPayload().getResponses().get(0).
                getCustomer().getPets().get(0).getQuotes().get(0).getVersion();
        setProperty("quoteversion",quoteversion);
        Assert.assertEquals(QuoteID,getProperty("QuoteID"));
        Assert.assertEquals(quoteversion,getProperty("quoteversion"));
        Assert.assertEquals("Email",getProperty("Email"));
        Assert.assertEquals("PetType",getProperty("PetType"));
        Assert.assertEquals("BreedId",getProperty("BreedId"));
        Assert.assertEquals("Zip",getProperty("Zip"));
        Assert.assertEquals("CountryCode",getProperty("CountryCode"));

    }

}
