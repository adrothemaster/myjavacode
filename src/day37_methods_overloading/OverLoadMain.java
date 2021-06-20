package day37_methods_overloading;

public class OverLoadMain {
    public static void main(String[] args) {
        System.out.println("hello how are you");
        main("str1");
        main("str1","str2");
        OverLoadMain.main("str1","str2","str3");
    }

    public static void main(String str1) {
        System.out.println("looks like it works");
    }
    public static void main(String str1,String str2) {
        System.out.println("really well when you");
    }
    public static void main(String str1,String str2,String str3) {
        System.out.println("add more variables in you method");
    }
}
