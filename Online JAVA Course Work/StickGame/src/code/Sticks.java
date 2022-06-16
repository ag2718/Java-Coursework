package code;

import java.util.Scanner;
import java.util.Random;

public class Sticks {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        game();
    }

    private static void game() {
        String playAgain = "y";
        while(playAgain.equalsIgnoreCase("y")) {

            System.out.println("Do not have the last stick!");
            System.out.println("Do you want to go first? (y/n)");
            int numSticks = 21;
            int sticksTaken = 0;
            String answer = " ";
            boolean playersTurn = false;
            answer = input.next();

            if(answer.equalsIgnoreCase("y")) {
                playersTurn = true;
            }

            while(numSticks >= 0) {
                if(playersTurn == true) {
                    System.out.println(numSticks + " are remaining.");
                    System.out.println("Do you want to take 1 stick or 2 sticks?");
                    sticksTaken = input.nextInt();
                    if(sticksTaken >= 2){
                        sticksTaken = 2;
                    } else {
                        sticksTaken = 1;
                    }

                    numSticks -= sticksTaken;
                    System.out.println(numSticks + " are remaining.");

                    if(numSticks == 1) {
                        System.out.println("You win!");
                        break;
                    } else if (numSticks <= 0) {
                        System.out.println("You lose!");
                        break;
                    }

                    playersTurn = false;
                } else {
                    int randomInt = rand.nextInt(2);
                    randomInt += 1;
                    if (numSticks == 2) {
                        numSticks -= 1;
                        System.out.println("The computer took 1 stick.");
                    } else if (numSticks == 3) {
                        numSticks -= 2;
                        System.out.println("The computer took 2 sticks");
                    } else {
                        numSticks -= randomInt;
                        System.out.println("The computer took " + randomInt + " sticks.");
                    }
                    playersTurn = true;
                }
            }

            System.out.println("Would you like to play again? (y/n)");
            playAgain = input.next();
            if(playAgain.equalsIgnoreCase("n")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }


}


