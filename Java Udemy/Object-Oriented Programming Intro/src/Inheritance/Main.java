package Inheritance;

public class Main {

    public static void main(String[] args) {

        BankAccount first = new BankAccount(123456, 5804.1, 0.01, "Aarush", "aarush.g75@gmail.com", "(000)000-000");

        BankAccount Default = new BankAccount();
        Default.getBalance();

        first.withdrawal(3000);
        first.deposit(30000);

        first.getAccountNumber();

        Savings savings = new Savings(000000, 2000, 1000, "Bob",
                "bob@gmail.com", "(609)530-5304", 500);

        savings.withdrawal(600);
        savings.withdrawal(100);

        savings.newMonth(3000);

        savings.withdrawal(1000);


    }

}
