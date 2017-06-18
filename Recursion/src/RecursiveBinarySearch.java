
public class RecursiveBinarySearch {
    private static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static int key = 4;
    private int anInt;

    public static void main(String[] args) {
//        System.out.println("Found number " + key + " at index: " + binarySearch(arr, key));
        System.out.println("Found number " + key + " at index: " + recursiveBinarySearch(arr, key, 0, arr.length - 1));
    }

    private static int binarySearch(int[] arr, int key) {
        int lowerBound = 0;
        int upperBound = arr.length - 1;
        int middleIndex;

        while (lowerBound <= upperBound) {
            middleIndex = (lowerBound + upperBound) / 2;

            if (arr[middleIndex] == key) {
                return middleIndex;
            } else if (arr[middleIndex] > key) {
                upperBound = middleIndex - 1;
            } else if (arr[middleIndex] < key) {
                lowerBound = middleIndex + 1;
            }
        }
        return -1;
    }

    private static int recursiveBinarySearch(int[] arr, int key, int lowerBound, int upperBound) {

        int middleIndex = (lowerBound + upperBound) / 2;

        if (arr[middleIndex] == key) {
            return middleIndex;
        } else if (lowerBound > upperBound) {
            return -1;
        } else {
            if (arr[middleIndex] > key) {
                return recursiveBinarySearch(arr, key, lowerBound, middleIndex - 1);
            } else {
                return recursiveBinarySearch(arr, key, middleIndex + 1, upperBound);
            }
        }
    }

}
