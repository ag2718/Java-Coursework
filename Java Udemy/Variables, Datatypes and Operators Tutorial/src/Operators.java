public class Operators {
    public static void main(String[] args) {

        int remainder = 5 % 3; //Remainder of 5 divided by 3
        System.out.println(remainder);

        int result = 15/5;
        System.out.println(result);
        result++;                     //Add one to result
        System.out.println(result);
        result += 5;                  //Add five to result
        System.out.println(result);
        result *= 2;                  //Double result
        System.out.println(result);
        result /= 6;                  //Divide result by four
        System.out.println(result);
        result -= 3;                   //Subtract three from result
        System.out.println(result);
        result--;                      //Subtract one from result
        System.out.println(result);

        boolean isCorrect = true;
        if (isCorrect == true) //Check if correct is equal to true
            System.out.println("You got the correct answer!");
        if (isCorrect != true) //Check if correct is not equal to true
            System.out.println("You didn't get the correct answer");

        int oldHighScore = 120;
        int newScore = 150;
        if (newScore > oldHighScore) //Check if newScore is greater than oldHighScore
            System.out.println("You beat the highscore!");
        if (newScore <= oldHighScore) //Check if newScore is less than or equal to oldHighScore
            System.out.println("You didn't beat the highscore.");

        if ((isCorrect == true) && (newScore > oldHighScore))  //Both conditions have to be true
            System.out.println("You got the question correct and beat the highscore!");
        if ((isCorrect == false) || (newScore <= oldHighScore)) //One condition has to be true
            System.out.println("Try again.");

        boolean wasCorrect = isCorrect ? true : false; //Shortcut for if statement
        if (wasCorrect)
            System.out.println("You got the question correct before.");

        double firstAddend = 20;
        double secondAddend = 80;
        double total = (firstAddend + secondAddend) * 25;
        System.out.println("Total = " + total);
        double theRemainder = total % 40;
        if (theRemainder <= 20)
            System.out.println("Total was over the limit.");



    }
}
