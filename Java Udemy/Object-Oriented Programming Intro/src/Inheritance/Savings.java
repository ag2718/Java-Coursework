package Inheritance;

public class Savings extends BankAccount {

    private double withdrawalLimit;

    public Savings(int accountNumber, double balance, double minBalance, String customerName, String email, String phoneNumber, double withdrawalLimit) {

        super(accountNumber, balance, 0.02, customerName, email, phoneNumber);
        this.withdrawalLimit = withdrawalLimit;
    }

    private int totalWithdrawals = 0;

    @Override
    public void withdrawal(double withdrawal) {

        if (totalWithdrawals <= withdrawalLimit) {
            super.withdrawal(withdrawal);
            totalWithdrawals += withdrawal;
        } else {
            System.out.println("You have reached the withdrawal limit");
        }
    }


    public void newMonth (int salary) {

        totalWithdrawals = 0;
        deposit(salary);
    }



}
