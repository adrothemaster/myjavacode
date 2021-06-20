package day24_loops;

import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secreteNum = 69;
        int num;

        do {
            System.out.println("Guess the secrete number");
            num = scan.nextInt();
            if (num < secreteNum) {
                System.out.println("you are to low!");
            }else if (num > secreteNum){
                System.out.println("you are to high");
            }

        }while (num != secreteNum);

        System.out.println("You Guessed Right!!!");
    }
}
