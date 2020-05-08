package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data.AddPetInPlatform_TestData;
import endpoints.pet.PetEndpoint;
import io.cucumber.datatable.DataTable;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;

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
       }

    @When("^User hit the POST request$")
    public void user_hit_the_post_request(DataTable table) throws Throwable {
        Map<String, String> testData = new HashMap<>(table.asMap(String.class, String.class));
        reqSpec = given().spec(requestSpesification())
                .body(data.addpetpayload(testData.get("petType"),testData.get("identifer"), testData.get("breedId"),testData.get("dateOfBirth"),testData.get("gender")));
        response = reqSpec.when().post(URI);
        resSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
    }

     @Then("^verify the status code as (.+)$")
        public void verify_the_status_code_as(int statuscode){
        response.then().assertThat().statusCode(statuscode);
    }
}