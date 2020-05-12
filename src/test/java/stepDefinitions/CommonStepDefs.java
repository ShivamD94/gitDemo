package stepDefinitions;

import Utility.*;
import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import endpoints.prospect.prospectEndPoint;
import endpoints.pet.PetEndpoint;
import io.restassured.response.Response;
import io.restassured.module.jsv.JsonSchemaValidator;

import static Utility.PropertyHolder.getProperty;
import static io.restassured.RestAssured.given;


public class CommonStepDefs extends TestBase {

    String URI;
    Response response;
    @Given("^User has the valid endpoint \"([^\"]*)\"$")
    public void user_has_the_valid_prospect_endpoint_something(String endpoint) {
        if(endpoint.toUpperCase().contains("PROSPECT")){
            URI= prospectEndPoint.valueOf(endpoint).getResource();
        }
        else if(endpoint.toUpperCase().contains("PET")){
            URI= PetEndpoint.valueOf(endpoint).getResource();
        }
        PropertyHolder.setProperty("URI",URI);
    }

    @When("^User hit the GET request$")
    public void user_hit_the_get_request() throws Throwable {
        reqSpec= given().spec(requestSpesification());
        response= reqSpec.when().get(getProperty("URI"));
    }

    @Then("^verify the status code as (.+)$")
    public void verify_the_status_code_as(int statuscode){
        response=resSpec.then().spec(resSpec).validate(response);
        response.then().assertThat().statusCode(statuscode);
    }

    @And("^User validates the jsonSchema with \"([^\"]*)\"$")
    public void user_validates_the_jsonschema_with_something(String schema){
        response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(UtilityMethods.readResponseJsonSchema(schema)));
    }
}
