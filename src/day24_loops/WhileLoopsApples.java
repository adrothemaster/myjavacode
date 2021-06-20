package day24_loops;


/*
main method

int apples = 1;
until 10

while apples is less than or equal 10
    print eating an apple 1
    increase apple by 1

No more apples 😦
 */
public class WhileLoopsApples {
    public static void main(String[] args) {

        int apples = 1;
        while (apples <= 10){
            System.out.println("apples = " + apples);
            apples++;

        }
        while (apples >= -100){
            System.out.println("apples = " + apples);
            apples--;
        }
        System.out.println("** no more apples **");

    }
}