package stepDefinitions;

import Utility.PropertyHolder;
import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data.AddPetInPlatform_TestData;
import endpoints.pet.PetEndpoint;
import io.cucumber.datatable.DataTable;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.Pet.AddPetInPlatform;
import model.Response.Pet.CreatePetInPlatformResponse.AddPetInPlatformRes;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class AddPet extends TestBase {

    Response response;
    String URI;
@Steps
    AddPetInPlatform_TestData data=new AddPetInPlatform_TestData();

    @Given("^User has the valid pet endpoint \"([^\"]*)\"$")
    public void user_has_the_valid_pet_endpoint_something(String endpoint) throws Throwable {
        URI= PetEndpoint.valueOf(endpoint).getResource();
        PropertyHolder.setProperty("URI",URI);
       }

    @When("^User hit the POST request$")
    public void user_hit_the_post_request(DataTable table) throws Throwable {
        Map<String, String> testData = new HashMap<>(table.asMap(String.class, String.class));
        PropertyHolder.setProperty("petidentifier",testData.get("identifer"));
        reqSpec = given().spec(requestSpesification())
                .body(data.addpetpayload(testData.get("petType"),testData.get("identifer"), testData.get("breedId"),testData.get("dateOfBirth"),testData.get("gender")));
        response = reqSpec.when().post(PropertyHolder.getProperty("URI"));
        resSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
    }

    @When("User fetches petIdentiferID, petName values")
    public void user_fetches_petIdentiferID_petName_values(){
        AddPetInPlatformRes res = response.getBody().as(AddPetInPlatformRes.class);
        String petId=res.getPayload().getResponse().get(0).getId();
        String petName=res.getPayload().getResponse().get(0).getPetName();
        String timeStamp=res.getPayload().getResponse().get(0).getCreatedTimestamp();
        PropertyHolder.setProperty("PetId",petId);
        PropertyHolder.setProperty("PetName",petName);
        PropertyHolder.setProperty("TimeStamp",timeStamp);
        Assert.assertEquals(petId,PropertyHolder.getProperty("petidentifier"));
        Assert.assertEquals(petName, PropertyHolder.getProperty("petname"));
    }

     @Then("^verify the status code as (.+)$")
        public void verify_the_status_code_as(int statuscode){
        response.then().assertThat().statusCode(statuscode);
    }
}