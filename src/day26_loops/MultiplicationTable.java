package day26_loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number 0 to 10");
        int one = scan.nextInt();
        if (one < 0 || one > 10) {
            System.out.println("error");
            return;
        }

        for (int i = 0; i <= 10; i++){

            System.out.println("multiply: " + one + " * " + i + " = " +one * i);
        }
    }
}
