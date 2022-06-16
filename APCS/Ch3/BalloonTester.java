public class BalloonTester {
    public static void main(String[] args) {
        Balloon balloon = new Balloon();
        balloon.inflate(5.5);
        System.out.println("Volume: " + balloon.getVolume() + " (Expected: 696.91...)");
    }
}
