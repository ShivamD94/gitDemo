package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.*;

import java.io.IOException;

import static Utility.PropertyHolder.getProperty;
import static io.restassured.RestAssured.given;

public class GetProspectPetByID extends TestBase {

    @When("User hit the GET prospect-pet request by prospectID")
    public void user_hit_the_GET_prospect_pet_request_by_prospectID() throws IOException {
        reqSpec = given().spec(requestSpesification()).queryParam("prospect-id", getProperty("ProspectID"));
        response = reqSpec.when().get(getProperty("URI"));
        log.info("When User hit the GET prospect-pet request by prospectID");
        log.info("Pros ID "+getProperty("ProspectID"));
    }

    @Given("User has the valid ProspectID and PetID")
    public void user_has_the_valid_ProspectID_and_PetID() throws IOException {
        reqSpec = given().spec(requestSpesification()).queryParam("prospect-id", getProperty("ProspectID"))
                .queryParam("pet-id",getProperty("PetID") );
        log.info("Given User has the valid ProspectID and PetID");
    }

    @When("User hit the GET prospect-pet request by prospectID and petID")
    public void user_hit_the_GET_prospect_pet_request_by_prospectID_and_petID() {
        response = reqSpec.when().get(getProperty("URI"));
        log.info("When User hit the GET prospect-pet request by prospectID and petID");
    }

}
