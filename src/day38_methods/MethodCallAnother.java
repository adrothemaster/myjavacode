package day38_methods;

public class MethodCallAnother {
    public static void main(String[] args) {
        start();
    }
    public static void start() {
        System.out.println("Start");
        keepContinues();
    }
    public static void keepContinues(){
        System.out.println("continues");
        end();
    }
    public static void end(){
        System.out.println("end");
    }
}
