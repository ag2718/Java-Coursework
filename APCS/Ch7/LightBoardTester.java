public class LightBoardTester {
    public static void main(String[] args) {
        LightBoard board = new LightBoard(5, 5);
        for (boolean[] row : board.getLights()) {
            for (boolean element : row) {
                System.out.print(element + ", ");
            }
            System.out.println();
        }
        System.out.println("Evaluate light at (3, 2): " + board.evaluateLight(3, 2));
    }
}
