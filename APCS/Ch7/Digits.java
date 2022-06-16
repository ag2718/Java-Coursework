import java.util.ArrayList;

public class Digits {
    /**
     * The list of digits from the number used to construct this object. The digits
     * appear in the list in the same order in which they appear in the original
     * number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num. Precondition: num >= 0
     */
    public Digits(int num) {

        digitList = new ArrayList<Integer>();

        digitList.add(num % 10);

        int place = 10;
        while (num / place > 0) {
            digitList.add(0, (num / place) % 10);
            place *= 10;
        }
    }

    /**
     * Returns true if the digits in this Digits object are in strictly increasing
     * order; false otherwise.
     */
    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digitList.size() - 1; i++) {
            if (digitList.get(i + 1) <= digitList.get(i))
                return false;
        }
        return true;
    }

    public String toString() {
        String output = "";
        for (int element : digitList) {
            output += element + " ";
        }
        return output;
    }
}
