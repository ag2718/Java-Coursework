import java.lang.Math;

public class LightBoard {
    /**
     * The lights on the board, where true represents on and false represents off.
     */
    private boolean[][] lights;

    /**
     * Constructs a LightBoard object having numRows rows and numCols columns.
     * Precondition: numRows > 0, numCols > 0 Postcondition: each light has a 40%
     * probability of being set to on.
     */
    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                this.lights[i][j] = (Math.random() < 0.4);
            }
        }
    }

    /**
     * Evaluates a light in row index row and column index col and returns a status
     * as described in part (b). Precondition: row and col are valid indexes in
     * lights.
     */
    public boolean evaluateLight(int row, int col) {
        int numOn = 0;
        for (int i = 0; i < lights.length; i++) {
            if (lights[col][i])
                numOn++;
        }
        if (lights[row][col] && numOn % 2 == 0)
            return false;
        if (!lights[row][col] && numOn % 3 == 0)
            return true;
        return lights[row][col];
    }

    /**
     * Returns the 2D lights array (for testing purposes)
     */
    public boolean[][] getLights() {
        return this.lights;
    }
}
