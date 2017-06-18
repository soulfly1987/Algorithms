public class TriangularNumbers {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(n + "th triangular number is: " + findTriangularNumber(n));
    }

    private static int findTriangularNumber(int n) {
        if (n == 1) return 1;   //situacija kada je n == 0 ne postoji!
        return n + findTriangularNumber(n - 1);
    }
}
