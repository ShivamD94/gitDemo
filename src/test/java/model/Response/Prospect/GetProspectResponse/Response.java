
package model.Response.Prospect.GetProspectResponse;

import java.util.List;

public class Response {

    private String id;
    private String country;
    private String postalCode;
    private String state;
    private List<Detail> details = null;
    /*private Customer customer;
    private List<Pet> pets = null;
    private List<Quote> quotes = null;
    private List<Link___> links = null;*/

    /**
     * No args constructor for use in serialization
     *
     */
    public Response() {
    }

    /**
     *
     * @param id
     * @param country
     * @param postalCode
     * @param state
     * @param details
     */
    public Response(String id, String country, String postalCode, String state, List<Detail> details) {
        super();
        this.id = id;
        this.country = country;
        this.postalCode = postalCode;
        this.state = state;
        this.details = details;
       /* this.customer = customer;
        this.pets = pets;
        this.quotes = quotes;
        this.links = links;*/
    }

    public String getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getState() {
        return state;
    }

    public List<Detail> getDetails() {
        return details;
    }













}
