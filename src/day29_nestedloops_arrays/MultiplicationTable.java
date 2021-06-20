package day29_nestedloops_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int out = 1; out <= 10; out++){
            for (int in = 1; in <= 10; in++){
                System.out.print(out * in + "\t" +
                        "");
            }
            System.out.println();
        }
    }
}
