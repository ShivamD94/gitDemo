package data;

import model.Request.Pet.AddPet;

public class Pet_TestData {
    /**
     *
     * @param id
     * @param catid
     * @param pname
     * @return
     */
    public static AddPet addpetpayload(int id, int catid, String pname){
        AddPet addpet = new AddPet();
        addpet.setId(id);
        addpet.setpetName(pname);
        addpet.setCategoryid(catid);
        addpet.setCategoryName("lb");
        addpet.setPhotourl("tesurl");
        addpet.setTagsid(2);
        addpet.setTagsName("testtag");
        return addpet;
    }
}
