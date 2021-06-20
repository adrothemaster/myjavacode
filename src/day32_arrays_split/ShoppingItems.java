package day32_arrays_split;

import java.util.*;

public class ShoppingItems {
    public static void main(String[] args) {
        //                    0          1          2           3           4            5
        String[] items  = {"Shoes",  "Jacket",  "Gloves",   "Airpods",   "iPad",   "iphone 11 case" };
        double[] prices = {99.99,     150.0,     9.99,       250.0 ,     439.50,    39.99};
        int[] itemIDs =   {12345 ,    12346,     12347,      12348,      12349,     12350};

        System.out.println("------ find first index of gloves in items array ------");
       for (int i = 0; i < items.length; i++ ){
           if (items[i].equals("Gloves")) {
               System.out.println("gloves found at index " + i);
               break;
               // System.out.println(i + " " + items[i]);
           }
        }
        System.out.println("------ set boolean to true if 'ipad' is found ------");
       boolean ipadExits = false;
       for (int i = 0; i < items.length; i++){
           if (items [i].equals("ipad")) {
               ipadExits = true;
               System.out.println("ipadExits = " + ipadExits);
               break;
           }
       }
       System.out.println("ipadExits = " + ipadExits);
       if (ipadExits) {
           System.out.println("we bought the ipad: ");
       }else{
           System.out.println("we forgot the ipad: ");
       }

        System.out.println("------ print a report of each shopping item -----");

       for (int i = 0; i < items.length; i++){
           System.out.println("item: "+ items[i] +" " + prices[i]+ "$" + " " + "ID# "   +itemIDs[i] + " ");
       }

        System.out.println("------ Loop for 'jacket' in items and print all details -----");
       boolean jacketExits = false;
       for (int i = 0; i < items.length; i++) {
           if (items[i].equalsIgnoreCase("jacket")) {
               System.out.println("item: "+ items[i] +" costs $" + prices[i] + " " + "ID# " +itemIDs[i] + " ");
               break;
           }
           for (int j = 0; j < items.length; j++){
               switch (items[j]){
                   case "shoes":
                       System.out.println("item: "+ items[j] +" " + prices[j]+ "$" + " " + "ID# "   +itemIDs[j] + " ");
                       break;
                   case "jacket":
                       System.out.println("item: "+ items[j] +" " + prices[j]+ "$" + " " + "ID# "   +itemIDs[j] + " ");
                       break;
               }
           }
       }
    }
}
