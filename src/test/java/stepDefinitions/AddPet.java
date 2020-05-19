package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import model.Response.Pet.CreatePetInPlatformResponse.AddPetInPlatformRes;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static Utility.PropertyHolder.*;
import static data.Pet_TestData.*;
import static io.restassured.RestAssured.given;

public class AddPet extends TestBase {
//@Step

    @When("^User hit the POST request$")
    public void user_hit_the_post_request(DataTable table) throws Throwable {
        Map<String, String> testData = new HashMap<>(table.asMap(String.class, String.class));
        reqSpec = given().spec(requestSpesification())
                .body(addpetpayload(testData.get("petType"),testData.get("breedId"),testData.get("dateOfBirth"),testData.get("gender")));
        response = reqSpec.when().post(getProperty("URI"));
    }

    @When("User fetches petIdentiferID, petName values")
    public void user_fetches_petIdentiferID_petName_values(){
        AddPetInPlatformRes res = response.getBody().as(AddPetInPlatformRes.class);
        String petId=res.getPayload().getResponses().get(0).getId();
        String petName=res.getPayload().getResponses().get(0).getPetName();
        setProperty("PetId",petId);
        setProperty("PetName",petName);
        Assert.assertEquals(petId,getProperty("petidentifier"));
        Assert.assertEquals(petName,getProperty("petname"));
    }
}