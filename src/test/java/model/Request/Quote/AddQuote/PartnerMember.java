
package model.Request.Quote.AddQuote;


public class PartnerMember {

    private String membershipPartnerName;
    private String membershipPartnerId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PartnerMember() {
    }

    /**
     * 
     * @param membershipPartnerId
     * @param membershipPartnerName
     */
    public PartnerMember(String membershipPartnerName, String membershipPartnerId) {
        super();
        this.membershipPartnerName = membershipPartnerName;
        this.membershipPartnerId = membershipPartnerId;
    }

    public String getMembershipPartnerName() {
        return membershipPartnerName;
    }

    public void setMembershipPartnerName(String membershipPartnerName) {
        this.membershipPartnerName = membershipPartnerName;
    }

    public String getMembershipPartnerId() {
        return membershipPartnerId;
    }

    public void setMembershipPartnerId(String membershipPartnerId) {
        this.membershipPartnerId = membershipPartnerId;
    }

}
