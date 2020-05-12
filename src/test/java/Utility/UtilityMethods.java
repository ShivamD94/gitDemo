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
     * @description Method to read JSON schema file
     * @return JSON schema
     */

    public static String readResponseJsonSchema(String jsonSchema) {
        try {
            String path="src/test/java/model/JsonSchemas/";
            File file=new File(path+jsonSchema+".json");
            String jsonString = file.toString();
            return jsonString;
        } catch (Exception e) {

            System.out.println("Error while reading jsonSchema file : " + e);
            return null;
        }
    }

}
