
package model.Response.Prospect.GetProspectResponse;

import java.util.List;

public class Payload {

    private Integer offset;
    private Integer limit;
    private Integer recordCount;
    private List<Response> responses = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payload() {
    }

    /**
     * 
     * @param offset
     * @param recordCount
     * @param limit
     * @param responses
     */
    public Payload(Integer offset, Integer limit, Integer recordCount, List<Response> responses) {
        super();
        this.offset = offset;
        this.limit = limit;
        this.recordCount = recordCount;
        this.responses = responses;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    public List<Response> getResponses() {
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

}
