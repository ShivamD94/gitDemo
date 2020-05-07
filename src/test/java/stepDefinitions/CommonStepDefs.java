package stepDefinitions;

import Utility.PropertyHolder;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import endpoints.prospect.prospectEndPoint;
import endpoints.pet.PetEndpoint;
import io.restassured.response.Response;


public class CommonStepDefs {

    String URI;
    Response response;
    @Given("^User has the valid endpoint \"([^\"]*)\"$")
    public void user_has_the_valid_prospect_endpoint_something(String endpoint) {
        if(endpoint.contains("prospect")){
            URI= prospectEndPoint.valueOf(endpoint).getResource();
        }
        else if(endpoint.contains("pet")){
            URI= PetEndpoint.valueOf(endpoint).getResource();
        }

        PropertyHolder.setProperty("URI",URI);
    }

    @Then("^verify the status code as (.+)$")
    public void verify_the_status_code_as(int statuscode){
        response.then().assertThat().statusCode(statuscode);
    }
}
