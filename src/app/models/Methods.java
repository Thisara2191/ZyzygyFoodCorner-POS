/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.models;

import java.util.Random;
import java.util.UUID;

/**
 *
 * @author Titu
 */
public class Methods {

    public static int generateRandomNumber(int length) {
        Random random = new Random();
        int randomNumber = 100000 + random.nextInt(length * 100000);
        return randomNumber;
    }

    public static String generateRandomString(int length, String prefix, String suffix) {
        String randomString = UUID.randomUUID().toString().replaceAll("-", "").substring(0, length).toUpperCase();
        return prefix + randomString + suffix;
    }
}
