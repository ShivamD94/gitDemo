package Utility;

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
}
