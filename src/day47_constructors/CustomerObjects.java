package day47_constructors;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1);
        cs1.setId(1);
        cs1.setName("BOB");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2);
        Customer cs3 = new Customer("John",3);
        System.out.println(cs2);
        System.out.println(cs3);

        // Array of customers objects
        Customer[] todaysCustomers = {cs1,cs2,cs3, new Customer("Adrien", 1999)};

        //ArrayList of customer Objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Murodil", 110));
        customerList.add(new Customer("Nadir", 111));

        System.out.println(todaysCustomers[0].toString());




    }
}
