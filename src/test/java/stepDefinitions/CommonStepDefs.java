package stepDefinitions;

import Utility.PropertyHolder;
import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import endpoints.prospect.prospectEndPoint;
import endpoints.pet.PetEndpoint;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;


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

    @Then("^verify the status code as (.+)$")
    public void verify_the_status_code_as(int statuscode){
        response=resSpec.then().spec(resSpec).validate(response);
        response.then().assertThat().statusCode(statuscode);
    }
}
