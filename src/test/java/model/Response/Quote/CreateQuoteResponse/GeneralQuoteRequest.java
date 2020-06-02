
package model.Response.Quote.CreateQuoteResponse;


public class GeneralQuoteRequest {

    private String promoCode;
    private String productId;
    private String policyType;
    private String policyTermPeriod;
    private String policyTerm;
    private String effectiveDate;
    private String priceAffinity;

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
