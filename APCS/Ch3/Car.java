public class Car {

    private double fuelLevel;
    private double mpg;

    public Car(double mpg) {
        this.mpg = mpg;
        this.fuelLevel = 0;
    }

    public void drive(double mi) {
        this.fuelLevel -= mi / mpg;
    }

    public void addGas(double amt) {
        this.fuelLevel += amt;
    }

    public double getGasInTank() {
        return this.fuelLevel;
    }

}
