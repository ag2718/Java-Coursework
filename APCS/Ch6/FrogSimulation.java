public class FrogSimulation {
    /** Distance, in inches, from the starting position to the goal. */
    private int goalDistance;
    /** Maximum number of hops allowed to reach the goal. */
    private int maxHops;

    /**
     * Constructs a FrogSimulation where dist is the distance, in inches, from the
     * starting position to the goal, and numHops is the maximum number of hops
     * allowed to reach the goal. Precondition: dist > 0; numHops > 0
     */
    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    /**
     * Returns an integer representing the distance, in inches, to be moved when the
     * frog hops. Implemented here for testing purposes
     */
    private int hopDistance() {
        // Max value of 30, minimum value of - 10;
        int rand = (int) (Math.random() * 40) - 10;
        return rand;
    }

    /**
     * Simulates a frog attempting to reach the goal as described in part (a).
     * Returns true if the frog successfully reached or passed the goal during the
     * simulation; * false otherwise.
     */
    public boolean simulate() {
        // Implement Part a here
        int pos = 0;
        int numHops = 0;
        while (pos < goalDistance) {
            if (numHops >= maxHops || pos < 0)
                return false;
            pos += hopDistance();
            numHops++;
        }
        return true;
    }

    /**
     * Runs num simulations and returns the proportion of simulations in which the
     * frog successfully reached or passed the goal. Precondition: num > 0
     */
    public double runSimulations(int num) {
        // Implement Part b here
        double successful = 0;
        for (int i = 0; i < num; i++) {
            if (simulate())
                successful++;
        }
        return successful / num;
    }
}
