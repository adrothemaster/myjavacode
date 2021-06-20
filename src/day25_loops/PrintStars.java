package day25_loops;

public class PrintStars {
    public static void main(String[] args) {

        for (int star = 1; star <= 15; star++) {
            System.out.print("* ");
        }
        System.out.println();// start new line
        String myStars = "";
        for (int i = 1; i <= 10; i++){
            myStars += " *";

        }


        System.out.println("my stars = " + myStars);
    }
}
