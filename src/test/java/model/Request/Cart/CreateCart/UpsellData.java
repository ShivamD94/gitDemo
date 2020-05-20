
package model.Request.Cart.CreateCart;


public class UpsellData  {

    private Integer annualPolicyMaximumLimit;
    private Integer coPayPercentage;
    private Integer annualDeductibleDollarAmount;
    /**
     * 
     * @param annualDeductibleDollarAmount
     * @param coPayPercentage
     * @param annualPolicyMaximumLimit
     */
    public UpsellData(Integer annualPolicyMaximumLimit, Integer coPayPercentage, Integer annualDeductibleDollarAmount) {
        this.annualPolicyMaximumLimit = annualPolicyMaximumLimit;
        this.coPayPercentage = coPayPercentage;
        this.annualDeductibleDollarAmount = annualDeductibleDollarAmount;
    }

    public Integer getAnnualPolicyMaximumLimit() {
        return annualPolicyMaximumLimit;
    }

    public void setAnnualPolicyMaximumLimit(Integer annualPolicyMaximumLimit) {
        this.annualPolicyMaximumLimit = annualPolicyMaximumLimit;
    }

    public Integer getCoPayPercentage() {
        return coPayPercentage;
    }

    public void setCoPayPercentage(Integer coPayPercentage) {
        this.coPayPercentage = coPayPercentage;
    }

    public Integer getAnnualDeductibleDollarAmount() {
        return annualDeductibleDollarAmount;
    }

    public void setAnnualDeductibleDollarAmount(Integer annualDeductibleDollarAmount) {
        this.annualDeductibleDollarAmount = annualDeductibleDollarAmount;
    }

}
