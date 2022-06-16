public class Asterisk {
    public static void main(String[] args) {

        // First pattern
        for (int i = 10; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println();

        // Second pattern
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Third pattern
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
