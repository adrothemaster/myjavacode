package day27_loops;

import java.util.Scanner;

public class IndexOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean notFound = false;
        System.out.println("Enter your sentence here:");
        String word = scan.nextLine();
        System.out.println("Enter a character to find in your sentence:");
        char letter = scan.next().charAt(0);
        for (int n= 0; n<word.length()-1; n++){
            if (word.charAt(n) == letter){
                System.out.println(word.charAt(n) + " is found at index #"+n);            }
            else {notFound=true;}
        }
        if (notFound) {
            System.out.println("Your caracter is not found in the sentence.");
        }
    }
}
