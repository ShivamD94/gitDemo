package stepDefinitions;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import model.Response.Cart.CreateCartRes.CreateCartRes;
import model.Response.Cart.GetCartRes.GetCartRes;
import model.Response.Cart.GetCartRes.Response;
import model.Response.Quote.CreateQuoteResponse.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Utility.PropertyHolder.*;
import static data.Cart_TestData.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class CreateCart extends TestBase {
    List<RateMatrix> RateMatrix=null;
    Quote quote;
    @When("^User hit the POST cart request$")
    public void user_hit_the_post_cart_request(DataTable table) throws IOException {
        Map<String, String> testData = new HashMap<>(table.asMap(String.class, String.class));
        String CustomerId=null,PetId=null;
        AddQuoteResponse res = response.getBody().as(AddQuoteResponse.class);
        Customer customer=res.getPayload().getResponses().get(0).getCustomer();
        if(testData.get("customerID").equalsIgnoreCase("valid")) {
            CustomerId = customer.getCustomerId();
        }
        if(testData.get("petID").equalsIgnoreCase("valid")){
            PetId= customer.getPets().get(0).getPetId();
        }
        if(testData.get("rateMatrix").equalsIgnoreCase("invalid")){
            List<Integer> premium=null;
            customer.getPets().get(0).getRateMatrix().get(0).getDeductible().get(0).getCoPay().get(0).setPremium(premium);
        }
        if(testData.get("quotes").equalsIgnoreCase("invalid")){
            customer.getPets().get(0).getQuotes().get(0).setId(null);
        }
        setProperty("CustomerID",CustomerId);
        setProperty("ProspectPetID",PetId);
        RateMatrix=customer.getPets().get(0).getRateMatrix();
        quote=customer.getPets().get(0).getQuotes().get(0);
        Boolean PolicyHolder= customer.getIsPolicyHolder();
        Boolean PrevPolicyHolder=customer.getIsPreviousPolicyholder();
        reqSpec = given().spec(requestSpesification()).body(createCartPayload(CustomerId,PolicyHolder,PrevPolicyHolder,
                PetId,RateMatrix,quote));
        response = reqSpec.when().post(getProperty("URI"));
    }

    @And("^User fetches CartID and timestamp values$")
    public void user_fetches_cartid_and_timestamp_values(){
        CreateCartRes res=response.getBody().as(CreateCartRes.class);
        String CartID=res.getPayload().getResponses().get(0).getId();
        String timeStamp=res.getPayload().getResponses().get(0).getCreateTimestamp();
        setProperty("CartID",CartID);
        setProperty("CartTimeStamp",timeStamp);
    }

    @When("^User hit the GET cart request (.+)$")
    public void user_hit_the_get_cart_request(String emailId) throws IOException {
        String EmailID=null;
        if (emailId.equalsIgnoreCase("valid")){
            EmailID=getProperty("CustomerEmail");
        }
        else EmailID=emailId;
        reqSpec = given().spec(requestSpesification()).pathParam("emailId", EmailID);
        response = reqSpec.when().get(getProperty("URI"));
    }

    @And("^User validates the get Cart data$")
    public void user_validates_the_get_cart_data(){
        GetCartRes res=response.as(GetCartRes.class);
        Response validate=res.getPayload().getResponses().get(0);
        assertEquals(getProperty("CartID"),validate.getId());
        assertEquals(getProperty("CustomerID"),validate.getCustomer().getCustomerId());
        assertEquals(getProperty("CustomerEmail"),validate.getCustomer().getDetails().get(0).getEmail());
        assertEquals(getProperty("ProspectPetID"),validate.getCustomer().getPets().get(0).getId());
//        assertEquals(quote,validate.getCustomer().getPets().get(0).getQuotes().get(0));
//        assertEquals(RateMatrix.toString(),validate.getCustomer().getPets().get(0).getRateMatrix().toString());

    }


}
