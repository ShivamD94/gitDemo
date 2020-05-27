package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import model.Response.Prospect.CreateProspectResponse.AddProspectResponse;
import model.Response.Prospect.GetProspectResponse.GetProspectRes;
import model.Response.Prospect.GetProspectResponse.Response;
import org.junit.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static Utility.PropertyHolder.getProperty;
import static Utility.PropertyHolder.setProperty;
import static data.Prospect_TestData.addprospectpayload;
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

    @And("User verify the get prospect data")
    public void user_verify_the_get_prospect_data() {

        GetProspectRes getRes=response.getBody().as(GetProspectRes.class);
        Assert.assertEquals(getProperty("postalcode"),response.jsonPath().getString("postalcode"));
        Assert.assertEquals(getProperty("email"),response.jsonPath().getString("email"));
        String firstname = getRes.getPayload().getResponses().get(0).getDetails().get(0).getFirstName();
        setProperty("firstname", firstname);
        String email = getRes.getPayload().getResponses().get(0).getDetails().get(0).getEmail();
        setProperty("email", email);
        Assert.assertEquals(getRes.getPayload().getResponses().get(0).getId(),getProperty("ProspectID"));
        Assert.assertEquals(getRes.getPayload().getResponses().get(0).getCountry(),getProperty("Country"));
        Assert.assertEquals(email,getProperty("email"));
        Assert.assertEquals(firstname,getProperty("firstname"));
        GetProspectRes res=response.as(GetProspectRes.class);
        Response data=res.getPayload().getResponses().get(0);
        Assert.assertEquals(getProperty("ProspectID"),data.getId());
        Assert.assertEquals(getProperty("Country"),data.getCountry());
        Assert.assertEquals(getProperty("ProspectName"),data.getDetails().get(0).getName());
        Assert.assertEquals(getProperty("Email"),data.getDetails().get(0).getEmail());
    }

    @When("^User hit the GET prospect by email request (.+)$")
    public void user_hit_the_get_prospect_by_email_request(String email) throws IOException {
        String emailId=null;
        if (email.equalsIgnoreCase("valid")){
            emailId=getProperty("Email");
        }
        else if (email.equalsIgnoreCase("invalid")){
            emailId="invalid@pet";
        }
        else if (email.equalsIgnoreCase("null")){
            emailId=null;
        }
        else emailId=email;
        reqSpec = given().spec(requestSpesification()).queryParam("email",emailId);
        response = reqSpec.when().get(getProperty("URI"));
    }
}
