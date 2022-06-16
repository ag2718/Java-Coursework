public class RecursionExercises {
    public static void main(String[] args) {

    }

    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static int sum(int n) {
        if (n == 0)
            return 0;
        return n + sum(n - 1);
    }

    public static int power(int x, int y) {
        if (y == 0)
            return 1;
        return x * power(x, y - 1);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static int reverse(int num) {
        if (num / 10 == 0)
            return num;
        return (num % 10) + reverse(num / 10);
    }
}
