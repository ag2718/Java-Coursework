import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class DigitsRunner {
    public static void main(String[] args) {
        Digits d1 = new Digits(234980324);
        System.out.println(d1);

        Digits d2 = new Digits(0);
        System.out.println(d2);

        Digits d3 = new Digits(10001);
        System.out.println(d3);

        int[] cases = { 10, 20, 20302, 12345, 54321, 33339, 0, 11111, 10101010 };

        for (int x : cases)
            System.out.println(new Digits(x).isStrictlyIncreasing());
    }
}

/*
 * OUTPUT
 * 
 * [2, 3, 4, 9, 8, 0, 3, 2, 4] [0] [1, 0, 0, 0, 1]
 * 
 * 
 * false false false true false false true false false
 * 
 * 
 */
