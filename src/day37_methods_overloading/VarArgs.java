package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {

        addNumbers(20,10);
        addNumbers(10,10,20,50,10,100,250,350,25,20,30,25,100);
        addNumbers();
    }
    public static void addNumbers(int...nums){
        int sum = 0;
        for (int n : nums){
            sum += n;
        }
        System.out.println("sum = " + sum);

    }
}
