package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data.Prospect_TestData;
import io.cucumber.datatable.DataTable;
import io.restassured.response.Response;
import model.Response.Prospect.CreateProspectResponse.AddProspectResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import Utility.PropertyHolder;
import net.thucydides.core.annotations.Steps;

import static io.restassured.RestAssured.given;

public class createProspect extends TestBase {
    @Steps
    Response response;
    Prospect_TestData data=new Prospect_TestData();

    @When("^User hit the POST prospect request$")
    public void user_hit_the_post_prospect_request(DataTable table) throws IOException {
        Map<String, String> testData = new HashMap<>(table.asMap(String.class, String.class));
           reqSpec = given().spec(requestSpesification())
                    .body(data.addprospectpayload(testData.get("type"),testData.get("country"),
                            testData.get("postalCode"),testData.get("state"),testData.get("email")));
           response= reqSpec.when().post(PropertyHolder.getProperty("URI"));
    }

    @And("^User fetches ProspectID and timestamp values$")
    public void user_fetches_prospectid_and_timestamp_values(){
        AddProspectResponse res=response.getBody().as(AddProspectResponse.class);
        String ProspectID=res.getPayload().getResponses().get(0).getId();
        String timeStamp=res.getPayload().getResponses().get(0).getCreatedTimestamp();
        PropertyHolder.setProperty("ProspectID",ProspectID);
        PropertyHolder.setProperty("TimeStamp",timeStamp);
    }

    @When("^User hit the GET prospect request$")
    public void user_hit_the_get_prospect_request() throws IOException {
        reqSpec = given().spec(requestSpesification()).pathParam("prospectId",PropertyHolder.getProperty("ProspectID"));
        response = reqSpec.when().get(PropertyHolder.getProperty("URI"));
    }
}
