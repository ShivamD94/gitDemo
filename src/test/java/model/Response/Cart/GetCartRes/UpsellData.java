
package model.Response.Cart.GetCartRes;


public class UpsellData {

    private Integer annualDeductibleDollarAmount;
    private Integer annualPolicyMaximumLimit;
    private Integer coPayPercentage;

    public Integer getAnnualDeductibleDollarAmount() {
        return annualDeductibleDollarAmount;
    }

    public void setAnnualDeductibleDollarAmount(Integer annualDeductibleDollarAmount) {
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

}
