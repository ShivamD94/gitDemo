package model.Pet;

public class Tags {
    private String tag;
    private String startDate;

    public Tags(String tag, String startDate){
        this.tag=tag;
        this.startDate=startDate;
    }

    public String getTag() {
        return tag;
    }

    public String getStartDate() {
        return startDate;
    }
}
