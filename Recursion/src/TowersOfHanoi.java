public class TowersOfHanoi {
    public static void main(String[] args) {
        int numberOfDiscs = 5;
        solveTOH(numberOfDiscs, 'A', 'B', 'C');
    }

    private static void solveTOH(int numberOfDiscs, char from, char using, char to) {
        if (numberOfDiscs == 1)
            System.out.println("Move disc 1 from: " + from + " to: " + to);
        else {
            solveTOH(numberOfDiscs - 1, from, to, using);
            System.out.println("Move disc " + numberOfDiscs + " from: " + from + " to: " + to + " using: " + using);
            solveTOH(numberOfDiscs - 1, using, from, to);
        }

    }
}
