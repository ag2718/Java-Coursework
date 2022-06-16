public class PaycheckTester {
    public static void main(String[] args) {

        /*
         * Inputs for testing (what expected values are based off of): Name - Bob,
         * Hourly Wage - 10.40, Hours Worked - 53
         */

        Paycheck paycheck = new Paycheck();

        System.out.println("");

        System.out.println("Name: " + paycheck.getName() + " (Expected: Bob)");
        System.out.println("Hourly Wage: " + paycheck.getWage() + " (Expected: 10.40)");
        System.out.println("Hours Worked: " + paycheck.getNumHours() + " (Expected: 53)");

        System.out.println("");

        System.out.println("Total Pay: " + paycheck.computePay() + " (Expected: 618.8)");

    }
}
