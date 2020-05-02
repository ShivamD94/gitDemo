package data;

import model.Pet.Addpet;

public class Pet_TestData {
    /**
     *
     * @param id
     * @param catid
     * @param pname
     * @return
     */
    public static Addpet addpetpayload(int id,int catid, String pname){
        Addpet addpet = new Addpet();
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
