package Composition;

public class Television {

    private String brand;
    private String model;
    private Dimensions dimensions;

    public Television(String brand, String model, Dimensions dimensions) {
        this.brand = brand;
        this.model = model;
        this.dimensions = dimensions;
    }

    protected void powerOn() {
        System.out.println("TV turned on");
    }
}
