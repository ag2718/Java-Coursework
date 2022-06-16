public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount tom = new BankAccount(1000);
        BankAccount bob = new BankAccount(500);
        tom.transfer(300, bob);
        System.out.println("Bob's Balance: " + bob.getBalance());
        System.out.println("Tom's Balance: " + tom.getBalance());
    }
}
