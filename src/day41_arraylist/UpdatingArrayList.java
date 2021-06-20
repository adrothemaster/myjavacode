package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("ford");
        myCars.add("mercedes");
        myCars.add("tesla");
        myCars.add("jeep");
        myCars.add(0,"audi");
        myCars.add(2,"hummer");
        myCars.add(4,"nissan");
        myCars.add("ford");

        System.out.println(myCars.toString());
        String allCarsIn1St = myCars.toString(); // saves all cars to String variable

        System.out.println("myCars = " + myCars);

        myCars.set(0, "lamborghini");
        System.out.println("all Cars on list= " + myCars);
        myCars.set(3, "honda");
        System.out.println("all Cars on list = " + myCars);

        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int teslaIndex = myCars.indexOf("tesla");
        System.out.println("teslaIndex = " + teslaIndex);
        // change tesla to tesla Roadster

        myCars.set(teslaIndex, "tesla roadster");
        System.out.println("my cars = " + myCars);






    }
}
