package day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++ ){
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
