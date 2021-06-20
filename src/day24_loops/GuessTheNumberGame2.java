package day24_loops;

import java.util.Random;
import java.util.Scanner;
/*
create counter for attempts with a MAX counter of 5...
 */
public class GuessTheNumberGame2 {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
        int secreteNumber = randomNum.nextInt(101);
        int guessingNumber;
        do {
            System.out.println("Guess the secrete Number");
            guessingNumber = scan.nextInt();
            if(guessingNumber > secreteNumber){
                System.out.println("wrong: number is to large");
            }else if (guessingNumber < secreteNumber){
                System.out.println("wrong: number is to small");
            }
        }while (secreteNumber != guessingNumber);
        System.out.println("congratulations you've won the number was: " + guessingNumber);
    }
}
