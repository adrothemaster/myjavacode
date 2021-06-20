package day24_loops;

import java.util.Scanner;

public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I need 5$ please, Give me 1$");
        int dollar = scan.nextInt();

        while (dollar != 5) {
            System.out.println("give me 5 dollars");
            dollar = scan.nextInt();

        }
        System.out.println("thank you for 5 dollars");

    }
}
