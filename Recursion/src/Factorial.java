public class Factorial {
    private static int n = 5;

    public static void main(String[] args) {
        System.out.println("Factorial of number " + n + " is: " + factorail(n));
    }

    private static int factorail(int n) {
        if (n == 0) return 1;
        return n * factorail(n - 1);
    }
}
