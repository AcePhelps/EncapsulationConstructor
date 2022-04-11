package helpers;

import org.apache.commons.lang3.RandomStringUtils;

public class TestDataGenerator {
    public static String getRandomString(int lenght){

        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(lenght, useLetters, useNumbers);


    }
}
