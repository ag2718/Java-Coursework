public class CashRegisterTester {
    public static void main(String[] args) {

        CashRegister register = new CashRegister(7);

        register.recordPurchase(10.0);
        register.recordTaxablePurchase(49.99);
        register.recordTaxablePurchase(29.99);
        register.recordPurchase(1.99);

        System.out.println("Item Count: " + register.getItemCount() + " (Expected: 4)");

        register.receivePayment(100.00);
        System.out.println("Change: " + register.giveChange() + " (Expected: 2.43)");
    }
}
