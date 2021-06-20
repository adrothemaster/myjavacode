package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("even numbers");
        for (int n = 1; n<= 100; n++){
           if (n % 2 == 0){
               System.out.print(n + " ");
           }
        }
        System.out.println();
        System.out.println("odd numbers");
        for (int n = 0; n<= 100; n++){
            if (n % 2 != 0){
                System.out.print(n + " ");
            }
        }
    }
}
