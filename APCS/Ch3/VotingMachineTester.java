public class VotingMachineTester {
    public static void main(String[] args) {

        VotingMachine machine = new VotingMachine();

        machine.voteDem();
        machine.voteDem();
        machine.voteDem();

        machine.voteRep();
        machine.voteRep();

        System.out.println("Dem Votes: " + machine.getDemVotes() + " (Expected: 3)");
        System.out.println("Rep Votes: " + machine.getRepVotes() + " (Expected: 2)");

        machine.clear();
        System.out.println("Both values should be zero after the machine is cleared: ");
        System.out.println(machine.getRepVotes() + ", " + machine.getDemVotes());
    }
}
