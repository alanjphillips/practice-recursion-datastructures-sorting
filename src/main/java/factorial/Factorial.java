package factorial;


public class Factorial {

    public static long factorialIterative(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must greater than Zero");
        }

        long result = 1;

        while (n >= 1) {
            result = result * n;
            n--;
        }

        return result;
    }

    public static long factorial(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must greater than Zero");
        }

        if (n == 1) return n;

        return n * factorial(n - 1);
    }
}
