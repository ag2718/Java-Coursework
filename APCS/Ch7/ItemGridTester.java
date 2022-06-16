public class ItemGridTester {
    public static void main(String[] args) {

        String[][] names = { { "acorn", "book", "carrot", "desk" }, { "egg", "flag", "globe", "harp" },
                { "island", "jacket", "kale", "lunch" } };

        int[][] vals = { { 7, 10, 8, 9 }, { 5, 8, 8, 9 }, { 7, 19, 8, 16 } };

        ItemGrid ig = new ItemGrid(names, vals);

        System.out.println(ig.mostValuableNeighbor(0, 2) + " (expected: book)");
        System.out.println(ig.mostValuableNeighbor(1, 1) + " (expected: flag or globe)");
        System.out.println(ig.mostValuableNeighbor(2, 0) + " (expected: jacket)");
        System.out.println(ig.mostValuableNeighbor(2, 3) + " (expected: lunch)");

        System.out.println("\nAverage is " + ig.findAverage() + " (expected: 9.5)");
    }
}
