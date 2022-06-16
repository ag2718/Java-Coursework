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

    /**
     * 
     * Adds interest to the balance of the bank account.
     *
     * @param rate The rate at which interest is to be added.
     */
    public void addInterest(double rate) {
        this.balance *= (1 + rate / 100);
    }

    /**
     * Transfers money from the bank account to another one
     * 
     * @param amount  the amount of money to be transferred
     * @param account the account to which the money should be transferred
     */
    public void transfer(double amount, BankAccount account) {
        if (amount <= this.getBalance()) {
            this.withdraw(amount);
            account.deposit(amount);
        }
    }
}
