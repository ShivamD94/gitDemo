package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static Utility.PropertyHolder.getProperty;
import static Utility.PropertyHolder.setProperty;
import static io.restassured.RestAssured.given;

public class LookupZipCode extends TestBase {

    @When("User hit the GET lookup service request {string}")
    public void user_hit_the_GET_lookup_service_request(String zip, DataTable table) throws IOException {
        Map<String, String> testData = new HashMap<>(table.asMap(String.class, String.class));

        if (zip.equalsIgnoreCase("valid")){
            setProperty("ZipCode",testData.get("zipcode"));
            setProperty("Country",testData.get("country"));

        }
        else if (zip.equalsIgnoreCase("invalid")){
            setProperty("ZipCode",testData.get("zipcode"));
            setProperty("Country",testData.get("country"));

        }
        reqSpec = given().spec(requestSpesification()).queryParam("zip", getProperty("ZipCode"))
                .queryParam("countryCode",getProperty("Country" ));
        response = reqSpec.when().get(getProperty("URI"));


    }
    @Then("User verify the get response data")
    public void user_verify_the_get_response_data(DataTable table) {
        Map<String, String> testData = new HashMap<>(table.asMap(String.class, String.class));
        Assert.assertEquals(testData.get("state"),response.jsonPath().getString("state"));
    }

}
