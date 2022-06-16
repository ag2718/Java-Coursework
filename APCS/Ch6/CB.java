import java.util.Scanner;

public class CB {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(analyzeInts(10, 8));

    }

    public static int getInt() {
        return in.nextInt();
    }

    public static double analyzeInts(int max, int n) {
        double numValid = 0;
        for (int i = 0; i < n; i++) {
            int val = getInt();
            if (val < max && val > 0 && val % 3 == 0)
                numValid++;
        }
        return numValid / n;
    }

}
