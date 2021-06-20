package day32_arrays_split;

import java.util.Arrays;

public class MaxMinPrice {
    public static void main(String[] args) {
        //                 0          1          2         3         4            5
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        int index = 0;
        int indexMin = 0;
        double max = prices[0];
        double min = prices[0];
        System.out.println("-------find and print details of most expensive item-----------");

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                index = i;
            } else if (prices[i] < min) {
                min = prices[i];
                indexMin = i;
            }
        }

        System.out.println("The most expensive item is " + items[index] + " and price is " + prices[index] + "$" + " and item# is " + itemIDs[index]);
        System.out.println("The least expensive item is " + items[indexMin] + " and price is " + prices[indexMin] + "$" + " and item# is " + itemIDs[indexMin] + "\n");


    }
}
