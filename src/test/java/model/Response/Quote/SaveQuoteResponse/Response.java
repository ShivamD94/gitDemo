
package model.Response.Quote.SaveQuoteResponse;

import java.util.List;

public class Response {

    private String id;
    private String createTimestamp;
    private List<Link> links = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Response() {
    }

    /**
     * 
     * @param links
     * @param id
     * @param createTimestamp
     */
    public Response(String id, String createTimestamp, List<Link> links) {
        super();
        this.id = id;
        this.createTimestamp = createTimestamp;
        this.links = links;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

}
