
package model.Response.Prospect.GetProspectResponse;

import java.util.List;

public class Response {

    private String id;
    private String country;
    private List<Detail> details = null;
    private Customer customer;
    private List<Object> pets = null;
    private List<Object> quotes = null;
    private List<Link> links = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Response() {
    }

    /**
     * 
     * @param pets
     * @param country
     * @param details
     * @param links
     * @param id
     * @param customer
     * @param quotes
     */
    public Response(String id, String country, List<Detail> details, Customer customer, List<Object> pets, List<Object> quotes, List<Link> links) {
        super();
        this.id = id;
        this.country = country;
        this.details = details;
        this.customer = customer;
        this.pets = pets;
        this.quotes = quotes;
        this.links = links;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Object> getPets() {
        return pets;
    }

    public void setPets(List<Object> pets) {
        this.pets = pets;
    }

    public List<Object> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Object> quotes) {
        this.quotes = quotes;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

}
