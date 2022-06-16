public class MethodOverloading {

    public static void main(String[] args) {

        int newScore = calculateScore("Aarush", 10000);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        calcFeetAndInchesToCentimeters(5, 2.5);

    }

    public static int calculateScore(String name, int score) {
        System.out.println("Player " + name + " scored " + score + " points.");
        return score;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score;
    }

    public static int calculateScore() {
        System.out.println("No name, no score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {

        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid parameters");
            return -1;
        }

        double centimeters = 30.48 * feet + 2.54 * inches;
        System.out.println(centimeters);
        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            System.out.println("Invalid parameters");
            return -1;
        }

        double feet = inches/12;
        inches = inches % feet;

        double centimeters = calcFeetAndInchesToCentimeters(feet, inches);
        System.out.println(centimeters);
        return centimeters;

    }

}
