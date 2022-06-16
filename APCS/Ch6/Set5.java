import java.util.Scanner;

public class Set5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // E6.11

        System.out.print("Enter a string: ");
        String str = in.next();

        for (int l = 1; l <= str.length(); l++) {
            for (int start = 0; start <= str.length() - l; start++) {
                System.out.println(str.substring(start, start + l));
            }
        }

        // E6.13

        System.out.print("\nEnter an integer: ");
        int num = in.nextInt();

        do {
            System.out.println(num % 2);
            num /= 2;
        } while (num >= 1);

        // E6.22

        System.out.print("\nHow many Japanese yen is one dollar worth? ");
        double dollarToYen = in.nextDouble();

        String outputStr = "";

        System.out.println("Enter a sequence of dollar amounts to be converted to yen:");
        while (in.hasNextDouble()) {
            double dollarAmt = in.nextDouble();
            if (dollarAmt == 0)
                break;
            outputStr += dollarAmt * dollarToYen + " ";
        }

        System.out.println("Yen amounts: " + outputStr);
        outputStr = "";

        System.out.println("Enter a sequence of yen amounts to be converted to dollars:");
        while (in.hasNextDouble()) {
            double yenAmt = in.nextDouble();
            if (yenAmt == 0)
                break;
            outputStr += yenAmt / dollarToYen + " ";
        }

        System.out.println("Dollar amounts: " + outputStr);

    }

}
