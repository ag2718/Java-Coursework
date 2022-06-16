public class Loops {

    public static void main(String[] args) {

        for (int i = 8; i > 1; i--) {
            System.out.println("Interest at " + i + "% for $10,000 is " + calculateInterest(10000, i));
        }

        int count = 0;
        for (int i = 10; i < 50; i++) {

            if(isPrime(i)) {
                System.out.println(i);
                count++;

                if (count > 9) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }


        //Sum 3 and 5 Challenge

        count = 0;
        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println(i + " is divisible by 3 and 5");
            }

            if (count >= 5) {
                break;
            }
        }

        System.out.println("The sum of the first five numbers divisible by three and five is " + sum);


        System.out.println(sumOdd(0, 16));
        System.out.println(sumDigits(32122121));

        System.out.println(getLargestPrime(21));

        printSquareStar(5);

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * interestRate/100);
    }


    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


    public static boolean isOdd (int number) {

        if (number <= 0) {
            return false;
        }

        return (number % 2 == 1);
    }

    public static int sumOdd (int start, int end) {

        int sum = 0;

        if (start > end || start < 0) {
            return -1;
        }


        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static int sumDigits (int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }

    public static int getLargestPrime (int number) {

        if (number < 0) {
            return -1;
        }

        for (int i = 2; i <= number; i++) {
            if (i == number) {
                return -1;
            }

            if (number % i == 0) {
                break;
            }
        }

        int largestPrime = 0;

        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                for (int j = 2; j <= i; j++) {
                    if (j == i) {
                        return i;
                    }
                    if (i % j == 0) {
                        break;
                    }
                }
            }
        }

        return largestPrime;

    }

    public static void printSquareStar (int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int i = 1; i <= number; i++) {
                System.out.print("* ");
            }

        }
    }
}


