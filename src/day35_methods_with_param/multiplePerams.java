package day35_methods_with_param;

import java.util.*;
/*
Method name: showSum
params/inputs: double num1, double num2
it adds numbers and print result
 */
public class multiplePerams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 doubles:");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();

        showSums(d1,d2);



        showSums(100,555);


    }

    public static void showSums (double num1, double num2) {

        double sum1 = num1 + num2;

        System.out.print(" add " + num1 + " + " + num2 + " = " + sum1);

    }
}
