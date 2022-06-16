public class Switch {
    public static void main(String[] args) {

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");     //Can only test one variable or value w/ switch statement
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("It was a 3, 4, or a 5");
                System.out.println("Actually, it was a " + switchValue);
                break;

            default:
                System.out.println("Not 1, 2, 3, 4, or 5");     //Default value, if all cases fail
                break;
        }

        char switchChar = 'F';

        switch (switchChar) {
            case 'A':
                System.out.println("Found A");
                break;

            case 'B':
                System.out.println("Found B");
                break;

            case 'C':
                System.out.println("Found C");
                break;

            case 'D':
                System.out.println("Found D");
                break;

            case 'E':
                System.out.println("Found E");
                break;

            default:
                System.out.println("Value not found");
                break;
        }

        String month = "JanUarY";

        switch (month.toLowerCase()) {         //String method .toLowerCase() puts all characters to lowercase

            case "december":
            case "january":
            case "february":
                System.out.println("It's winter!");
                break;

            default:
                System.out.println("It's not winter.");
                break;
        }

        printDayOfTheWeek(6);
    }

    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }

    }

}