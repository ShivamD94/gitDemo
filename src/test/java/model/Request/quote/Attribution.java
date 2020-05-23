
package model.Request.quote;


public class Attribution {

    private String planOptionExperimentVersion;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attribution() {
    }

    /**
     * 
     * @param planOptionExperimentVersion
     */
    public Attribution(String planOptionExperimentVersion) {
        super();
        this.planOptionExperimentVersion = planOptionExperimentVersion;
    }

    public String getPlanOptionExperimentVersion() {
        return planOptionExperimentVersion;
    }

    public void setPlanOptionExperimentVersion(String planOptionExperimentVersion) {
        this.planOptionExperimentVersion = planOptionExperimentVersion;
    }

}
