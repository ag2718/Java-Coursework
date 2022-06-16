import java.util.Scanner;

public class StringLoops2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input a string: ");
        String str = in.next();

        System.out.println("");

        // E6.8
        System.out.println("Characters in string:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println("");

        // E6.9

        System.out.println("Reversed string:");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println("\n");

        // E6.10
        int numVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char lowercaseChar = str.charAt(i);
            if (lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'o' || lowercaseChar == 'i'
                    || lowercaseChar == 'u' || lowercaseChar == 'y') {
                numVowels++;
            }
        }
        System.out.println("Number of vowels: " + numVowels);

        in.close();
    }
}
