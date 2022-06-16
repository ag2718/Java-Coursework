package Inheritance;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private double interestRate;
    private String customerName;                 //Initialize all variables
    private String email;
    private String phoneNumber;


    public BankAccount() {
        this(0, 0, 0, "Unknown", "Unknown", "Unknown");
    }

    public BankAccount(int accountNumber, double balance, double interestRate, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;                                //Constructor
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid account number");
        }
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;                                         //Methods for setting values
        } else {
            System.out.println("Invalid balance");
        }
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String number) {
            this.phoneNumber = number;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }



    public int getAccountNumber() {
        System.out.println("Account number is " + this.accountNumber);
        return this.accountNumber;
    }

    public double getBalance() {
        System.out.println("Balance is $" + this.balance);
        return this.balance;
    }

    public String getCustomerName() {
        System.out.println("Customer name is" + this.customerName);
        return this.customerName;
    }

    public String getEmail() {
        System.out.println("Customer email is" + this.email);
        return this.email;
    }

    public String getPhoneNumber() {
        System.out.println("Phone number is " + this.phoneNumber);
        return this.phoneNumber;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void deposit (double deposit) {
        this.balance += deposit;
        System.out.println("$" + deposit + " has been added to your bank account balance");
        System.out.println("You now have a total balance of $" + balance);
    }

    public void withdrawal (double withdrawal) {

        if (this.balance >= withdrawal) {
            balance -= withdrawal;
            System.out.println("You have taken out $" + withdrawal + " from your account.");
            System.out.println("You now have a total balance of $" + balance);
        } else {
            System.out.println("Insufficient funds to complete transaction");
        }

    }


}
