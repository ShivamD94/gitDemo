package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.restassured.response.Response;
import model.Response.Pet.CreatePetInPlatformResponse.AddPetInPlatformRes;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static data.Pet_TestData.*;
import static Utility.PropertyHolder.*;

public class AddPet extends TestBase {
    @Steps
    Response response;

    @When("^User hit the POST request$")
    public void user_hit_the_post_request(DataTable table) throws Throwable {
        Map<String, String> testData = new HashMap<>(table.asMap(String.class, String.class));
        setProperty("petidentifier",testData.get("identifer"));
        reqSpec = given().spec(requestSpesification())
                .body(addpetpayload(testData.get("petType"),testData.get("identifer"), testData.get("breedId"),testData.get("dateOfBirth"),testData.get("gender")));
        response = reqSpec.when().post(getProperty("URI"));
    }

    @When("User fetches petIdentiferID, petName values")
    public void user_fetches_petIdentiferID_petName_values(){
        AddPetInPlatformRes res = response.getBody().as(AddPetInPlatformRes.class);
        String petId=res.getPayload().getResponse().get(0).getId();
        String petName=res.getPayload().getResponse().get(0).getPetName();
        String timeStamp=res.getPayload().getResponse().get(0).getCreatedTimestamp();
        setProperty("PetId",petId);
        setProperty("PetName",petName);
        setProperty("TimeStamp",timeStamp);
        Assert.assertEquals(petId,getProperty("petidentifier"));
        Assert.assertEquals(petName,getProperty("petname"));
    }
}