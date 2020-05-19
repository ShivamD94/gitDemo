package Utility;

import java.io.File;
import java.util.Random;

public class UtilityMethods {

    /**
     * @author Nikhita Garg
     * @description Method to generate a random string
     * @return Random string as string value
     */
    public static String getRandomString() {
        String alphaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder userName = new StringBuilder();
        userName.append("fdp");
        Random rnd = new Random();
        while (userName.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * alphaNumeric.length());
            userName.append(alphaNumeric.charAt(index));
        }

        return userName.toString();
    }

    /**
     * @author Nikhita Garg
     * @description Method to read JSON schema file name
     * @return JSON schema file name
     */

    public static File readResponseJsonSchema(String jsonSchema) {
        try {
            String path=System.getProperty("user.dir")+"/src/test/java/model/JsonSchemas/";
            File file=new File(path+jsonSchema+".json");
            return file;
        } catch (Exception e) {

            System.out.println("Error while reading jsonSchema file name: " + e);
            return null;
        }
    }

}
