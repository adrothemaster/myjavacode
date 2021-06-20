package day33_arrays;
import java.util.*;
public class GroupFriends {
    public static void main(String[] args) {
        String[] friend = {"Basel", "Sarah", "Mesut", "Maria", "Aziz", "Andrey", "Jason" };

        for (String each:friend) {
            System.out.println("Friend in group = " + each);
        }
        System.out.println();
            for (int i = 0; i < friend.length; i++) {
                switch (friend[i]) {
                    case "Basel":
                        System.out.println(friend[i] + " Has four year old son, Also " + friend[i] + " is very well spoken! ");
                        break;
                    case "Sarah":
                        System.out.println(friend[i] + " lives in Canada, Also " + friend[i] + " is a full time student. ");
                        break;
                    case "Mesut":
                        System.out.println(friend[i] + " Also lives in Canada, and " + friend[i] + " has traveled all over america.");
                        break;
                    case "Maria":
                        System.out.println(friend[i] + " has a 10 year old daughter and " + friend[i] + " makes her daughters lunches. ");
                        break;
                    case "Aziz":
                        System.out.println(friend[i] + " has not spoken much, but i hope to hear more from " + friend[i] + ".");
                        break;
                    case "Andrey":
                        System.out.println(friend[i] + " is very good with technical java just needs help with soft skills. ");
                        break;
                    case "Jason":
                        System.out.println("I Haven't meet " + friend[i] + " yet but hope to meet " + friend[i] + " soon.");
                        break;

            }
                System.out.println("--------------------------------------------------------------------------");
        }
        System.out.println("Group 32 roster is diverse and well talented group of people 'Time To Code'!!!");
    }
}