public class FrogSimulationTester {
    /**********
     * Tester Class ********** This class is for testing only. You do not need to
     * update this file. Complete your work in the FrogSimulation.java file
     *********************************/
    public static void main(String[] args) {
        System.out.println("Testing Part A:");
        System.out.println("Running simulation:");
        FrogSimulation sim = new FrogSimulation(24, 5);
        System.out.println(sim.simulate());
        System.out.println("---------------------");
        System.out.println("Testing Part B:");
        System.out.println("Running simulations:");
        System.out.println(sim.runSimulations(400));
    }
}
