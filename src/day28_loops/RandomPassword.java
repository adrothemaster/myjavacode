package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {


    String sours = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
    Random random = new Random();
    String password = "";
        for (int i = 1; i <= 8; i++) {

        int index = random.nextInt(71);
        password += sours.charAt(index);
        // System.out.print(sours.charAt(index));
    }
        System.out.println("Password - " + password);
 }
}
