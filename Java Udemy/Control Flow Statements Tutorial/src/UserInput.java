import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);     //Create new scanner object

        System.out.println("What is your name?");      //Ask user for name, collect input
        String name = scanner.nextLine();

        System.out.println("In what year were you born?"); //Ask user for year of birth, collect input
        boolean validInteger = scanner.hasNextInt();   //Make sure input is an integer

        if (validInteger) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();                     //Account for ENTER key being pressed and creating new line

            int age = 2018 - yearOfBirth;    //Calculate age

            if (age >= 0 && age <= 50) {
                System.out.println("Your name is " + name + " and you are " + age + " years old.");
            } else {
                System.out.println("Enter valid year of birth");
            }
        } else {
            System.out.println("Enter valid year of birth");
        }


        int counter = 1;
        int sum = 0;
        while (counter <= 10) {
            System.out.println("Enter number #" + counter);
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }
        System.out.println("The total of the ten numbers entered is " + sum);


        int currentMin = 0;
        int currentMax = 0;
        boolean firstValue = true;
        while (true) {
            System.out.println("Enter number");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (firstValue) {
                    currentMin = value;
                    currentMax = value;
                } else if (value < currentMin) {
                    currentMin = value;
                } else if (value > currentMax) {
                    currentMax = value;
                }

                firstValue = false;

            } else {
                break;
            }
        }

        if (firstValue) {
            System.out.println("No valid number was entered");
        } else {

            System.out.println("The maximum value was " + currentMax);
            System.out.println("The minimum value was " + currentMin);

        }

        scanner.close(); //Close scanner

    }

}
