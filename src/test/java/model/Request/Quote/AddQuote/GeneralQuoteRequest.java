
package model.Request.Quote.AddQuote;


public class GeneralQuoteRequest {

    private String promoCode;
    private String productId;
    private String policyType;
    private String policyTermPeriod;
    private String policyTerm;
    private String effectiveDate;
    private String priceAffinity;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GeneralQuoteRequest() {
    }

    /**
     * 
     * @param priceAffinity
     * @param policyTermPeriod
     * @param productId
     * @param policyTerm
     * @param policyType
     * @param promoCode
     * @param effectiveDate
     */
    public GeneralQuoteRequest(String promoCode, String productId, String policyType, String policyTermPeriod, String policyTerm, String effectiveDate, String priceAffinity) {
        super();
        this.promoCode = promoCode;
        this.productId = productId;
        this.policyType = policyType;
        this.policyTermPeriod = policyTermPeriod;
        this.policyTerm = policyTerm;
        this.effectiveDate = effectiveDate;
        this.priceAffinity = priceAffinity;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getPolicyTermPeriod() {
        return policyTermPeriod;
    }

    public void setPolicyTermPeriod(String policyTermPeriod) {
        this.policyTermPeriod = policyTermPeriod;
    }

    public String getPolicyTerm() {
        return policyTerm;
    }

    public void setPolicyTerm(String policyTerm) {
        this.policyTerm = policyTerm;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getPriceAffinity() {
        return priceAffinity;
    }

    public void setPriceAffinity(String priceAffinity) {
        this.priceAffinity = priceAffinity;
    }

}
