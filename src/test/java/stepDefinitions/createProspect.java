package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data.Prospect_TestData;
import endpoints.prospect.prospectEndPoint;
import io.cucumber.datatable.DataTable;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.Response.Prospect.CreateProspectResponse.AddProspectResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class createProspect extends TestBase {
    Response response;
    String URI,ProspectID,timeStamp;
    Prospect_TestData data=new Prospect_TestData();
//    @Steps

    @Given("^User has the valid prospect endpoint \"([^\"]*)\"$")
    public void user_has_the_valid_prospect_endpoint_something(String endpoint) {
         URI= prospectEndPoint.valueOf(endpoint).getResource();
    }


    @When("^User hit the POST prospect request$")
    public void user_hit_the_post_prospect_request(DataTable table) throws IOException {
        Map<String, String> testData = new HashMap<>(table.asMap(String.class, String.class));
           reqSpec = given().spec(requestSpesification())
                    .body(data.addprospectpayload(testData.get("type"),testData.get("country"),
                            testData.get("postalCode"),testData.get("state"),testData.get("email")));
            response = reqSpec.when().post(URI);
            resSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
    }

    @Then("^verify the status code as (.+)$")
    public void verify_the_status_code_as(int statuscode){
        response.then().assertThat().statusCode(statuscode);
    }

    @And("^User fetches ProspectID and timestamp values$")
    public void user_fetches_prospectid_and_timestamp_values(){
        AddProspectResponse res=response.getBody().as(AddProspectResponse.class);
        ProspectID=res.getPayload().getResponses().get(0).getId();
        timeStamp=res.getPayload().getResponses().get(0).getCreatedTimestamp();
    }

    @When("^User hit the GET prospect request$")
    public void user_hit_the_get_prospect_request() throws IOException {
        reqSpec = given().spec(requestSpesification()).pathParam("prospectId",ProspectID);
        response = reqSpec.when().get(URI);
        resSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
    }
}
