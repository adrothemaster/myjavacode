package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CitiesList {
    public static void main(String[] args) {
        // declare arraylist
        ArrayList<String> cities = new ArrayList<>();
        // add cities to ArrayList -> add methods
        cities.add("Washington DC");    //0
        cities.add("new York");        //1
        cities.add("Chicago");         //2
        cities.add("Dallas");          //3
        cities.add("LA");             //4
        // add Cleavland to 1st position
        cities.add(0, "Cleavland");
        //print all in same line
        System.out.println(cities);
        //print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));
        // find last index using size() - 1
        System.out.println("last city = " + cities.get(cities.size()-1));

        // print count of items in list
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("there are " + size + " cities on the list");

        // for loop and print all values in same line
        for (int i = 0; i < cities.size(); i++){
            System.out.print(cities.get(i)+ " ");

        }
        System.out.println();

        for (String each : cities) {
            System.out.print(each + " ");
        }
        System.out.println();
        // delete item from array list
        // 1 remove using index. it means delete value at index 3
        cities.remove(3);
        // 2 remove using object/value
        cities.remove("new York");

        System.out.println("after remove = " + cities);

        // delete remove all values from list
        cities.clear();
        // make sure its clear
        // print|spit it out
        System.out.println("cities = " + cities);
        if (cities.isEmpty()){
            System.out.println("cities list is empty");
        }
        // 3
        if (cities.size() == 0) {
            System.out.println("cities list is empty with size");
        }

    }
}
