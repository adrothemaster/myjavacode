package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {

        creditNumber(750);
        creditNumber(689);
        creditNumber(823);
        creditNumber(415);
        System.out.println("credit score = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);

    }

    public static void creditNumber (int creditScore) {
        if (creditScore >= 700) {
            System.out.println("congrats for being approved");
        } else {
            System.out.println("sorry your not approved :( do more java practice ");
        }
    }
        public static int getCreditScore (){
            return 800;

    }
}
