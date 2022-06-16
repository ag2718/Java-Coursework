public class APLineTester {
    public static void main(String[] args) {

        APLine line1 = new APLine(5, 4, -17);
        System.out.println(line1.getSlope() + " (Expected: -1.25)");
        System.out.println(line1.isOnLine(5, -2) + " (Expected: true)");

        APLine line2 = new APLine(-25, 40, 30);
        System.out.println(line2.getSlope() + " (Expected: -0.625)");
        System.out.println(line2.isOnLine(5, -2) + " (Expected: false)");
    }
}
