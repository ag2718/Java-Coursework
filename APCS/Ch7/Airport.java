import java.util.ArrayList;
import java.lang.Math;

public class Airport {
    /**
     * A list of the flights into and out of this airport Guaranteed not to be null
     * and to contain only non-null entries
     */
    private ArrayList<Flight> allFlights;

    public Airport() {
        allFlights = new ArrayList<Flight>();
    }

    public void addFlight(Flight f) {
        allFlights.add(f);
    }

    public ArrayList<Flight> getFlights() {
        return allFlights;
    }

    /**
     * Returns the revenue generated by all flights at the airport, as described in
     * part (a)
     */
    public double getTotalRevenue() {
        double total = 0;
        for (Flight flight : allFlights) {
            total += flight.getPrice() * Math.min(flight.getNumPassengers(), flight.getCapacity());
        }
        return total;
    }

    /**
     * Updates the list of flights by removing certain flights and returns the total
     * number of passengers whose flights were removed, as described in part (b)
     */
    public int updateFlights() {
        int numRemoved = 0;
        for (int i = 0; i < allFlights.size(); i++) {
            if (allFlights.get(i).getCapacity() > 5 * allFlights.get(i).getNumPassengers()) {
                numRemoved += allFlights.get(i).getNumPassengers();
                allFlights.remove(i);
                i--;
            }
        }

        return numRemoved;
    }

    public static void main(String[] args) {

        Airport capitalHub = new Airport();
        capitalHub.addFlight(new Flight(25, 50, 30));
        capitalHub.addFlight(new Flight(10, 100.5, 60));
        capitalHub.addFlight(new Flight(50, 200, 40));
        capitalHub.addFlight(new Flight(20, 100, 120));

        System.out.println("Total Revenue: " + capitalHub.getTotalRevenue() + " (expected: 12255.0)");

        System.out.println("Passengers removed: " + capitalHub.updateFlights() + " (expected: 30)");

        System.out.println("Flights after removal: " + capitalHub.getFlights());

    }
}
