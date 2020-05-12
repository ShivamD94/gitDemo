package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import endpoints.pet.PetEndpoint;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.given;
public class GetPetAttributes extends TestBase {
    String URI;
    Response response;
    @Given("^User has the valid pet endpoint \"([^\"]*)\"$")
    public void user_has_the_valid_pet_endpoint_something(String endspoint) throws Throwable {
      URI = PetEndpoint.valueOf(endspoint).getResource();
    }

    @When("^User hit the GET request$")
    public void user_hit_the_get_request() throws Throwable {
        reqSpec= given().spec(requestSpesification());
        response= reqSpec.when().get(URI);
        resSpec= new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
    }

    @Then("^verify the status code as \"([^\"]*)\"$")
    public void verify_the_status_code_as_something(String statuscode) {
    assertEquals(response.getStatusCode(),statuscode);
    }
}
