public class MergeSort {

    public static void main(String args[]) {

        int array[] = {7, 1, 8, 2, 0, 12, 10, 7, 5, 3};
        System.out.println("Before sort:");
        displayArray(array);

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array);

        System.out.println();
        System.out.println("After sort:");
        displayArray(array);
    }

    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int left, int right) {

        if (left < right) {

            //split the array into 2
            int center = (left + right) / 2;

            //sort the left and right array
            mergeSort(array, left, center);
            mergeSort(array, center + 1, right);

            //merge the result
            merge(array, left, center + 1, right);
        }
    }

    private void merge(int[] array, int leftArrayBegin,
                       int rightArrayBegin, int rightArrayEnd) {

        int leftArrayEnd = rightArrayBegin - 1;

        int numElements = rightArrayEnd - leftArrayBegin + 1;
        int[] resultArray = new int[numElements];
        int resultArrayBegin = 0;

        // Find the smallest element in both these array and add it to the result
        // array i.e you may have a array of the form [1,5] [2,4]
        // We need to sort the above as [1,2,4,5]
        while (leftArrayBegin <= leftArrayEnd && rightArrayBegin <= rightArrayEnd) {
            if (array[leftArrayBegin] <= array[rightArrayBegin]) {
                resultArray[resultArrayBegin++] = array[leftArrayBegin++];
            } else {
                resultArray[resultArrayBegin++] = array[rightArrayBegin++];
            }
        }

        // After the main loop completed we may have few more elements in
        // left array copy them first
        while (leftArrayBegin <= leftArrayEnd) {
            resultArray[resultArrayBegin++] = array[leftArrayBegin++];
        }

        // After the main loop completed we may have few more elements in
        // right array copy them
        while (rightArrayBegin <= rightArrayEnd) {
            resultArray[resultArrayBegin++] = array[rightArrayBegin++];
        }

        // Copy resultArray back to the main array
        for (int i = numElements - 1; i >= 0; i--) {
            array[rightArrayEnd--] = resultArray[i];
        }
    }

    public static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
