package officeHours_05_12_2021;

public class TheBank {
    public static void main(String[] args) {

        BankAccount bankAccountOne = new BankAccount();
        bankAccountOne.accountHolderName = "Adrien Thibaud";
        bankAccountOne.pin = 1234;
        bankAccountOne.balance = 1_000_000;
        bankAccountOne.accountNumber = 123456789987466321L;

        System.out.println(bankAccountOne.pin);
        System.out.println(bankAccountOne.getBalance(1234));
        System.out.println();

        System.out.println(new BankAccount().accountHolderName);

        bankAccountOne = new BankAccount();
        System.out.println(bankAccountOne.accountHolderName);


    }
}
