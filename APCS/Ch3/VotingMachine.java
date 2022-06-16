/**
 * A class that implements the function of a voting machine (e.g. voting,
 * tallying)
 */
public class VotingMachine {
    private int demVotes;
    private int repVotes;

    /**
     * Empty constructor for the VotingMachine class.
     */
    public VotingMachine() {
    }

    /**
     * Set the number of votes fo both parties to zero.
     */
    public void clear() {
        this.demVotes = 0;
        this.repVotes = 0;
    }

    /**
     * Add one to the total vote count for the Democratic party.
     */
    public void voteDem() {
        this.demVotes++;
    }

    /**
     * Add one to the total vote count for the Republican party.
     */
    public void voteRep() {
        this.repVotes++;
    }

    /**
     * Method that outputs number of votes for the Democratic party.
     * 
     * @return Number of votes for the Democratic party.
     */
    public int getDemVotes() {
        return this.demVotes;
    }

    /**
     * Method that outputs number of votes for the Republican party.
     * 
     * @return Number of votes for the Republican party.
     */
    public int getRepVotes() {
        return this.repVotes;
    }
}
