package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import model.Response.Prospect.CreateProspectResponse.AddProspectResponse;
import model.Response.Prospect.GetProspectResponse.getProspectResponsePayload;
import org.junit.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static Utility.PropertyHolder.*;
import static data.Prospect_TestData.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class CreateProspect extends TestBase {
//@Steps
    @When("^User hit the POST prospect request$")
    public void user_hit_the_post_prospect_request(DataTable table) throws IOException {
        Map<String, String> testData = new HashMap<>(table.asMap(String.class, String.class));
        setProperty("Country",testData.get("country"));
        setProperty("PostalCode",testData.get("postalCode"));
        setProperty("State",testData.get("state"));
        reqSpec = given().spec(requestSpesification()).body(addprospectpayload(testData.get("type"),
                getProperty("Country"),getProperty("PostalCode"),getProperty("State"), testData.get("email")));
        response = reqSpec.when().post(getProperty("URI"));
    }

    @And("^User fetches ProspectID and timestamp values$")
    public void user_fetches_prospectid_and_timestamp_values() {
        AddProspectResponse res = response.getBody().as(AddProspectResponse.class);
        String ProspectID = res.getPayload().getResponses().get(0).getId();
        String timeStamp = res.getPayload().getResponses().get(0).getCreatedTimestamp();
        setProperty("ProspectID", ProspectID);
        setProperty("TimeStamp", timeStamp);
    }

    @When("^User hit the GET prospect request \"([^\"]*)\"$")
    public void user_hit_the_get_prospect_request_something(String prospectID) throws IOException {
        String ProspectID=null;
        if (prospectID.equalsIgnoreCase("valid")){
            ProspectID=getProperty("ProspectID");
        }
        else if (prospectID.equalsIgnoreCase("invalid")){
            ProspectID="PROS123";
        }
        reqSpec = given().spec(requestSpesification()).pathParam("prospectId", ProspectID);
        response = reqSpec.when().get(getProperty("URI"));
    }

    @Then("User verify the get prospect data")
    public void user_verify_the_get_prospect_data() {

        getProspectResponsePayload getRes=response.getBody().as(getProspectResponsePayload.class);
        Assert.assertEquals(getProperty("postalcode"),response.jsonPath().getString("postalcode"));
        Assert.assertEquals(getProperty("email"),response.jsonPath().getString("email"));
        String firstname = getRes.getPayload().getResponses().get(0).getDetails().get(0).getFirstName();
        setProperty("firstname", firstname);
        String email = getRes.getPayload().getResponses().get(0).getDetails().get(0).getEmail();
        setProperty("email", email);


        Assert.assertEquals(getRes.getPayload().getResponses().get(0).getId(),getProperty("ProspectID"));
        Assert.assertEquals(getRes.getPayload().getResponses().get(0).getCountry(),getProperty("Country"));
        Assert.assertEquals(getRes.getPayload().getResponses().get(0).getPostalCode(),getProperty("PostalCode"));
        Assert.assertEquals(getRes.getPayload().getResponses().get(0).getState(),getProperty("State"));
        Assert.assertEquals(email,getProperty("email"));
        Assert.assertEquals(firstname,getProperty("firstname"));
    }
}