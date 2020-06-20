package PackageChallenge;

/**
 * @author mingyux
 */
public class Series {
    public static void main(String[] args) {
        System.out.println("test");
    }
    public int nSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + nSum(n - 1);
    }

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
