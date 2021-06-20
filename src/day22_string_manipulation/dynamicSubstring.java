package day22_string_manipulation;

public class dynamicSubstring {
    public static void main(String[] args) {

        String result = "result count:12345";
        System.out.println(result.substring(13));

        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));

        System.out.println(result.substring(result.indexOf(":") + 1));

        String today = "i learned [java] today";

        int indexOf = today.indexOf("[");
        int indexOf2 = today.indexOf("]");

        System.out.println(today.substring(indexOf+1, indexOf2));



    }
}
