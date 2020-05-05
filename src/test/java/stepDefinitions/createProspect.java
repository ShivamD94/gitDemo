package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import data.Prospect_TestData;
import endpoints.prospect.prospectEndPoint;
import io.cucumber.datatable.DataTable;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class createProspect extends TestBase {
    Response response;
    String URI;
    Prospect_TestData data=new Prospect_TestData();
//    @Steps

    @Given("^User has the valid prospect endpoint \"([^\"]*)\"$")
    public void user_has_the_valid_prospect_endpoint_something(String endpoint) {
         URI= prospectEndPoint.valueOf(endpoint).getResource();
    }


    @When("^User hit the POST request$")
    public void user_hit_the_post_request(DataTable table) throws IOException {
        Map<String, String> testData = new HashMap<>(table.asMap(String.class, String.class));
           reqSpec = given().spec(requestSpesification())
                    .body(data.addprospectpayload(testData.get("type"),testData.get("country"),testData.get("postalCode"),testData.get("state")));
            response = reqSpec.when().post(URI);
            resSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
    }

//    @Then("^verify the status code as \"([^\"]*)\"$")
//    public void verify_the_status_code_as_something(int code){
//        Response res=ProperytHolder.getProperty("response");
//        Assert.assertEquals(res.then().statusCode(200),code);

//    }
}
