package day38_methods;

import static day38_methods.stringUtils.*;


public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if (stringUtils.isNullOrEmpty(userName)){
            System.out.println("fail: user name empty");
        }

        System.out.println("isPalindrome (civic) = " + stringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + stringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(cybertek) = " + isPalindrome("cybertek"));

        String word = "java";
        String revWord = stringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);
    }
}
