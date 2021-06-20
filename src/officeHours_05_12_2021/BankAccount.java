package officeHours_05_12_2021;

public class BankAccount {

        String accountHolderName;
        double balance;
        long accountNumber;
        int pin;

        public double getBalance(int inputPin) {
            if(pin == inputPin) {
                return balance;
            }
            return -1;



    }
}
