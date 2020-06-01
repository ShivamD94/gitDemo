
package model.Response.Prospect.GetProspectResponse;


public class Link {

    private String name;
    private String href;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Link() {
    }

    /**
     * 
     * @param name
     * @param href
     */
    public Link(String name, String href) {
        super();
        this.name = name;
        this.href = href;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

}
