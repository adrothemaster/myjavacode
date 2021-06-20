package day23_String_manipulation_while_loop;

import java.net.BindException;
import java.util.Locale;

public class SMSMessage__Also_Murodils__Number {
    public static void main(String[] args) {
        //                                           murodils number !!!
        String message = "Sender: [ saim ] from number<(202) 375-1774>message:{hello, lets code some java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start+1, end));
        String sender = message.substring(start+1, end);
        System.out.println("sender = " + sender);

        String mobile = message.substring( message.indexOf("<") + 1, message.indexOf(">") );
        System.out.println("mobile = " + mobile);


        String text = message.substring( message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text);

        System.out.println("fikret".trim());

        sender= sender.trim();

        if (sender.equals("saim")) {
            System.out.println("message from saim about homework");
        }else{
            System.out.println("someone else message");}
        {

            String word = " java ";
            System.out.println(word.trim());

            word = " s q l ";
            System.out.println(word.trim());
            System.out.println(word);
            word = word.trim();

            System.out.println(word.trim());

            String word1 = "hello world";



        }
    }
}
