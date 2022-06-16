package code;

import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {

    public static int amountOfGuesses;
    public static int max = 100;

    static Scanner input = new Scanner(System.in);
    static Scanner total = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {
        GuessMyNumber.game(max);
    }

    private static void game(int max) {
        int randomInt = random.nextInt(max);
        System.out.print("How many guesses do you need to Guess My Number?");
        amountOfGuesses = total.nextInt();

        System.out.println("You have " + amountOfGuesses + " guesses. Guess a number between 1 and " + max + " (no decimals).");

        int userGuess = input.nextInt();
        do {
            if (userGuess < randomInt) {
                amountOfGuesses--;
                System.out.println("Too low, guess again! Number of guesses left: " + amountOfGuesses);
                userGuess = input.nextInt();
            } else if (userGuess > randomInt) {
                amountOfGuesses--;
                System.out.println("Too high, guess again! Number of guesses left: " + amountOfGuesses);
                userGuess = input.nextInt();
            }
        } while(userGuess != randomInt && amountOfGuesses > 0);

        if(userGuess == randomInt) {
            GuessMyNumber.win(amountOfGuesses);
        } else {
            GuessMyNumber.lose();
        }

    }

    private static void win(int amountOfGuesses) {
        System.out.println("You won with " + amountOfGuesses + " left!");
    }

    private static void lose() {
        System.out.println("No Dice");
    }
}
