package day24_loops;

public class YouTubeVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("watching: smallest cat");
        int seconds = 0;
        while (seconds <= 117) {
            System.out.println("on second = " + seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println();
        System.out.println("watch more cat videos :)");

    }
}

