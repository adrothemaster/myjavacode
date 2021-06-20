package day36_methods_with_return;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(100,200));        //basic
        System.out.println(minus(10.8,4.4));     //basic
        System.out.println(multiply(25.5,10));   //basic
        System.out.println(divide(100.5,5));     //basic

        System.out.println("100.0 + 200.0 = " + add(100,200));   //more advanced
        System.out.println("10.8 - 4.4 = " + minus(10.8,4.4));   //more advanced
        System.out.println("25.5 * 10 = " + multiply(25.5,10));  //more advanced
        System.out.println("100.5 / 5 = " + divide(100.5,5));    //more advanced

        System.out.println(getRandomNumber1());
        System.out.println(getRandomNumber2());
        System.out.println(getRandomNumber1() * getRandomNumber2()); // more more advanced
        if (getRandomNumber1() > getRandomNumber2()){
            System.out.println(getRandomNumber1());
        }else{
            System.out.println(getRandomNumber2());
        }

    }

    public static double add (double num1, double num2){
        double sum = num1+num2;
        return sum;
    }

    public static double minus (double num1, double num2) {
        double sum = num1-num2;
        return sum;
    }

    public static double multiply (double num1, double num2){
        double sum = num1*num2;
        return sum;
    }

    public static double divide (double num1, double num2){
        double sum = num1/num2;
        return sum;
    }

    public static int getRandomNumber1() {
        Random random = new Random();
        int randomNumber1 = random.nextInt(20);
        return randomNumber1;
    }

    public static int getRandomNumber2() {
        Random random = new Random();
        int randomNumber2 = random.nextInt(20);
        return randomNumber2;
    }

}
