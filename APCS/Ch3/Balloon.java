public class Balloon {
    private double radius;

    public Balloon() {
    };

    public void inflate(double amount) {
        this.radius += amount;
    }

    public double getVolume() {
        return 4 * Math.PI * radius * radius * radius / 3;
    }
}
