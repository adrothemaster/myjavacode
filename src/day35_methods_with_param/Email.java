package day35_methods_with_param;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {
        buildEmail("Nadir","FannieMae");
        buildEmail("AdrienThibaud","Gmail");
    }
    public static void buildEmail(String name, String domain) {
        name = name.replace(" ","_").toLowerCase();
        String email = name + "@" + domain + ".com";
        System.out.println(email);
    }

}
