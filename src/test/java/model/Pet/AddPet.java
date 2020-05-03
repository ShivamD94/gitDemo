package model.Pet;

/**
 * Model file
 */
public class AddPet {
    private String petType;;
    private String petName;;

    private int id;
    private int categoryid;
    private String categoryName;
    private String photourl;
    private int tagsid;
    private String tagsName;
    private String status="available";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl;
    }

    public int getTagsid() {
        return tagsid;
    }

    public void setTagsid(int tagsid) {
        this.tagsid = tagsid;
    }

    public String getTagsName() {
        return tagsName;
    }

    public void setTagsName(String tagsName) {
        this.tagsName = tagsName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    {
//        "id": 0,
//            "category": {
//        "id": 0,
//                "name": "string"
//    },
//        "name": "doggie",
//            "photoUrls": [
//        "string"
//  ],
//        "tags": [
//        {
//            "id": 0,
//                "name": "string"
//        }
//  ],
//        "status": "available"
//
    public String getpetName() {
        return petName;
    }
    public void setpetName(String name) {
        this.petName=name;
    }
    public void setpetType(String type) {
         petType =type;
    }
    public String getpetType() {
        return petType;
    }
}
