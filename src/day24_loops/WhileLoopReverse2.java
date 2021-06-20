package day24_loops;

public class WhileLoopReverse2 {
    public static void main(String[] args) throws InterruptedException {
        int unreadSMS = 10;
        System.out.println("i have total  " + unreadSMS + " left to read.");

        while (unreadSMS > 0) {
            System.out.println("Reading SMS : " + unreadSMS);
            unreadSMS--;
            Thread.sleep(1000);
        }
    }
}
