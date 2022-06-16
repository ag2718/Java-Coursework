public class ItemGrid {

    private Item[][] grid;

    public ItemGrid(String[][] namesGrid, int[][] valsGrid) {
        grid = new Item[namesGrid.length][namesGrid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = new Item(namesGrid[i][j], valsGrid[i][j]);
            }
        }
    }

    /**
     * Returns true if xPos is a valid row index and yPos is a valid column index
     * and returns false otherwise.
     */
    public boolean isValid(int xPos, int yPos) {
        return (xPos >= 0 && xPos < grid[0].length && yPos >= 0 && yPos < grid.length);
    }

    /**
     * Compares the item in row r and column c to the items to its left and to its
     * right. Returns the name of the item with the greatest value, as described in
     * part (a). Precondition: r and c are valid indices
     */
    public String mostValuableNeighbor(int r, int c) {
        if (isValid(c - 1, r) && isValid(c + 1, r)) {
            if (grid[r][c].getValue() >= grid[r][c + 1].getValue()
                    && grid[r][c].getValue() >= grid[r][c - 1].getValue()) {
                return grid[r][c].getName();
            } else {
                return (grid[r][c + 1].getValue() >= grid[r][c - 1].getValue()) ? grid[r][c + 1].getName()
                        : grid[r][c - 1].getName();
            }
        }
        if (isValid(c - 1, r)) {
            return (grid[r][c].getValue() >= grid[r][c - 1].getValue()) ? grid[r][c].getName()
                    : grid[r][c - 1].getName();
        }
        return (grid[r][c].getValue() >= grid[r][c + 1].getValue()) ? grid[r][c].getName() : grid[r][c + 1].getName();
    }

    /**
     * Returns the average value of all the items in grid, as described in part (b).
     */
    public double findAverage() {

        double sum = 0;
        for (Item[] row : grid) {
            for (Item item : row) {
                sum += item.getValue();
            }
        }

        return sum / (grid.length * grid[0].length);

    }
}
