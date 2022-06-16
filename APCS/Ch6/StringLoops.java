import java.util.Scanner;

public class StringLoops {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter in a string: ");

        String str = in.next();
        int len = str.length();

        // a
        System.out.print("Uppercase letters: ");
        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println("");

        // b
        System.out.print("Every second character of the string: ");
        for (int i = 0; i < len; i += 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");

        // c, d, e
        System.out.print("All vowels replaced by underscores: ");

        int numVowels = 0;
        String vowelPositions = "";

        for (int i = 0; i < len; i++) {
            char lowerc = Character.toLowerCase(str.charAt(i));
            if (lowerc == 'a' || lowerc == 'e' || lowerc == 'i' || lowerc == 'o' || lowerc == 'u') {
                System.out.print("_");
                numVowels++;
                vowelPositions += i + ", ";
            } else {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println("");
        System.out.println("Number of vowels: " + numVowels);
        System.out.println("Vowel positions: " + vowelPositions.substring(0, vowelPositions.length() - 2)
                + " (first letter of string is at position zero)");

        in.close();

    }
}
