import java.util.ArrayList;

/**
 * This bank contains a collection of bank accounts.
 */
public class Bank {
    private ArrayList<BankAccount> accounts;

    /**
     * Constructs a bank with no bank accounts.
     */
    public Bank() {
        accounts = new ArrayList<BankAccount>();
    }

    /**
     * Adds an account to this bank.
     * 
     * @param a the account to add
     */
    public void addAccount(BankAccount a) {
        accounts.add(a);
    }

    /**
     * Gets the sum of the balances of all accounts in this bank.
     * 
     * @return the sum of the balances
     */
    public double getTotalBalance() {
        double total = 0;
        for (BankAccount a : accounts) {
            total = total + a.getBalance();
        }
        return total;
    }

    /**
     * Counts the number of bank accounts whose balance is at least a given value.
     * 
     * @param atLeast the balance required to count an account
     * @return the number of accounts having least the given balance
     */
    public int countBalancesAtLeast(double atLeast) {
        int count = 0;
        for (BankAccount acct : accounts)
            if (acct.getBalance() >= atLeast)
                count++;
        return count;
    }

    /**
     * Finds a bank account with a given number.
     * 
     * @param accountNumber the number to find
     * @return the account with the given number, or null if there is no such
     *         account
     */
    public BankAccount find(int accountNumber) {
        for (BankAccount acct : accounts) {
            if (acct.getAccountNumber() == accountNumber)
                return acct;
        }
        return null;
    }

    /**
     * Gets the bank account with the largest balance.
     * 
     * @return the account with the largest balance, or null if the bank has no
     *         accounts
     */
    public BankAccount getMaximum() {
        if (accounts.size() == 0)
            return null;
        double maxBalance = -1;
        BankAccount maxBalanceAcct = null;
        for (BankAccount acct : accounts) {
            if (acct.getBalance() > maxBalance) {
                maxBalance = acct.getBalance();
                maxBalanceAcct = acct;
            }
        }
        return maxBalanceAcct;
    }

    /**
     * Gets the bank account with the least balance.
     * 
     * @return the account with the least balance, or null if the bank has no
     *         accounts
     */
    public BankAccount getMinimum() {
        if (accounts.size() == 0)
            return null;
        double minBalance = 1e10;
        BankAccount minBalanceAcct = null;
        for (BankAccount acct : accounts) {
            if (acct.getBalance() < minBalance) {
                minBalance = acct.getBalance();
                minBalanceAcct = acct;
            }
        }
        return minBalanceAcct;
    }

}
