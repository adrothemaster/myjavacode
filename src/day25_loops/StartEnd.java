package day25_loops;

import java.util.Scanner;
/*
Enter start and end
int start
int end

print all numbers from start till end separated by space

start = 3
end = 6

3 4 5 6

start = 30
end = 6
when start is more than end,
    "reverse numbering is not supported"
 */
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  start to end");
        int start = scan.nextInt();
        int end = scan.nextInt();


        for (int i = start; i <= end; i++){
            System.out.print(i + " ");
        }
    }
}
