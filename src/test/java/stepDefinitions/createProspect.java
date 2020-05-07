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
import Utility.PropertyHolder;
import model.Response.Prospect.GetProspectResponse.getProspectResponsePayload;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class createProspect extends TestBase {
    @Steps
    Response response;
    Prospect_TestData data = new Prospect_TestData();

    @When("^User hit the POST prospect request$")
    public void user_hit_the_post_prospect_request(DataTable table) throws IOException {
        Map<String, String> testData = new HashMap<>(table.asMap(String.class, String.class));
        reqSpec = given().spec(requestSpesification())
                .body(data.addprospectpayload(testData.get("type"), testData.get("country"),
                        testData.get("postalCode"), testData.get("state"), testData.get("email")));
        response = reqSpec.when().post(PropertyHolder.getProperty("URI"));
        resSpec = new ResponseSpecBuilder().expectStatusCode(200).build();

    }

    @And("^User fetches ProspectID and timestamp values$")
    public void user_fetches_prospectid_and_timestamp_values() {
        AddProspectResponse res = response.getBody().as(AddProspectResponse.class);
        String ProspectID = res.getPayload().getResponses().get(0).getId();
        String timeStamp = res.getPayload().getResponses().get(0).getCreatedTimestamp();
        PropertyHolder.setProperty("ProspectID", ProspectID);
        PropertyHolder.setProperty("TimeStamp", timeStamp);
    }

    @When("^User hit the GET prospect request$")
    public void user_hit_the_get_prospect_request() throws IOException {
        reqSpec = given().spec(requestSpesification()).pathParam("prospectId", PropertyHolder.getProperty("ProspectID"));
        response = reqSpec.when().get(PropertyHolder.getProperty("URI"));
        resSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
    }

    @Then("User verify the get prospect data")
    public void user_verify_the_get_prospect_data(DataTable table) {

        Map<String, String> testData=new HashMap<>(table.asMap(String.class,String.class));
        getProspectResponsePayload getRes=response.getBody().as(getProspectResponsePayload.class);
        Assert.assertEquals(getRes.getPayload().getResponses().get(0).getId(),PropertyHolder.getProperty("ProspectID"));
        Assert.assertEquals(getRes.getPayload().getResponses().get(0).getCountry(),PropertyHolder.getProperty("country"));
        Assert.assertEquals(getRes.getPayload().getResponses().get(0).getPostalCode(),PropertyHolder.getProperty("postalCode"));
        Assert.assertEquals(getRes.getPayload().getResponses().get(0).getState(),PropertyHolder.getProperty("state"));
        Assert.assertEquals(getRes.getPayload().getResponses().get(0).getDetails(),PropertyHolder.getProperty("email"));
        Assert.assertEquals(getRes.getPayload().getResponses().get(0).getDetails(), PropertyHolder.getAllProperty());
        Assert.assertEquals(getRes.getPayload().getResponses().get(0).getDetails(), PropertyHolder.getProperty("Contact"));
    }
    @When("User hit the GET prospect request with invalid ID")
    public void user_hit_the_GET_prospect_request_with_invalid_ID() throws IOException {
        String ID = PropertyHolder.getProperty("ProspectID");
        reqSpec = given().spec(requestSpesification()).pathParam("prospectId",ID + "123" );
        response = reqSpec.when().get(PropertyHolder.getProperty("URI"));
        resSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
    }


}
