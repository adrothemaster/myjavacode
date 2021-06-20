package day37_methods_overloading;

import java.util.Scanner;

public class DaySelector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println(getDayName(num));
    }

    public static String getDayName(int num){
        switch (num){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Firday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                System.out.println("Not a day of the week try again");
                return null;
        }
    }

}

