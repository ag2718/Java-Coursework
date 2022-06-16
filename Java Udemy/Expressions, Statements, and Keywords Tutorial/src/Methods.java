public class Methods {

    public static void main(String[] args) {

        calculateScore(true, 10.5, 4.8);
        calculateScore(false, 18.9, 10.8);       //Method can be called by its name and parameters



        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Bob", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Jake", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Tommy", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Joe", position);

    }

    public static double calculateScore(boolean isStraight, double accuracy, double time){

        double totalScore = 4 * accuracy + 2 * time;
        if (isStraight) {                                        //Create a method w/ parameters, and do all calculations
            totalScore -= 25;
        }

        return totalScore;

    }

    public static void displayHighScorePosition (String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition (int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        //If all condiitons fail, position will be 4

        return position;
    }


}

