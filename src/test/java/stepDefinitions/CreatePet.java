package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import model.Response.Pet.CreatePetProspectResponse.CreatePetProspectRes;
import model.Response.Pet.GetPetBreed.GetPetBreedRes;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static data.Pet_TestData.*;
import static io.restassured.RestAssured.given;
import static Utility.PropertyHolder.*;

public class CreatePet extends TestBase {
//@Steps
    @When("^User hit the GET petBreed request for (.+)$")
    public void user_hit_the_get_petbreed_request_for(String type) throws IOException {
        String URI=getProperty("URI").concat("/"+type);
        reqSpec = given().spec(requestSpesification());
        response = reqSpec.when().get(URI);

    }

    @And("^User fetch the BreedType and BreedID of (.+) pet$")
    public void user_fetch_the_breedtype_and_breedid_of_pet(String pettype){
        String breedID=null;
        GetPetBreedRes breed=response.getBody().as(GetPetBreedRes.class);
        if(pettype.equalsIgnoreCase("DOG")){
          breedID  = breed.getPayload().get(0).getBreeds().get(0).getValue();
        }
        else if(pettype.equalsIgnoreCase("CAT")) {
            breedID = breed.getPayload().get(1).getBreeds().get(0).getValue();
        }
        setProperty("BreedID",breedID);
    }
@Step
    @When("^User hit the POST petProspect request$")
    public void user_hit_the_post_petprospect_request(DataTable table) throws IOException {
        String breedID = null;
        String prospectID = null;
        Map<String, String> testData = new HashMap<>(table.asMap(String.class, String.class));

        //scenario coverage for breedID - valid/null/invalid
        if(testData.get("breed").equalsIgnoreCase("valid")){
                breedID=getProperty("BreedID");
        }
        else if(testData.get("breed").equalsIgnoreCase("null")){
            breedID=null;
        }
        else if(testData.get("breed").equalsIgnoreCase("invalid")){
            breedID="123";
        }

        //scenario coverage for prospectID - valid/null/invalid
        if(testData.get("prospect").equalsIgnoreCase("valid")){
            prospectID=getProperty("ProspectID");
        }
        else if(testData.get("prospect").equalsIgnoreCase("invalid")){
            prospectID="12";
        }
        else if(testData.get("prospect").equalsIgnoreCase("null")){
            prospectID=null;
        }
        reqSpec = given().spec(requestSpesification()).body(addPetProspectpayload(testData.get("name"),testData.get("type"),
        breedID,testData.get("DOB"),prospectID));
        response = reqSpec.when().post(getProperty("URI"));
    }

    @And("^User fetches PetID and timestamp values$")
    public void user_fetches_petid_and_timestamp_values(){
        CreatePetProspectRes res=response.getBody().as(CreatePetProspectRes.class);
        String PetID=res.getPayload().getResponses().get(0).getId();
        String timeStamp=res.getPayload().getResponses().get(0).getCreatedTimestamp();
        setProperty("PetID",PetID);
        setProperty("PetTimeStamp",timeStamp);
    }

    @When("^User hit the GET pet Breed data request for (.+)$")
    public void user_hit_the_get_pet_breed_data_request_for(String type) throws IOException {
        reqSpec = given().spec(requestSpesification()).pathParam("petType",type);
        response = reqSpec.when().get(getProperty("URI"));
    }
}
