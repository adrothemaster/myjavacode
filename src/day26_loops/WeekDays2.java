package day26_loops;

public class WeekDays2 {
    public static void main(String[] args) {

        for (int day = 1; day <= 8; day++){
            switch (day) {
                case 1:
                    System.out.println(day + " monday");
                    break;
                case 2:
                    System.out.println(day + " tuesday");
                    break;
                case 3:
                    System.out.println(day + " wednesday");
                    break;
                case 4:
                    System.out.println(day + " thursday");
                    break;
                case 5:
                    System.out.println(day + " friday");
                    break;
                case 6:
                    System.out.println(day + " saturday");
                    break;
                case 7:
                    System.out.println(day + " sunday");
                    break;
                default:
                    System.out.println("no such day");
                    break;
            }
        }
        System.out.println("what ever day it is, Hope you have a Java day!! :) ");

    }
}
