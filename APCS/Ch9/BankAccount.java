import java.lang.Math;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount {
    private double balance;

    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount() {
        balance = 0;
    }

    /**
     * Constructs a bank account with a given balance.
     * 
     * @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    /**
     * Deposits money into the bank account.
     * 
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance = balance + amount;
    }

    /**
     * Withdraws money from the bank account.
     * 
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    /**
     * Gets the current balance of the bank account.
     * 
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }
}

class BasicAccount1 extends BankAccount {
    public void withdraw(double amount) {
        super.withdraw(Math.min(amount, getBalance()));
    }
}

class BasicAccount2 extends BankAccount {
    public void withdraw(double amount) {
        if (amount > getBalance())
            super.withdraw(amount + 30);
        else
            super.withdraw(amount);
    }
}

/**
 * A checking account has a limited number of free deposits and withdrawals.
 */
class CheckingAccount extends BankAccount {

    private int withdrawals;
    private int overdrafts;

    /**
     * Constructs a checking account with a zero balance.
     */
    public CheckingAccount() {
        withdrawals = 0;
        overdrafts = 0;
    }

    public void withdraw(double amount) {

        if (amount > getBalance()) {
            overdrafts++;
            super.withdraw((overdrafts == 1) ? 20 : 30);
        }

        withdrawals++;
        super.withdraw(amount + computeFee());
    }

    public int computeFee() {

        final int FREE_WITHDRAWALS = 3;
        final int WITHDRAWAL_FEE = 1;

        return (withdrawals <= FREE_WITHDRAWALS) ? 0 : WITHDRAWAL_FEE;
    }

    public void monthEnd() {
        withdrawals = 0;
    }
}
