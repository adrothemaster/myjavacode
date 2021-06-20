package day23_String_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den sp oon";

        System.out.println(word.toUpperCase().toUpperCase().length());
        System.out.println(word.replace(" ", "").toUpperCase());

        String city = "aDrien";
        System.out.println(city.substring(0, 1).toUpperCase() + city.substring(1));
        String capitalized = city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

        // int i = 1;
        // while (i <= 5) { // this is a loop if run its an infinite loop!!!!
        // System.out.println("I");
       //  }

    }
}
