package com.FrontOffice.util;

import java.security.SecureRandom;

public class PwdUtils {
    //allowed character
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
            "abcdefghijklmnopqrstuvwxyz" +
            "0123456789" +
            "!@#$%^&*()-_=+";

    public static String getPassword() {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        int length = random.nextInt();
        for (int i = 0; i < 6; i++) {
            //CHARACTERS.length() return 75 ==0 to 74
            int randNum = random.nextInt(CHARACTERS.length());
            System.out.print(randNum);
            password.append(CHARACTERS.charAt(randNum));

        }
        return password.toString();
    }
}
