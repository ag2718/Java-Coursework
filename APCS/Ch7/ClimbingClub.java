import java.util.List;
import java.util.ArrayList;

public class ClimbingClub {
    /**
     * The list of climbs completed by members of the club. * Guaranteed not to be
     * null. Contains only non-null references.
     */
    private List<ClimbInfo> climbList;

    /** Creates a new ClimbingClub object. */
    public ClimbingClub() {
        climbList = new ArrayList<ClimbInfo>();
    }

    /**
     * Adds a new climb with name peakName and time climbTime to the end of the list
     * of climbs
     *
     * @param peakName  the name of the mountain peak climbed
     * @param climbTime the number of minutes taken to complete the climb
     */
    public void addClimb(String peakName, int climbTime) {
        climbList.add(new ClimbInfo(peakName, climbTime));
    }

    public void addClimb2(String peakName, int climbTime) {
        int ind = 0;
        for (; ind < climbList.size() && climbList.get(ind).getName().compareTo(peakName) <= 0; ind++)
            ;
        climbList.add(ind, new ClimbInfo(peakName, climbTime));
    }

    public String toString() {
        String output = "";
        for (ClimbInfo info : climbList) {
            output = output + info.toString() + "\n";
        }
        return output;
    }

    public static void main(String[] args) {
        // test a
        ClimbingClub hikerClub = new ClimbingClub();
        hikerClub.addClimb("Monadnock", 274);
        hikerClub.addClimb("Whiteface", 301);
        hikerClub.addClimb("Algonquin", 225);
        hikerClub.addClimb("Monadnock", 344);
        System.out.print(hikerClub);
        System.out.println("The order printed above should be Monadnock, Whiteface, Algonquin, Monadnock");
    }

}
