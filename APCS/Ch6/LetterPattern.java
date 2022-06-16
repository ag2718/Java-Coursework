public class LetterPattern {

    public static void main(String[] args) {

        System.out.println(letterAndPattern("Q", "QUICK"));
        System.out.println(letterAndPattern("C", "QUICK"));
        System.out.println(letterAndPattern("Z", "QUICK"));

        System.out.println(newLetter("G", "GXAD"));
        System.out.println(newLetter("D", "GXAD"));
        System.out.println(newLetter("M", "GXAD"));

    }

    public static String letterAndPattern(String letter, String pattern) {
        String reversedOutput = "";
        for (int i = pattern.length() - 1; i >= 0; i--) {
            if (letter.charAt(0) == pattern.charAt(i)) {
                return letter;
            }
            reversedOutput += pattern.charAt(i);
        }
        return reversedOutput;
    }

    public static String newLetter(String letter, String rule) {

        int ind = rule.indexOf(letter);
        if (ind == -1) {
            return letter;
        }
        if (ind == rule.length() - 1) {
            return rule.substring(0, 1);
        }
        return rule.substring(ind + 1, ind + 2);

    }

}
