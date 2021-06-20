package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        while (count > 0){
            System.out.println("countdown :" + count);
            count--;
            Thread.sleep(1000);
        }
        System.out.println("Blast off");

        int unreadSMS = 10;

        while (unreadSMS <= 0) {
            System.out.println("i've read this message already: " + unreadSMS);
            unreadSMS--;
            Thread.sleep(1000 *10);
        }
    }
}
