package day20_String_Manipulation;

public class stringContains {
    public static void main(String[] args) {
        String company = "amazon";
        String firstName = "";
        firstName = "nadir";

        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i is present");
        }else {
            System.out.println("nor a or i is present");
        }

        String email = "";
        email = "adrothemaster@gmail.com";
        if (email.contains("@") || email.endsWith(".com")) {
            System.out.println("email contains @ and ends with .com");
        }else {
            System.out.println("invalid email");
        }
    }
}
