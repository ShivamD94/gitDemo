package stepDefinitions;

import Utility.*;
import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import endpoints.pet.PetEndpoint;
import endpoints.petProspect.petProspectEndPoint;
import endpoints.prospect.prospectEndPoint;
import endpoints.quote.quoteEndPoint;
import endpoints.zip.ZipCode;
import io.restassured.module.jsv.JsonSchemaValidator;
import model.Response.ErrorHandling.ErrorHandle;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static Utility.PropertyHolder.*;
import static io.restassured.RestAssured.given;

public class CommonStepDefs extends TestBase {

    String URI;
    @Step
    @Given("^User has the valid endpoint \"([^\"]*)\"$")
    public void user_has_the_valid_prospect_endpoint_something(String endpoint) {
       String[] splitEndpoint= endpoint.split("-");
        if(splitEndpoint[0].toUpperCase().equalsIgnoreCase("PETPROSPECT")){
            URI= petProspectEndPoint.valueOf(splitEndpoint[1]).getResource();
        }
        else if(splitEndpoint[0].toUpperCase().equalsIgnoreCase("PROSPECT")){
            URI= prospectEndPoint.valueOf(splitEndpoint[1]).getResource();
        }
        else if(splitEndpoint[0].toUpperCase().equalsIgnoreCase("QUOTE")) {
            URI = quoteEndPoint.valueOf(splitEndpoint[1]).getResource();
        }
        else if(splitEndpoint[0].toUpperCase().equalsIgnoreCase("PET")){
            URI= PetEndpoint.valueOf(splitEndpoint[1]).getResource();
        }
        else if(splitEndpoint[0].toUpperCase().equalsIgnoreCase("CART")) {
            URI = CartEndpoint.valueOf(splitEndpoint[1]).getResource();
        }
        else if(splitEndpoint[0].toUpperCase().equalsIgnoreCase("LOOKUP")){
            URI= ZipCode.valueOf(splitEndpoint[1]).getResource();
        }
        PropertyHolder.setProperty("URI",URI);
        log.info(URI);
    }

    @When("^User hit the GET request$")
    public void user_hit_the_get_request() throws Throwable {
        reqSpec= given().spec(requestSpesification());
        response= reqSpec.when().get(getProperty("URI"));
    }

    @Then("^verify the status code as (.+)$")
    public void verify_the_status_code_as(int statuscode){
//        response=resSpec.then().spec(resSpec).validate(response);
        response.prettyPrint();
        response.then().assertThat().statusCode(statuscode);
		log.info(statuscode+" Status code verified ");
    }

    @And("^User validates the jsonSchema with \"([^\"]*)\"$")
    public void user_validates_the_jsonschema_with_something(String schema) {
        response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(UtilityMethods.readResponseJsonSchema(schema)));
		log.info("JSON Schema validated");
    }

    @And("^verify the error message for required fields$")
    public void verify_the_error_message_for_required_fields(){
        ErrorHandle res=response.as(ErrorHandle.class);
        for(int i=0;i<res.getErrors().size();i++) {
            String errorCode = res.getErrors().get(i).getErrorCode();
            String errorMessage = res.getErrors().get(i).getMessage();
            Assert.assertTrue("Error message does not match for Error Array "+i,
                    errorMessage.contains("Required field") && errorMessage.contains("is missing or incorrect"));
        }
    }
}
