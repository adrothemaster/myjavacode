package day38_methods;

public class RecursiveMethod {
    public static void main(String[] args) {
     printnums(1);
    }

    public static void printnums (int num) {
        System.out.print(num+ " ");
        num++;
        if (num <= 100) {
            printnums(num);
        }
    }
}
