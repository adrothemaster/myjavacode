package day37_methods_overloading;

public class MethodOverLoading {

    public static void main(String[] args) {
        MethodOverLoading.sum(10,5);
        sum(10.4,12.4);
        sum(5,8.1);
        sum("for ","Java");
        sum(5 ,1000 ,56);
        sum(5.1 ,1000);
        sum(5 ,(int)1000.1);

    }

    public static void sum(int num1, int num2){
        System.out.println("sum(int, int)");
        System.out.println("result = " + (num1 + num2));
    }

    public static void sum(int num1,int  num2,int  num3){
        System.out.println("sum(int , int , int )");
        System.out.println("result = " + (num1 + num2 + num3));
    }

    public static void sum(double num1,double  num2) {
        System.out.println("sum(double, double)");
        System.out.println("result = " + (num1 + num2));
    }

    public static void sum(String str1,String  str2) {
        System.out.println("sum(String ,String)");
        System.out.println("result = " + (str1 + str2));
    }
}
