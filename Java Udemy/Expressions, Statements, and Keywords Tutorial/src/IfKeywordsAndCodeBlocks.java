public class IfKeywordsAndCodeBlocks {
    public static void main(String[] args) {

        int score = 5000;
        int bonus = 100;
        boolean gameOver = true;

        if (score >= 5000) {
            System.out.println("Three stars!");
        } else if (score > 1000){                                 //Basic formatting/syntax of if/else statements
            System.out.println("You passed the level");
        } else {
            System.out.println("Try again.");
        }

        if (gameOver) {
            int finalScore = score + bonus;     //variable finalScore can't be accessed outside of if-statement, declared inside if-statement
            System.out.println("Final score = " + finalScore);
        }




    }
}
