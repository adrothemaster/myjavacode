package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) {
        /**
         * below is infinite loop with loop like; while (true) {    }
        for(;;){
            System.out.println("java is fun!");
         */
//  1st initialization, 2nd boolean, 3rd increase...
        for (int i = 0; i <= 5; i++){
            System.out.println("hello world");
        }
        for (int i = 0; i <= 10; i++){
            System.out.println("number = " + i);
        }
        for (double a = 0.0; a < 37.5; a++){
            System.out.println("double number = " + a);
        }
        for (byte a = 0; a != 2000000; a++){
            System.out.println("byte number = " + a);
        }
    }
}
