package day22_string_manipulation;

import java.lang.*;

public class ReversUsingCharAT {
    public static void main(String[] args) {

        String word = "anna";
        System.out.print(word.charAt(3));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.println(word.charAt(0));
        System.out.println(word);

        System.out.println("" + word.charAt(3) + word.charAt(2)
                + word.charAt(1) + word.charAt(0));

        String reverse = ("" + word.charAt(3) + word.charAt(2)
                + word.charAt(1) + word.charAt(0));
        System.out.println("word = " + reverse);
        System.out.println("reverse = " + reverse);

        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome word");
        }else{
            System.out.println("not Palindrome word");
        }




    }
}
