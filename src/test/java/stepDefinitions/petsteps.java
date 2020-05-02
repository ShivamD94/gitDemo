package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data.Pet_TestData;
import endpoints.pet.petendpoint;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

/**
 * Step file to test add and get pet
 */

public class petsteps extends TestBase {

    Response response;
    @Steps
    Pet_TestData data= new Pet_TestData();

    @Given("pets add endpoints available")
    public void pets_add_endpoints_available() throws IOException {
        reqSpec=given().spec(requestSpesification())
                .body(data.addpetpayload(11,2,"drian"));;
    }

    @When("user call endpoint and post")
    public void user_call_endpoint_and_post() {
        petendpoint petadd = petendpoint.valueOf("AddPet");
        System.out.println(petadd.getResource());

        response = reqSpec.when().post(petadd.getResource());
        resSpec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
    }

    @Then("Verify added pets status")
    public void verify_added_pets_status() {
        assertEquals(response.getStatusCode(),200);
    }

    @Given("get pets info")
    public void get_pets_info() throws IOException {
        reqSpec=given().spec(requestSpesification());
    }
    @When("user call endpoint and get")
    public void user_call_endpoint_and_get() {
        petendpoint petget = petendpoint.valueOf("GetPet");
        System.out.println(petget.getResource());
        resSpec= new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
        response = reqSpec.when().get(petget.getResource());
    }
    @Then("Verify status")
    public void verify_status() {
        assertEquals("11",getJsonPath(response,"id"));
    }



}
