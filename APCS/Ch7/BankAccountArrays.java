public class BankAccountArrays {

    public static String findHighest(BankAccount[] accounts) {

        int highestIndex = 0;
        for (int i = 1; i < accounts.length; i++) {
            if (accounts[i].getBalance() > accounts[highestIndex].getBalance()) {
                highestIndex = i;
            }
        }
        return accounts[highestIndex].getName();

    }

    public static void main(String[] args) {

        String[] names = { "Alice", "Bob", "Charlie", "Tom", "Joe", "Mark", "Stephanie", "Andrew", "Harry", "Larry" };

        BankAccount[] bankAccounts = new BankAccount[names.length];

        for (int i = 0; i < bankAccounts.length; i++) {
            bankAccounts[i] = new BankAccount(names[i]);
            bankAccounts[i].deposit((int) (10000 * Math.random()));
            System.out.println(names[i] + "'s balance is " + bankAccounts[i].getBalance());
        }

        System.out.println("\n" + findHighest(bankAccounts) + " has the highest balance in his/her bank account");

    }

}
