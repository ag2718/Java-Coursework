public class Flight {

    private int numPassengers;
    private double price;
    private int capacity;

    public Flight(int numPassengers, double price, int capacity) {
        this.numPassengers = numPassengers;
        this.price = price;
        this.capacity = capacity;
    }

    /** Returns the number of passengers on the flight */
    public int getNumPassengers() {
        return numPassengers;
    }

    /**
     * Returns the price of a seat on the flight. All seats on a flight have the
     * same price. Postcondition: The value returned is greater than or equal to
     * 0.0.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns the capacity of the flight (the maximum number of passengers the
     * flight can carry)
     */
    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return "(" + numPassengers + ", " + price + ", " + capacity + ")";
    }

}
