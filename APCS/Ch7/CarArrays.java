import java.lang.Math;

public class CarArrays {

    public static void main(String[] args) {

        String[] colors = { "red", "green", "blue", "yellow", "black", "brown", "silver", "grey", "white", "orange" };
        Car[] cars = new Car[10];
        for (int i = 0; i < 10; i++) {
            cars[i] = new Car(colors[i], (int) (100000 + Math.random() * 899999), Math.random() * 200000);
            System.out.println("Car #" + (i + 1) + " (" + cars[i].getColor() + ", " + cars[i].getModelNumber() + "): "
                    + cars[i].getMileage() + " mi");
        }

        Car highestMileageCar = highestMileage(cars);
        System.out.println(
                "Highest mileage car: " + highestMileageCar.getColor() + ", " + highestMileageCar.getModelNumber());

    }

    public static Car highestMileage(Car[] cars) {

        Car highestCar = cars[0];
        for (Car car : cars) {
            if (car.getMileage() > highestCar.getMileage()) {
                highestCar = car;
            }
        }

        return highestCar;

    }
}

class Car {

    private String color;
    private int modelNumber;
    private double mileage;

    public Car(String color, int modelNumber, double mileage) {
        this.color = color;
        this.modelNumber = modelNumber;
        this.mileage = mileage;
    }

    public String getColor() {
        return this.color;
    }

    public int getModelNumber() {
        return this.modelNumber;
    }

    public double getMileage() {
        return this.mileage;
    };

}
